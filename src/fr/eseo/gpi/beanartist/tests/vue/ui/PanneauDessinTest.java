package fr.eseo.gpi.beanartist.tests.vue.ui;

import java.awt.Color;

import fr.eseo.gpi.beanartist.modele.geom.Rectangle;
import fr.eseo.gpi.beanartist.vue.geom.VueRectangle;
import fr.eseo.gpi.beanartist.modele.geom.Carré;
import fr.eseo.gpi.beanartist.modele.geom.Ligne;
import fr.eseo.gpi.beanartist.vue.geom.VueCarré;
import fr.eseo.gpi.beanartist.vue.geom.VueLigne;
import fr.eseo.gpi.beanartist.vue.ui.FenêtreBeAnArtist;
import fr.eseo.gpi.beanartist.vue.ui.PanneauDessin;

public class PanneauDessinTest {
	public static void main(String [] args){
		FenêtreBeAnArtist myfen = new FenêtreBeAnArtist("salut",500,1000,Color.RED);
		VueRectangle rect = new VueRectangle(new Rectangle(0,0,300,40), true);
		VueRectangle rect2 = new VueRectangle(new Rectangle(300,300,30,10), false);
		VueCarré carré = new VueCarré(new Carré(100,100,40), true);
		VueCarré carré2 = new VueCarré(new Carré(200,200,30), false);
		VueLigne ligne = new VueLigne(new Ligne(150,150,30,10), false);
		PanneauDessin panneauDessin = myfen.getPanneauDessin();
		panneauDessin.ajouterVueForme(rect);
		panneauDessin.ajouterVueForme(rect2);
		panneauDessin.ajouterVueForme(carré);
		panneauDessin.ajouterVueForme(carré2);
		panneauDessin.ajouterVueForme(ligne);
	}
}
