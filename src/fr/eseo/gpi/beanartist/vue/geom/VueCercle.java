package fr.eseo.gpi.beanartist.vue.geom;

import java.awt.Color;

import fr.eseo.gpi.beanartist.modele.geom.Cercle;

public class VueCercle extends VueEllipse{
	public VueCercle(Cercle cercle, boolean rempli) {
		super(cercle, rempli);
	}
	public VueCercle(Cercle cercle, Color couleurLigne, boolean rempli){
		super(cercle, couleurLigne, rempli);
	}
}
