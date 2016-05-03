package fr.eseo.gpi.beanartist.controleur.outils;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import fr.eseo.gpi.beanartist.modele.geom.Point;
import fr.eseo.gpi.beanartist.vue.geom.VueForme;
import fr.eseo.gpi.beanartist.vue.ui.PanneauDessin;

public abstract class Outil {
	
	private PanneauDessin panneauDessin;
	private Point début;
	private Point fin;
	
	public Outil(PanneauDessin newPanneauDessin){
		this.panneauDessin = newPanneauDessin;
	}
	
	public void associer(PanneauDessin thePanneauDessin){
		this.libérer();
		this.panneauDessin = thePanneauDessin;
		thePanneauDessin.setOutilCourant(this);
	}
	
	public PanneauDessin getPanneauDessin(){
		return this.panneauDessin;
	}
	
	public void setPanneauDessin(PanneauDessin newPanneauDessin){
		this.panneauDessin = newPanneauDessin;
	}
	
	private void libérer(){
		this.panneauDessin.setOutilCourant(null);
		this.panneauDessin = null;
	}
	
	public void setDébut(Point point){
		this.début = point;
	}
	
	public Point getDébut(){
		return this.début;
	}
	
	public void setFin(Point point){
		this.fin = point;
	}
	
	public Point getFin(){
		return this.fin;
	}
	
	public void mousePressed(MouseEvent event){
		this.début = new Point(event.getX(), event.getY());
	}
	
	public void mouseClicked(MouseEvent event){
		
	}
	
	public void mouseReleased(MouseEvent event){
		this.fin = new Point(event.getX(), event.getY());
		VueForme maVue = this.créerVueForme();
		this.panneauDessin.ajouterVueForme(maVue);
	}
	
	public void mouseEntered(MouseEvent event){
		
	}
	
	public void mouseExited(MouseEvent event){
		
	}
	
	public void mouseDragged(MouseEvent event){
		
	}
	
	public void mouseMoved(MouseEvent event){
		
	}
	
	protected abstract VueForme créerVueForme();
}
