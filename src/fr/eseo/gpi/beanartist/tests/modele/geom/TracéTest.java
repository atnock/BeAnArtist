package fr.eseo.gpi.beanartist.tests.modele.geom;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import fr.eseo.gpi.beanartist.modele.geom.Point;
import fr.eseo.gpi.beanartist.modele.geom.Tracé;

public class TracéTest {
	public static void main(String [] args){
		Tracé trace1 = new Tracé(new Point(15,20),new Point(34,89));
		Point pp = new Point(5,5);
		Point pc= new Point(15, 30);
		System.out.println(trace1.contient(184,235));
		System.out.println(trace1.contient(195,165));
		System.out.println(trace1.contient(165,235));
		System.out.println(trace1.périmètre());
		System.out.println(trace1.aire());
		System.out.println(trace1.toString());
		
		Tracé t = new Tracé(new Point(300, 200), new Point(119, 259));
		t.ajouterLigneVers(new Point(231, 105));
		DecimalFormat df = new DecimalFormat("#.##", DecimalFormatSymbols.getInstance());
		t.getLignes().size();
		t.toString();
		t.ajouterLigneVers(new Point(231, 295));
		t.getLignes().size();
		t.toString();
		t.ajouterLigneVers(new Point(119, 141));
		t.getLignes().size();
		t.toString();
		t.ajouterLigneVers(new Point(300, 200));
		t.getLignes().size();
		t.toString();
		Tracé test = new Tracé(new Point(40, 40), new Point(50, 40));
		test.getHauteur();
		test.getLargeur();
		test.ajouterLigneVers(new Point(50, 30));
		test.getHauteur();
		test.getLargeur();
		test.ajouterLigneVers(new Point(30, 30));
		test.getHauteur();
		test.getLargeur();
		test.ajouterLigneVers(new Point(30, 60));
		test.getHauteur();
		test.getLargeur();
		test.ajouterLigneVers(new Point(60, 60));
		test.getHauteur();
		test.getLargeur();
		test.ajouterLigneVers(new Point(60, 20));
	}
}
