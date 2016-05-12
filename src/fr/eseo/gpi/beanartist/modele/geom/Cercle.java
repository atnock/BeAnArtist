package fr.eseo.gpi.beanartist.modele.geom;
import fr.eseo.gpi.beanartist.modele.geom.Ellipse;
//import fr.eseo.gpi.beanartist.modele.geom.Forme ;

import fr.eseo.gpi.beanartist.modele.geom.Point;


public class Cercle extends Ellipse {
	public static final int HAUTEUR_PAR_DEFAUT=150;
	//Constructeurs

	public Cercle(Point centre,int hauteur){ //test 
		super(centre,hauteur, hauteur); 
	}
	public Cercle (int x, int y, int hauteur){ //test 
		this(new Point(x,y), hauteur);
	}
	
	public Cercle(int hauteur){
		this(new Point(), hauteur);
	}
	public Cercle (Point centre){
		this(centre, HAUTEUR_PAR_DEFAUT);
	}
	public Cercle(){
		this(new Point(), HAUTEUR_PAR_DEFAUT);
	}
	
	public void setHauteur(int hauteur){
		super.setHauteur(hauteur);
		super.setLargeur(hauteur);
	}
	
	public void setLargeur(int largeur){
		super.setLargeur(largeur);
		super.setHauteur(largeur);
	}

	public double périmètre(){
		return Math.PI*this.getHauteur();
	}
	
	public String toString (){
		return (super.toString());
	}
}