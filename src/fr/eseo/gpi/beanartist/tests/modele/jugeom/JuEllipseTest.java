package fr.eseo.gpi.beanartist.tests.modele.jugeom;

import static org.junit.Assert.*;

import org.junit.Test;
import fr.eseo.gpi.beanartist.modele.geom.Ellipse;
import fr.eseo.gpi.beanartist.modele.geom.Point;

public class JuEllipseTest {

	@Test
	public void testConstructeurVide() { 
		Ellipse e = new Ellipse ();
		assertEquals("vérification de la largeur :", 150, e.getLargeur());
		assertEquals("vérification de la hauteur :", 150, e.getHauteur());
		assertEquals("vérification des coordonnées en X :", 0, e.getX());
		assertEquals("vérification des coordonnées en Y :", 0, e.getY());
	}
	@Test
	public void testConstructeurPositionLargeurHauteur() { 
		Point p = new Point(2,4);
		Ellipse e = new Ellipse (p, 10,15);
		assertEquals("vérification de la largeur :", 10, e.getLargeur());
		assertEquals("vérification de la hauteur :", 15, e.getHauteur());
		assertEquals("vérification des coordonnées en X :", 2, e.getX());
		assertEquals("vérification des coordonnées en Y :", 4, e.getY());
	}
	
	@Test
	public void testConstructeurLargeurHauteur() { 
		Ellipse e = new Ellipse (10,15);
		assertEquals("vérification de la largeur :", 10, e.getLargeur());
		assertEquals("vérification de la hauteur :", 15, e.getHauteur());
		assertEquals("vérification des coordonnées en X :", 0, e.getX());
		assertEquals("vérification des coordonnées en Y :", 0, e.getY());
	}
	@Test
	public void testConstructeurPosition() { 
		Point p = new Point(2,4);
		Ellipse e = new Ellipse (p);
		assertEquals("vérification de la largeur :", 150, e.getLargeur());
		assertEquals("vérification de la hauteur :", 150, e.getHauteur());
		assertEquals("vérification des coordonnées en X :",2, e.getX());
		assertEquals("vérification des coordonnées en Y :",4, e.getY());
	}
	@Test
	public void testConstructeurAll() { 
		Ellipse e = new Ellipse (2,4,10,15);
		assertEquals("vérification de la largeur :", 10, e.getLargeur());
		assertEquals("vérification de la hauteur :", 15, e.getHauteur());
		assertEquals("vérification des coordonnées en X :",2, e.getX());
		assertEquals("vérification des coordonnées en Y :",4, e.getY());
	}
	
	@Test
	public void testCalculAire() { 
		Ellipse e = new Ellipse (10,15);
		assertSame("vérification du calcul de l'aire :", 117.75, e.aire());
	}
	
	@Test
	public void testCalculPerimetre() { 
		Ellipse e = new Ellipse (10,15);
		assertSame("vérification du calcul du perimetre:", 39.6, e.périmètre());
	}
}
