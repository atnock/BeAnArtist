package fr.eseo.gpi.beanartist.tests.modele.jugeom;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.eseo.gpi.beanartist.modele.geom.Ligne;
import fr.eseo.gpi.beanartist.modele.geom.Point;

public class JuLigneTest {

	@Test
	public void testConstructeurVide() { 
		Ligne l = new Ligne ();
		assertEquals("vérification de la largeur :", 150, l.getLargeur());
		assertEquals("vérification de la hauteur :", 150, l.getHauteur());
		assertEquals("vérification des coordonnées en X :", 0, l.getX());
		assertEquals("vérification des coordonnées en Y :", 0, l.getY());
	}
	@Test
	public void testConstructeurPoint() { 
		Point p = new Point(2,4);
		Ligne l = new Ligne (p);
		assertEquals("vérification de la largeur :", 150, l.getLargeur());
		assertEquals("vérification de la hauteur :", 150, l.getHauteur());
		assertEquals("vérification des coordonnées en X :", 2, l.getX());
		assertEquals("vérification des coordonnées en Y :", 4, l.getY());
	}
	@Test
	public void testConstructeurLargeurHauteur() { 
		Ligne l = new Ligne (10,15);
		assertEquals("vérification de la largeur :", 10, l.getLargeur());
		assertEquals("vérification de la hauteur :", 15, l.getHauteur());
		assertEquals("vérification des coordonnées en X :", 0, l.getX());
		assertEquals("vérification des coordonnées en Y :", 0, l.getY());
	}
	
	@Test
	public void testConstructeurAll() { 
		Point p = new Point(2,4);
		Ligne l = new Ligne (p,10,15);
		assertEquals("vérification de la largeur :", 10, l.getLargeur());
		assertEquals("vérification de la hauteur :", 15, l.getHauteur());
		assertEquals("vérification des coordonnées en X :", 2, l.getX());
		assertEquals("vérification des coordonnées en Y :", 4, l.getY());
	}
	@Test
	public void testConstructeurPositionLargeurHauteur() { 
		Ligne l = new Ligne (2,4,10,15);
		assertEquals("vérification de la largeur :", 10, l.getLargeur());
		assertEquals("vérification de la hauteur :", 15, l.getHauteur());
		assertEquals("vérification des coordonnées en X :", 2, l.getX());
		assertEquals("vérification des coordonnées en Y :", 4, l.getY());
	}
	
	@Test
	public void testCalculAire() { 
		Ligne l = new Ligne (10,15);
		assertSame("vérification du calcul l'aire :", 0.0, l.aire());
	}
	@Test
	public void testGetSet() { 
		Ligne l = new Ligne ();
		assertEquals("vérification de la largeur :", 150, l.getLargeur());
		assertEquals("vérification de la hauteur :", 150, l.getHauteur());
		l.setHauteur(10);
		assertEquals("vérification de la largeur :", 150, l.getLargeur());
		assertEquals("vérification de la hauteur :", 10, l.getHauteur());
		l.setLargeur(5);
		assertEquals("vérification de la largeur :", 5, l.getLargeur());
		assertEquals("vérification de la hauteur :", 10, l.getHauteur());
	}
	
	@Test
	public void testCalculPerimetre() { 
		Ligne l = new Ligne (10,15);
		assertSame("vérification du calcul l'aire :", 18.03, l.périmètre());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
