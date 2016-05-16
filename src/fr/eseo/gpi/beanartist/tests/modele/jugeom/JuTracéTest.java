package fr.eseo.gpi.beanartist.tests.modele.jugeom;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.eseo.gpi.beanartist.modele.geom.Tracé;
import fr.eseo.gpi.beanartist.modele.geom.Point;

public class JuTracéTest {

	@Test
	public void testLargeurHauteur() { 
		Point p1 = new Point(2,4);
		Point p2 = new Point(6,8);
		Tracé t= new Tracé(p1, p2);
		assertEquals("vérification de la largeur :", 4, t.getLargeur());
		assertEquals("vérification de la hauteur :", 4, t.getHauteur());
	}
	
	@Test
	public void testGetSet() { 
		Point p1 = new Point(2,4);
		Point p2 = new Point(6,8);
		Point p3= new Point();
		Tracé t= new Tracé(p1, p2);
		t.setX(5);
		assertEquals("vérification de la largeur :", 4, t.getLargeur());
		assertEquals("vérification de la hauteur :", 4, t.getHauteur());
		t.setY(10);
		assertEquals("vérification de la largeur :", 4, t.getLargeur());
		assertEquals("vérification de la hauteur :", 4, t.getHauteur());
		t.setPosition(p3);
		assertEquals("vérification de la largeur :", 4, t.getLargeur());
		assertEquals("vérification de la hauteur :", 4, t.getHauteur());
		
	}
	

}
