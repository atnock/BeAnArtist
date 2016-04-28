package fr.eseo.gpi.beanartist.modele.geom;

public class Point{
	private int coordX;
	private int coordY;

	public Point(int coordX, int coordY){
		this.coordX = coordX;
		this.coordY = coordY;
		System.out.println("yo4 " + toString());
	}

	public Point(){
		this(0,0);
	}
	
	public int getX() {
		return coordX;
	}

	public int getY() {
		return coordY;
	}
	
	public void setX(int X){
		this.coordX = X;
	}
	
	public void setY(int Y){
		this.coordY = Y;
	}
	
	public void déplacerVers(int coordX, int coordY){
		this.coordX = coordX;
		this.coordY = coordY;
	}

	public void déplacerDe(int vectX, int vectY){
		this.coordX +=vectX;
		this.coordY +=vectY;
	}
	
	public String toString(){
		return "("+getX()+","+getY()+")";
	}
}
