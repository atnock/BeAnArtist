 package fr.eseo.gpi.beanartist.modele.geom;


 public class Carré extends Rectangle{

	//private int largeur;
	//private int hauteur;
	
	//Constructeurs

	public Carré (Point position, int coté){
		super(position,coté , coté);
	}

	public Carré (int coté) { // test 
		this(new Point(),coté);
	}
	
	public Carré (int x, int y, int coté) { //test  
		this(new Point(x, y), coté);
	}
	
	public Carré (Point position){ //test
		this(position,Forme.LARGEUR_PAR_DÉFAUT);
	}
	
	public Carré (){ //test
		this(new Point(),Forme.LARGEUR_PAR_DÉFAUT);
	}
	
	
	//getset
	
	public void setHauteur(int hauteur){ // test
		super.setHauteur(hauteur);
		super.setLargeur(hauteur);
	}
	
	public void setLargeur(int largeur){ //test
		super.setLargeur(largeur);
		super.setHauteur(largeur);
	}

	public String toString (){
		return (super.toString());
	}
 }