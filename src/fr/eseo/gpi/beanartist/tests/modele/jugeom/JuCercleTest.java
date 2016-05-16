package fr.eseo.gpi.beanartist.tests.modele.jugeom;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.eseo.gpi.beanartist.modele.geom.Point;
import fr.eseo.gpi.beanartist.modele.geom.Carré;
import fr.eseo.gpi.beanartist.modele.geom.Cercle;

public class JuCercleTest {
	
	@Test
	public void testConstructeurCentreHauteur() { 
		Point p= new Point (2,4);
		Cercle c = new Cercle(p,5); 
		assertEquals("vérification de la hauteur :", 5, c.getHauteur());
		assertEquals("vérification du centre en x :", 2, c.getX());
		assertEquals("vérification du centre en y :", 4, c.getY());
	}
	@Test
	public void testConstructeurPointHauteur() { 
		Cercle c = new Cercle(2,4,5); 
		assertEquals("vérification de la hauteur :", 5, c.getHauteur());
		assertEquals("vérification du centre en x :", 2, c.getX());
		assertEquals("vérification du centre en y :", 4, c.getY());
	}
	@Test
	public void testConstructeurHauteur() { 
		Cercle c = new Cercle(5); 
		assertEquals("vérification de la hauteur :", 5, c.getHauteur());
		assertEquals("vérification du centre en x :", 0, c.getX());
		assertEquals("vérification du centre en y :", 0, c.getY());
	}
	@Test
	public void testConstructeurCentre() { 
		Point p = new Point (2,4);
		Cercle c = new Cercle(p); 
		assertEquals("vérification de la hauteur :", 150, c.getHauteur());
		assertEquals("vérification du centre en x :", 2, c.getX());
		assertEquals("vérification du centre en y :", 4, c.getY());
	}
	@Test
	public void testConstructeurVide() { 
		Cercle c = new Cercle(); 
		assertEquals("vérification de la hauteur :", 150, c.getHauteur());
		assertEquals("vérification du centre en x :", 0, c.getX());
		assertEquals("vérification du centre en y :", 0, c.getY());
	}
	@Test
	public void testGetSet() {
		Cercle c = new Cercle(5);
		assertEquals("vérification de la largeur :", 5, c.getLargeur());
		assertEquals("vérification de la hauteur :", 5, c.getHauteur());
		c.setHauteur(10);
		assertEquals("vérification de la largeur :", 10, c.getLargeur());
		assertEquals("vérification de la hauteur :", 10, c.getHauteur());
		c.setLargeur(15);
		assertEquals("vérification de la largeur :", 15, c.getLargeur());
		assertEquals("vérification de la hauteur :", 15, c.getHauteur());
	}
	public void testCalculPerimetre() { 
		Cercle c = new Cercle(5);
		assertSame("vérification du calcul du périmètre :", 117.75, c.périmètre());
	}
}
