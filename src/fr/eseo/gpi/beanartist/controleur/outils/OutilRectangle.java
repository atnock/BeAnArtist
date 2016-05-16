package fr.eseo.gpi.beanartist.controleur.outils;

import java.awt.Color;

import fr.eseo.gpi.beanartist.modele.geom.Rectangle;
import fr.eseo.gpi.beanartist.vue.geom.VueRectangle;
import fr.eseo.gpi.beanartist.vue.ui.PanneauDessin;

public class OutilRectangle extends OutilForme{
	
	public OutilRectangle(PanneauDessin newPanneauDessin){
		super(newPanneauDessin);
		System.out.println("Outil ligne");
	}
	
	protected VueRectangle créerVueForme(){
		int xDebut = super.getDébut().getX();
		int xFin = super.getFin().getX();
		int yDebut = super.getDébut().getY();
		int yFin = super.getFin().getY();
		Rectangle rectangle = new Rectangle(Math.min(xDebut, xFin),Math.min(yDebut, yFin),Math.abs(xFin-xDebut),Math.abs(yFin-yDebut));
		VueRectangle vueRectangle = new VueRectangle(rectangle, Color.GREEN, false);
		vueRectangle.setRempli(super.getPanneauDessin().getModeRemplissage());
		System.out.println(rectangle);
		return vueRectangle;
	}
}
