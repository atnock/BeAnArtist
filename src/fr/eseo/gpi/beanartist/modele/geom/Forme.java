package fr.eseo.gpi.beanartist.modele.geom;

public abstract class Forme {

	//Constantes de classe

	public static final int LARGEUR_PAR_DÉFAUT=150;
	public static final int HAUTEUR_PAR_DÉFAUT=150;

	// Variables d'instances
	
	private int largeur;
	private int hauteur;
	private Point position;

	//Constructeurs

	public Forme(Point position, int largeur, int hauteur){
		setPosition(position);
		setLargeur(largeur);
		setHauteur(hauteur);
	}
	
	public Forme(int x,int y,int largeur, int hauteur){
		this(new Point(x,y),largeur,hauteur);
	}

	public Forme(){
		this(new Point(),HAUTEUR_PAR_DÉFAUT,LARGEUR_PAR_DÉFAUT);
	}

	public Forme(int largeur,int hauteur){
		this(new Point(),largeur,hauteur);
	}

	public Forme(Point position){
		this(position,HAUTEUR_PAR_DÉFAUT,LARGEUR_PAR_DÉFAUT);
	}

	// Méthodes d'instances génériques de la classe abstraite Forme

	public Point getPosition(){
		return position;
	}

	public void setPosition(Point position){
		this.position=position;
	}

	public int getLargeur(){
		return largeur;
	}

	public void setLargeur(int largeur){
		this.largeur=largeur;
	}
	
	public int getHauteur(){
		return this.hauteur;
	}
	
	public void setHauteur(int hauteur){
		this.hauteur=hauteur;
	}

	public int getX(){
		return getPosition().getX();
	}
 
	public void setX(int x){
		position.déplacerVers(x,this.getY());
	}

	public int getY(){
		return getPosition().getY();
	}	

	public void setY(int y){
		position.déplacerVers(this.getX(),y);
	}
	
	public int getMaxX(){
		int max = getX()+this.largeur;
		if (max<this.getX()){
			max=this.getX();
		}
		return max;
		}

	public int getMaxY(){
		int max = getY()+this.hauteur;
		if (max<this.getY()){
			max=this.getY();
		}
		return max;
		}

	public int getMinX(){
		int min = getX();
		if (min>this.getX()+this.largeur){
			min=this.getX()+this.largeur;
		}
		return min;
		}
	
	public int getMinY(){
		int min = getY();
		if (min>this.getY()+this.hauteur){
			min=this.getY()+this.hauteur;
		}
		return min;
		}

	public void déplacerVers(int x,int y){
		Point point = new Point(x,y);
		setPosition(point);		
		}

	public void déplacerDe(int deltaX, int deltaY){
		this.position.déplacerDe(deltaX,deltaY);
		}

	public String toString(){
		String description;
			description="["+this.getClass().getSimpleName()+"] pos: ("+getX()+","+getY()+") , dim : " +
						this.getLargeur()+" x "+this.getHauteur()+", périmètre : " + this.périmètre()+
						", aire: "+this.aire();
		return description;
	}

	//Méthodes abstraites

	public abstract double aire();

	public abstract double périmètre();
	
}
