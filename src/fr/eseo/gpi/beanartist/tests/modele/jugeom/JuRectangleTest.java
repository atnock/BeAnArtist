package fr.eseo.gpi.beanartist.tests.modele.jugeom;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.eseo.gpi.beanartist.modele.geom.Rectangle;
import fr.eseo.gpi.beanartist.modele.geom.Point;

public class JuRectangleTest {

	@Test
	public void testConstructeurVide() { //constructeur vide
		Rectangle r = new Rectangle ();
		assertEquals("vérification de la largeur :", 150, r.getLargeur());
		assertEquals("vérification de la hauteur :", 150, r.getHauteur());
	}
	
	@Test
	public void testConstructeurNonVidePoint() { 
		Rectangle r = new Rectangle (2,2,10,15);
		assertEquals("vérification de la largeur :", 10, r.getLargeur());
		assertEquals("vérification de la hauteur :", 15, r.getHauteur());
		assertEquals("vérification de la position :" , 2, r.getX());
		assertEquals("vérification de la position :" , 2, r.getY());
	}
	
	@Test
	public void testConstructeurNonVidePosition() { 
		Rectangle r = new Rectangle (10,15);
		assertEquals("vérification de la largeur :", 10, r.getLargeur());
		assertEquals("vérification de la hauteur :", 15, r.getHauteur());
		assertEquals("vérification de la position :" , 0, r.getX());
		assertEquals("vérification de la position :" , 0, r.getY());
	}
	
	@Test
	public void testConstructeurNonVidePositionHauteurLargeur() { 
		Point p = new Point (6,7);
		Rectangle r = new Rectangle (p,10,15);
		assertEquals("vérification de la largeur :", 10, r.getLargeur());
		assertEquals("vérification de la hauteur :", 15, r.getHauteur());
		assertEquals("vérification de la position :" , 6, r.getX());
		assertEquals("vérification de la position :" , 7, r.getY());
	}
	
	@Test
	public void testCalculAire() { 
		Rectangle r = new Rectangle (10,15);
		assertSame("verification de l'aire du rectangle :" ,150, r.aire());
		
	}
	@Test
	public void testCalculPerimetre() { 
		Rectangle r = new Rectangle (10,15);
		assertSame("verification du perimetre  du rectangle :" ,50, r.périmètre());
		
	}
	
	@Test
	public void testContientTrue() { 
		Rectangle r = new Rectangle (10,15);
		assertTrue("verification du contient du rectangle :" ,r.contient(5,8));
	}
	
	public void testContientFalse() { 
		Rectangle r = new Rectangle (10,15);
		assertFalse("verification du contient du rectangle :" ,r.contient(13,20));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
