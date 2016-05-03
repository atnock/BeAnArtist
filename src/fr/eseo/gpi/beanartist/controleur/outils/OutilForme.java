package fr.eseo.gpi.beanartist.controleur.outils;

import java.awt.event.MouseEvent;

import fr.eseo.gpi.beanartist.vue.geom.VueForme;
import fr.eseo.gpi.beanartist.vue.ui.PanneauDessin;

public abstract class OutilForme extends Outil{
	
	public OutilForme(PanneauDessin newPanneauDessin){
		super(newPanneauDessin);
	}
	
	public void mouseClicked(MouseEvent event){
		
	}
	
	public void mouseReleased(MouseEvent event){
		
	}
	
	protected abstract VueForme créerVueForme();
}
