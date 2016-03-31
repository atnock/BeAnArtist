 package fr.eseo.gpi.beanartist.modele.geom;


 public class Carré extends Rectangle{

	
	//Constructeurs

	public Carré (Point position, int coté){
		super(position,coté , coté);
	}

	public Carré (int coté) {
		this(new Point(),coté);
	}
	
	public Carré (Point position){
		this(position,Forme.LARGEUR_PAR_DÉFAUT);
	}
	
	public Carré (){
		this(new Point(),Forme.LARGEUR_PAR_DÉFAUT);
	}

	public String toString (){
		return (super.toString());
	}
 }