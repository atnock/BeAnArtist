package fr.eseo.gpi.beanartist.vue.geom;

import java.awt.Color;
import java.awt.Graphics2D;

import fr.eseo.gpi.beanartist.modele.geom.Ligne;

public class VueLigne extends VueForme {
	public VueLigne(Ligne ligne, boolean rempli){
		this(ligne, COULEUR_LIGNE_PAR_DÉFAUT, rempli);
	}
	
	public VueLigne(Ligne ligne, Color couleurLigne, boolean rempli){
		super(ligne, couleurLigne, rempli);
	}
	
	public void affiche(Graphics2D g2d){
		g2d.drawPolyline(new int[] {this.getForme().getX(), this.getForme().getLargeur()}, new int[] {this.getForme().getY(), this.getForme().getHauteur()}, 2);
	}
}