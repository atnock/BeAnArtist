package fr.eseo.gpi.beanartist.modele.geom;

import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.List;

public class Tracé extends Forme{
	
	private List<Ligne> lignes;
	
	public Tracé(Point pos1, Point pos2){
		super(pos1, Math.abs(pos1.getX()-pos2.getX()),Math.abs(pos1.getY()-pos2.getY()) );
		lignes = new ArrayList<Ligne>();
		Ligne trace = new Ligne(pos1);
		trace.setP2(pos2);
		lignes.add(trace);
	}
	
	public void ajouterLigneVers(Point pos){
		lignes.add(new Ligne(lignes.get(lignes.size() - 1).getP2(),
				pos.getX() - lignes.get(lignes.size() - 1).getP2().getX(),
				pos.getY() - lignes.get(lignes.size() - 1).getP2().getY()));

		int oX = lignes.get(0).getMinX();
		int oY = lignes.get(0).getMinY();
		for (int i = 1; i < lignes.size(); i++) {
			if (lignes.get(i).getMinX() < oX)
				oX = lignes.get(i).getMinX();
			if (lignes.get(i).getMinY() < oY)
				oY = lignes.get(i).getMinY();
		}
		int maxX = lignes.get(0).getMaxX();
		int maxY = lignes.get(0).getMaxY();
		for (int i = 1; i < lignes.size(); i++) {
			if (lignes.get(i).getMaxX() > maxX)
				maxX = lignes.get(i).getMaxX();
			if (lignes.get(i).getMaxY() > maxY)
				maxY = lignes.get(i).getMaxY();
		}
		Point position = new Point(oX, oY);
		super.setPosition(position);
		super.setLargeur(maxX - oX);
		super.setHauteur(maxY - oY);
	}
	
	public void setX(int x){
		lignes.get(0).setX(x);
	}
	
	public void setY(int y){
		lignes.get(0).setY(y);
	}
	
	/*
	public void setHauteur(int newHauteur){
		if(lignes==null){
			super.setHauteur(newHauteur);
		} else {
			int coef = newHauteur / this.getHauteur();
			for(int i = 0; i < lignes.size(); i++){
				lignes.get(i).setHauteur(lignes.get(i).getHauteur()*coef);
			}
		}
	}
	
	public void setLargeur(int newLargeur){
		if(lignes==null){
			super.setLargeur(newLargeur);
		} else {
			int coef = newLargeur / this.getLargeur();
			for(int i = 0; i < lignes.size(); i++){
				lignes.get(i).setLargeur(lignes.get(i).getLargeur()*coef);
			}
		}
	}*/
	
	public void setLargeur(int newLargeur) {
		if (getLargeur() != 0) {
			double coef = (double) newLargeur / getLargeur();
			int oriX = getX();
			if (getLignes() != null) {
				for (Ligne l : getLignes()) {
					l.setX((int) ((l.getX() - oriX) * coef) + oriX);
					l.setLargeur((int) (l.getLargeur() * coef));
				}
			}
		}
		super.setLargeur(newLargeur);

	}

	public void setHauteur(int newHauteur) { 
		if (getHauteur() != 0) {
			double coef = (double) newHauteur / getHauteur();
			int oriY = getY();
			if (getLignes() != null) {
				for (Ligne l : getLignes()) {
					l.setY((int) ((l.getY() - oriY) * coef) + oriY);
					l.setHauteur((int) (l.getHauteur() * coef));
				}
			}
		}
		super.setHauteur(newHauteur);
	}
	
	
	public void setPosition(Point pos){
		int diffX=pos.getX()-getPosition().getX();
		int diffY=pos.getY()-getPosition().getY();
		this.déplacerDe(diffX, diffY);
	}
	
	public List<Ligne> getLignes(){
		return lignes;
	}
	
	public void déplacerDe(int deltaX, int deltaY){
		for(int i = 0; i < lignes.size(); i++){
			Point P1 = lignes.get(i).getP1();
			P1.setX(P1.getX()+deltaX);
			P1.setY(P1.getY()+deltaY);
			Point P2 = lignes.get(i).getP2();
			P2.setX(P2.getX()+deltaX);
			P2.setY(P2.getY()+deltaY);
		}
	}
	
	public void déplacerVers(int newX, int newY){
		setPosition(new Point(newX, newY));
	}
	 
	public boolean contient(int x, int y){
		return contient(new Point(x,y));
	}
	 
	public boolean contient(Point P){
		for(int i = 0; i < lignes.size(); i++){
			if(lignes.get(i).contient(P)){
				 return true;
			 }
		}
		return false;
	}
	
	public double périmètre(){
		double longueur = 0;
		for(int i = 0; i < lignes.size(); i++){
			longueur += lignes.get(i).périmètre();
		}
		return longueur;
	}
	
	public double aire(){
		return 0;
	}
	
	public String toString(){
		String description;
		DecimalFormat df =new DecimalFormat();
		df.setMinimumFractionDigits(0);
		df.setMaximumFractionDigits(2);
		df.setGroupingUsed(false);
		description="[Tracé] pos : ("+this.getX()+","+this.getY()+") dim : "+this.getLargeur()+" x "+this.getHauteur()+" longueur : "+df.format(this.périmètre())+" nbLignes : "+lignes.size();
		return description;
	}

		
}
