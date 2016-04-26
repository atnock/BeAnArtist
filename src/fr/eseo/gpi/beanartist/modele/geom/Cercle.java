package fr.eseo.gpi.beanartist.modele.geom;
import fr.eseo.gpi.beanartist.modele.geom.Ellipse;
//import fr.eseo.gpi.beanartist.modele.geom.Forme;
import fr.eseo.gpi.beanartist.modele.geom.Point;

public class Cercle extends Ellipse {
	public static final int HAUTEUR_PAR_DEFAUT=3;
	//Constructeurs

	public Cercle(Point centre,int hauteur){
		super(centre,hauteur, hauteur); 
	}
	public Cercle (int x, int y, int hauteur){
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
		this.setHauteur(hauteur);
	}
	
	public void setLargeur(int largeur){
		this.setLargeur(largeur);
	}
	
	public double périmètre(){
		return Math.PI*this.getHauteur();
	}
	
	public String toString (){
		return (super.toString());
	}
}