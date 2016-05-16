package fr.eseo.gpi.beanartist.controleur.outils;

import java.awt.event.MouseEvent;

import fr.eseo.gpi.beanartist.modele.geom.Forme;
import fr.eseo.gpi.beanartist.modele.geom.Point;
import fr.eseo.gpi.beanartist.modele.geom.Rectangle;
import fr.eseo.gpi.beanartist.vue.geom.VueForme;
import fr.eseo.gpi.beanartist.vue.geom.VueRectangle;
import fr.eseo.gpi.beanartist.vue.ui.PanneauDessin;

public class OutilSélection extends Outil{
	
	private Forme formeSélectionnée;
	
	public OutilSélection(PanneauDessin thePanneauDessin){
		super(thePanneauDessin);
	}
	
	public void mousePressed(MouseEvent event){}
	public void mouseClicked(MouseEvent event){
		boolean selectionValide = false;
		for(int index = 0; index < super.getPanneauDessin().getVueFormes().size(); index++){
			if(super.getPanneauDessin().getVueFormes().get(index).getForme().contient(event.getX(), event.getY())){
				selectionValide = true;
				super.getPanneauDessin().setVueFormeCourante(super.getPanneauDessin().getVueFormes().get(index));
				super.getPanneauDessin().setSelectionVueForme(
							new VueRectangle(new Rectangle(new Point(super.getPanneauDessin().getVueFormeCourante().getForme().getX()-5,
													   super.getPanneauDessin().getVueFormeCourante().getForme().getY()-5),
													   super.getPanneauDessin().getVueFormeCourante().getForme().getLargeur()+10,
													   super.getPanneauDessin().getVueFormeCourante().getForme().getHauteur()+10),
													   false)); 
				super.getPanneauDessin().repaint();
			}
			if(!selectionValide){
				super.getPanneauDessin().setSelectionVueForme(null);
				super.getPanneauDessin().setVueFormeCourante(null);
				super.getPanneauDessin().repaint();
			}
		}
	}
	public void mouseReleased(MouseEvent event){}
	public void mouseEntered(MouseEvent event){}
	public void mouseExited(MouseEvent event){}
	public void mouseDragged(MouseEvent event){
		if(super.getPanneauDessin().getVueFormeCourante()!=null){
			int valCoinXSelection = super.getPanneauDessin().getSelectionVueForme().getForme().getMaxX() - event.getX();
			System.out.println(super.getPanneauDessin().getSelectionVueForme().getForme().getX());
			int valCoinYSelection = super.getPanneauDessin().getSelectionVueForme().getForme().getMaxY() - event.getY();
			int valCoinXForme = super.getPanneauDessin().getVueFormeCourante().getForme().getMaxX() - event.getX();
			int valCoinYForme = super.getPanneauDessin().getVueFormeCourante().getForme().getMaxY() - event.getY();
			super.getPanneauDessin().getSelectionVueForme().getForme().déplacerVers(event.getX()-5 - valCoinXSelection, event.getY()-5 - valCoinYSelection);
			super.getPanneauDessin().getVueFormeCourante().getForme().déplacerVers(event.getX() - valCoinXForme, event.getY() - valCoinYForme);
			super.getPanneauDessin().repaint();
		}
	}
	public void mouseMoved(MouseEvent event){}
	
	protected VueForme créerVueForme(){return null;};
}
