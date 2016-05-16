package fr.eseo.gpi.beanartist.controleur.outils;

import java.awt.Color;

import fr.eseo.gpi.beanartist.modele.geom.Carré;
import fr.eseo.gpi.beanartist.vue.geom.VueCarré;
import fr.eseo.gpi.beanartist.vue.ui.PanneauDessin;

public class OutilCarré extends OutilForme{
	
	public OutilCarré(PanneauDessin newPanneauDessin){
		super(newPanneauDessin);
		System.out.println("Outil ligne");
	}
	
	protected VueCarré créerVueForme(){
		int xDebut = super.getDébut().getX();
		int xFin = super.getFin().getX();
		int yDebut = super.getDébut().getY();
		int yFin = super.getFin().getY();
		Carré carré = new Carré(Math.min(xDebut, xFin),Math.min(yDebut, yFin),Math.abs(xFin-xDebut));
		VueCarré vueCarré = new VueCarré(carré, Color.GREEN, false);
		vueCarré.setRempli(super.getPanneauDessin().getModeRemplissage());
		System.out.println(carré);
		return vueCarré;
	}
}
