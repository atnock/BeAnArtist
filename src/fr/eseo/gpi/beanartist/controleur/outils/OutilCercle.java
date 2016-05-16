package fr.eseo.gpi.beanartist.controleur.outils;

import java.awt.Color;

import fr.eseo.gpi.beanartist.modele.geom.Cercle;
import fr.eseo.gpi.beanartist.vue.geom.VueCercle;
import fr.eseo.gpi.beanartist.vue.ui.PanneauDessin;

public class OutilCercle extends OutilForme{
	
	public OutilCercle(PanneauDessin newPanneauDessin){
		super(newPanneauDessin);
	}
	
	protected VueCercle créerVueForme(){
		int xDebut = super.getDébut().getX();
		int xFin = super.getFin().getX();
		int yDebut = super.getDébut().getY();
		int yFin = super.getFin().getY();
		Cercle cercle = new Cercle(Math.min(xDebut, xFin),Math.min(yDebut, yFin),Math.abs(xFin-xDebut));
		VueCercle vueCercle = new VueCercle(cercle, Color.GREEN, false);
		vueCercle.setRempli(super.getPanneauDessin().getModeRemplissage());
		System.out.println(cercle);
		return vueCercle;
	}
}
