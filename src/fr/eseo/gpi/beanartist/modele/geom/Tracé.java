package fr.eseo.gpi.beanartist.modele.geom;

import java.util.ArrayList;

public class Tracé extends Forme{
	
	private ArrayList<Ligne> maTrace = new ArrayList<Ligne>();
	
	public Tracé(Point pos1, Point pos2){
		Ligne trace = new Ligne(pos1);
		trace.setP2(pos2);
		maTrace.add(trace);
	}
	
	public void ajouterLigneVers(Point position){
		Ligne trace = new Ligne(maTrace.get(maTrace.size()).getP2());
		trace.setP2(position);
		maTrace.add(trace);
	}
	
	public void setX(int x){
		maTrace.get(0).setX(0);
	}
	
	public void setY(int y){
		maTrace.get(0).setY(0);
	}
	 
	 public boolean contient(int x, int y){
		 return contient(new Point(x,y));
	 }
	 
	 public boolean contient(Point P){
		 for(int i = 0; i <= maTrace.size(); i++){
			 if(maTrace.get(i).contient(P)){
				 return true;
			 }
		 }
		 return false;
	 }
	
	public double périmètre(){
		double longueur = 0;
		for(int i = 0; i <= maTrace.size(); i++){
			longueur += maTrace.get(i).périmètre();
		}
		return longueur;
	}
	
	public double aire(){
		return 0;
	}
}
