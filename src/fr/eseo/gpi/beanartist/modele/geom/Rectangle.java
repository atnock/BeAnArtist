package fr.eseo.gpi.beanartist.modele.geom;

import fr.eseo.gpi.beanartist.modele.geom.Forme;
import fr.eseo.gpi.beanartist.modele.geom.Point;

public class Rectangle extends Forme{
	/*public int largeur;
	public int hauteur;
	public Point position;
	public int x;
	public int y;*/
	static final int DEFAULT_LARGEUR=5;
	static final int DEFAULT_HAUTEUR=6;
	
	//constructeurs
	/*
	public Forme(int x,int y,int largeur, int hauteur){
		this(new Point(x,y),largeur,hauteur);
	}

	public Forme(){
		this(new Point(),HAUTEUR_PAR_DEFAUT,LARGEUR_PAR_DEFAUT);
	}

	public Forme(int largeur,int hauteur){
		this(new Point(),largeur,hauteur);
	}

	public Forme(Point position){
		this(position,HAUTEUR_PAR_DEFAUT,LARGEUR_PAR_DEFAUT);
	}
	*/
	public Rectangle(Point position,int largeur, int hauteur){
		super(position, largeur, hauteur);
	}
	public Rectangle(int largeur, int hauteur){
		this(new Point(), largeur , hauteur);
	}
	public Rectangle(Point position){
		this(position , Forme.LARGEUR_PAR_DÉFAUT, Forme.HAUTEUR_PAR_DÉFAUT);
	}
	public Rectangle(){
		this(new Point(), Forme.LARGEUR_PAR_DÉFAUT, Forme.HAUTEUR_PAR_DÉFAUT);
	}
	public Rectangle (int x, int y , int largeur , int hauteur){
		this(new Point(x, y), largeur , hauteur);
	}
	/*
	//geters et seters
	public int getLargeur(){
		return this.largeur;
	}
	public int getHauteur(){
		return this.hauteur;
	}
	public Point getPosition(){
		return this.position;
	}
	public void setLargeur(int largeur){
		this.largeur=largeur;
	}
	public void setHauteur(int hauteur){
		this.hauteur=hauteur;
	}
	public void setPosition(Point position){
		this.position=position;
	}
	*/
	//méthodes
	public double aire(){
		return this.getHauteur()*this.getLargeur();
	}
	public double périmètre(){
		return 2*this.getLargeur()+2*this.getHauteur();
	}
	/*
	public void deplacerVers(int x,int y){
		Point point = new Point(x,y);
		this.position=point;
	}
	public void deplacerDe(int deltaX, int deltaY){
		Point point = new Point (x,y);
		this.x+=deltaX;
		this.y+=deltaY;
		this.position= point;
	}
	public void setPosX(int x){
		this.position.setX(x);
	}
	public void setPosY(int y){
		this.position.setX(y);
	}
	public int getPosX(){
		return this.position.getX();
	}
	public int getPosY(){
		return this.position.getY();
	}
	public void afficherInfo(){
		System.out.println("coordonné X :"+getPosX()+" coordonné Y :"+getPosY());
		System.out.println("taille :"+getLargeur()+"*"+getHauteur());
	}
	public String toString(){
		String s= "pos : ("+getPosX()+","+getPosY()+") dim : ("+getLargeur()+","+getHauteur()+")";
		s+="périmètre :" +calculPerimetre() +" aire : " +calculAire();
		return s;
	}*/
}