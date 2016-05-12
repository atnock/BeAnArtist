package fr.eseo.gpi.beanartist.tests.modele.jugeom;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.eseo.gpi.beanartist.modele.geom.Point;
import fr.eseo.gpi.beanartist.modele.geom.Cercle;

public class JuCercleTest {

	@Test
	public void testConstructeurCentreHauteur() { //fonction deplacer de
		Point p= new Point (2,4);
		Cercle c = new Cercle(p,5); 
		assertEquals("vérification de la hauteur :", 5, c.getHauteur());
		assertEquals("vérification du centre en x :", 2, c.getX());
		assertEquals("vérification du centre en y :", 4, c.getY());
	}
	@Test
	public void testConstructeurPointHauteur() { //fonction deplacer de
		Cercle c = new Cercle(2,4,5); 
		assertEquals("vérification de la hauteur :", 5, c.getHauteur());
		assertEquals("vérification du centre en x :", 2, c.getX());
		assertEquals("vérification du centre en y :", 4, c.getY());
	}
}
