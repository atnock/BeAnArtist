package fr.eseo.gpi.beanartist.controleur.outils;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import fr.eseo.gpi.beanartist.modele.geom.Point;
import fr.eseo.gpi.beanartist.vue.geom.VueForme;
import fr.eseo.gpi.beanartist.vue.ui.PanneauDessin;

public abstract class Outil implements MouseListener {
	
	private PanneauDessin panneauDessin;
	private Point début;
	private Point fin;
	
	public Outil(PanneauDessin newPanneauDessin){
		this.panneauDessin = newPanneauDessin;
		System.out.println("on ajoute le mouse listener");
		panneauDessin.addMouseListener(this);
		
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
		System.out.println("sourie appuyée");
	}
	
	public void mouseClicked(MouseEvent event){
		
	}
	
	public void mouseReleased(MouseEvent event){
		this.fin = new Point(event.getX(), event.getY());
		VueForme maVue = this.créerVueForme();
		System.out.println("sourie released");
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
