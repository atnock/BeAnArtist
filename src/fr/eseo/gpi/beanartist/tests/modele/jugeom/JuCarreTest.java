package fr.eseo.gpi.beanartist.tests.modele.jugeom;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.eseo.gpi.beanartist.modele.geom.Carré;
import fr.eseo.gpi.beanartist.modele.geom.Point;
public class JuCarreTest {
	
	@Test
	public void testConstructeurCoté() { //constructeur vide
		Carré c = new Carré (5);
		assertEquals("vérification de la largeur :", 5, c.getLargeur());
		assertEquals("vérification de la hauteur :", 5, c.getHauteur());
		assertEquals("vérification de la position en x :", 0, c.getX());
		assertEquals("vérification de la position en y :", 0, c.getY());
	}
	
	@Test
	public void testConstructeurAll() { //constructeur vide
		Carré c = new Carré (1,2,5);
		assertEquals("vérification de la largeur :", 5, c.getLargeur());
		assertEquals("vérification de la hauteur :", 5, c.getHauteur());
		assertEquals("vérification de la position en x :", 1, c.getX());
		assertEquals("vérification de la position en y :", 2, c.getY());
	}

	@Test
	public void testConstructeurPosition() { //constructeur vide
		Point p = new Point (1,2);
		Carré c = new Carré (p);
		assertEquals("vérification de la largeur :", 150, c.getLargeur());
		assertEquals("vérification de la hauteur :", 150, c.getHauteur());
		assertEquals("vérification de la position en x :", 1, c.getX());
		assertEquals("vérification de la position en y :", 2, c.getY());
	}
	
	@Test
	public void testConstructeurVide() { //constructeur vide
		Carré c = new Carré ();
		assertEquals("vérification de la largeur :", 150, c.getLargeur());
		assertEquals("vérification de la hauteur :", 150, c.getHauteur());
		assertEquals("vérification de la position en x :", 0, c.getX());
		assertEquals("vérification de la position en y :", 0, c.getY());
	}
	
	@Test
	public void testGetSet() { //constructeur vide
		Carré c = new Carré ();
		c.setHauteur(10);
		c.setLargeur(5);
		assertEquals("vérification de la largeur :", 5, c.getLargeur());
		assertEquals("vérification de la hauteur :", 10, c.getHauteur());
	}
}