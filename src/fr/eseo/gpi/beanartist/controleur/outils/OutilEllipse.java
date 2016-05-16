package fr.eseo.gpi.beanartist.controleur.outils;

import java.awt.Color;

import fr.eseo.gpi.beanartist.modele.geom.Ellipse;
import fr.eseo.gpi.beanartist.vue.geom.VueEllipse;
import fr.eseo.gpi.beanartist.vue.ui.PanneauDessin;

public class OutilEllipse extends OutilForme{
	
	public OutilEllipse(PanneauDessin newPanneauDessin){
		super(newPanneauDessin);
	}
	
	protected VueEllipse créerVueForme(){
		int xDebut = super.getDébut().getX();
		int xFin = super.getFin().getX();
		int yDebut = super.getDébut().getY();
		int yFin = super.getFin().getY();
		Ellipse ellipse = new Ellipse(Math.min(xDebut, xFin),Math.min(yDebut, yFin),Math.abs(xFin-xDebut),Math.abs(yFin-yDebut));
		VueEllipse vueEllipse = new VueEllipse(ellipse, Color.GREEN, false);
		vueEllipse.setRempli(super.getPanneauDessin().getModeRemplissage());
		System.out.println(ellipse);
		return vueEllipse;
	}
}
