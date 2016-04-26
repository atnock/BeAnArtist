package fr.eseo.gpi.beanartist.tests.modele.geom;
import fr.eseo.gpi.beanartist.modele.geom.Point;
import fr.eseo.gpi.beanartist.modele.geom.Ellipse;


public class EllipseTest {
	public static void main(String [] args){
		Ellipse ellip1= new Ellipse();
		Ellipse ellip2= new Ellipse(2,5);
		Point point3= new Point();
		Ellipse ellip3= new Ellipse(point3);
		Ellipse ellip4= new Ellipse(point3,2,5);
		System.out.println(ellip1.toString());
		System.out.println(ellip2.calculPerimetre());
		System.out.println(ellip3.calculAire());
		System.out.println(ellip4.toString());
	}

}
