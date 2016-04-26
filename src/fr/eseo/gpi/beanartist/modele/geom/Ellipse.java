package fr.eseo.gpi.beanartist.modele.geom;

import fr.eseo.gpi.beanartist.modele.geom.Forme;
import fr.eseo.gpi.beanartist.modele.geom.Point;

public class Ellipse extends Forme {

	public Ellipse (){
		super();
	}

	public Ellipse(Point position, int largeur, int hauteur) {
		super(position,largeur,hauteur);
	}

	public Ellipse (int largeur,int hauteur){
		super(largeur,hauteur);
	}

	public Ellipse (Point position){
		super(position);
	}
	public Ellipse (int x , int y , int largeur , int hauteur){
		super(new Point (x, y), largeur , hauteur );
	}

	
	public double aire(){
		return (double)Math.PI * getLargeur() * getHauteur();
	}

	public double périmètre(){
		return  2*(double)Math.PI*(double)Math.sqrt(0.5*((double)Math.pow(getLargeur()/2,2)+(double)Math.pow(getHauteur()/2,2)));
	}
	public boolean contient(int x, int y){
		int a = this.getLargeur();
		int b = this.getHauteur();
		return ((x*x)/(a*a) + (y*y)/(b*b)) <= 1;
	}
	
	public boolean contient(Point testPosition){
		int x = testPosition.getX();
		int y = testPosition.getY();
		int a = this.getLargeur();
		int b = this.getHauteur();
		return ((x*x)/(a*a) + (y*y)/(b*b)) <= 1;
	}
}


