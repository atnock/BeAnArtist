package fr.eseo.gpi.beanartist.vue.geom;

import java.awt.Color;

import fr.eseo.gpi.beanartist.modele.geom.Carré;

public class VueCarré extends VueRectangle{

	public VueCarré(Carré carré, boolean rempli) {
		super(carré, rempli);
	}
	public VueCarré(Carré carré, Color couleurLigne, boolean rempli){
		super(carré, couleurLigne, rempli);
	}

}
