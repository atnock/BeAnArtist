 package fr.eseo.gpi.beanartist.modele.geom;


 public class Carré extends Rectangle{

	//private int largeur;
	//private int hauteur;
	
	//Constructeurs

	public Carré (Point position, int coté){
		super(position,coté , coté);
	}

	public Carré (int coté) {
		this(new Point(),coté);
	}
	
	public Carré (int x, int y, int coté) {
		this(new Point(x, y), coté);
	}
	
	public Carré (Point position){
		this(position,Forme.LARGEUR_PAR_DÉFAUT);
	}
	
	public Carré (){
		this(new Point(),Forme.LARGEUR_PAR_DÉFAUT);
	}
	
	
	//getset
	
	public void setHauteur(int hauteur){
		super.setHauteur(hauteur);
		super.setLargeur(hauteur);
	}
	
	public void setLargeur(int largeur){
		super.setLargeur(largeur);
		super.setHauteur(largeur);
	}

	public String toString (){
		return (super.toString());
	}
 }