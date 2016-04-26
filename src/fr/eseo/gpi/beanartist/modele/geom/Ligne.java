 package fr.eseo.gpi.beanartist.modele.geom;


 public class Ligne extends Forme{
	 public static final double EPSILON = 0.5;
	 
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
		 return this.getPosition();
	 }
	 
	 public Point getP2(){
		 Point P1 = this.getP1();
		 return new Point(P1.getX() + this.getLargeur(), P1.getY() + this.getHauteur());
	 }
	 
	 public void setP1(Point newPoint){
		 this.getP1().setX(newPoint.getX());
		 this.getP1().setY(newPoint.getY());
	 }
	 
	 public void setP2(Point newPoint){
		 Point P1 = this.getP1();
		 this.setHauteur(newPoint.getX() - P1.getX());
		 this.setLargeur(newPoint.getY() - P1.getY());
	 }
	 
	 public int getMaxX(){
			int max = getX()+this.getLargeur();
			if (max<this.getX()){
				max=this.getX();
			}
			return max;
		}

		public int getMaxY(){
			int max = getY()+this.getHauteur();
			if (max<this.getY()){
				max=this.getY();
			}
			return max;
		}

		public int getMinX(){
			int min = getX();
			if (min>this.getX()+this.getLargeur()){
				min=this.getX()+this.getLargeur();
			}
			return min;
		}
		
		public int getMinY(){
			int min = getY();
			if (min>this.getY()+this.getHauteur()){
				min=this.getY()+this.getHauteur();
			}
			return min;
		}
	 
	 public double périmètre(){
		 int x = this.getLargeur();
		 int y = this.getHauteur();
		 return Math.sqrt(x*x+y*y);
	 }
	 
	 private double sqr(double x){
		 return x*x;
	 }
	 
	 private double distance(int x1, int x2, int y1, int y2){
		 return Math.sqrt(sqr(y2 - y1) + sqr(x2 - x1));
	 }
	 
	 public boolean contient(int x, int y){
		 return contient(new Point(x,y));
	 }
	 
	 public boolean contient(Point P){
		 Point P1 = this.getP1();
		 Point P2 = this.getP2();
		 double distanceP1P = Math.abs(distance(P1.getX(), P.getX(), P1.getY(), P.getY()));
		 double distanceP2P = Math.abs(distance(P.getX(), P2.getX(), P.getY(), P2.getY()));
		 double distanceP1P2 = Math.abs(distance(P1.getX(), P2.getX(), P1.getY(), P2.getY()));
		 return distanceP1P + distanceP2P - distanceP1P2 <= EPSILON;
	 }
	 
	 public String toString(){
		 return "Je suis une ligne";
	 }
 }