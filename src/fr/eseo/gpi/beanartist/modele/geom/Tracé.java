package fr.eseo.gpi.beanartist.modele.geom;

import java.util.ArrayList;
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
	
	public void ajouterLigneVers(Point position){
		Ligne trace = new Ligne(lignes.get(lignes.size()).getP2());
		trace.setP2(position);
		lignes.add(trace);
	}
	
	public void setX(int x){
		lignes.get(0).setX(x);
	}
	
	public void setY(int y){
		lignes.get(0).setY(y);
	}
	
	public void setHauteur(int newHauteur){
		if(lignes==null){
			super.setLargeur(newHauteur);
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
	}
	
	public void setPosition(Point pos){
		if(lignes==null){
			super.setPosition(pos);
		} else {
			this.déplacerVers(pos.getX(), pos.getY());
		}
		
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
		déplacerDe(lignes.get(0).getX()-newX, lignes.get(0).getY()-newY);
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
		return "[Tracé] pos : ("+this.getX()+","+this.getY()+") dim : "+this.getHauteur()+" x "+this.getLargeur()+" longueur : "+this.périmètre()+" nbLignes : "+lignes.size();
	}
}
