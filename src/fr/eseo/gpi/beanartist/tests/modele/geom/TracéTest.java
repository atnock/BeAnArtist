package fr.eseo.gpi.beanartist.tests.modele.geom;

import fr.eseo.gpi.beanartist.modele.geom.Point;
import fr.eseo.gpi.beanartist.modele.geom.Tracé;

public class TracéTest {
	public static void main(String [] args){
		Tracé trace = new Tracé(new Point(15,20),new Point(34,89));
		System.out.println(trace);
	}
}
