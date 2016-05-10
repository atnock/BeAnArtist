package fr.eseo.gpi.beanartist.controleur.outils;

import java.awt.event.MouseEvent;

import fr.eseo.gpi.beanartist.modele.geom.Point;
import fr.eseo.gpi.beanartist.vue.geom.VueForme;
import fr.eseo.gpi.beanartist.vue.ui.PanneauDessin;

public abstract class OutilForme extends Outil{
	
	public OutilForme(PanneauDessin newPanneauDessin){
		super(newPanneauDessin);
	}
	
	public void mouseClicked(MouseEvent event){
		System.out.println("sourie appuyée outil forme");
	}
	
	public void mouseReleased(MouseEvent event){
		super.setFin(new Point(event.getX(), event.getY()));
		VueForme maVue = this.créerVueForme();
		System.out.println("sourie released");
		System.out.println(maVue.getForme());
		super.getPanneauDessin().ajouterVueForme(maVue);
	}
	
	protected abstract VueForme créerVueForme();
}
