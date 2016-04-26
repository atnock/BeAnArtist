 package fr.eseo.gpi.beanartist.modele.geom;


 public class Ligne extends Forme{
	 public double EPSILON = 0.1;
	 
	 public Ligne(){
		 this(new Point(), 0, 0);
	 }
	 
	 public Ligne(Point point) {
		 this(point, 0, 0);
	 }
	 
	 public Ligne(int largeur, int hauteur){
		 this(new Point(), largeur, hauteur);
	 }
	 
	 public Ligne(int abs, int ord, int largeur, int hauteur){
		 this(new Point(abs, ord), largeur, hauteur);
	 }
	 
	 public Ligne(Point position, int largeur, int hauteur){
		 super(position, largeur, hauteur);
	 }
	 
	 public double aire(){
		 return 0;
	 }
	 
	 public Point getP1(){
		 return 
	 }
	 
	 public double périmètre(){
		 int x = this.getLargeur();
		 int y = this.getHauteur();
		 return Math.sqrt(x*x+y*y);
	 }
	 
	 public boolean contient(int x, int y){
		 return false;
	 }
	 
	 public boolean contient(Point testPosition){
		 return false;
	 }
	 
	 public String toString(){
		 return "Je suis une ligne";
	 }
 }