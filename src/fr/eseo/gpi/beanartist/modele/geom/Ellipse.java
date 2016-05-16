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
		return (double)Math.PI *0.5*getLargeur() * 0.5*getHauteur();
	}

	public double périmètre(){
		double a = 0.5*getHauteur();
		double b= 0.5*getLargeur();
		double h = ((a-b)/(a+b)*(a-b)/(a+b));
		double q = (3*h)/(10+ Math.sqrt(4-3*h));
		return (double)Math.PI*(a+b)*(1+q);
	}
	
	public boolean contient(int x, int y){
		//int a = this.getLargeur();
		//int b = this.getHauteur()
		return (x > this.getMinX() && x < this.getMinX() + this.getLargeur() && y > this.getMinY() && y < this.getMinY() + this.getHauteur());
		//return ((x*x)/(a*a) + (y*y)/(b*b)) <= 1;
	}
	
	public boolean contient(Point testPosition){
		int x = testPosition.getX();
		int y = testPosition.getY();
		return contient(x,y);
	}
}


