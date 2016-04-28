package fr.eseo.gpi.beanartist.tests.modele.jugeom;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.eseo.gpi.beanartist.modele.geom.Rectangle;

public class JuRectangleTest {

	@Test
	public void testConstructeurVide() { //constructeur vide
		Rectangle r1 = new Rectangle ();
		assertEquals("vérification de la largeur :", 150, r1.getLargeur());
		assertEquals("vérification de la hauteur :", 150, r1.getHauteur());
	}
}
