package fr.eseo.gpi.beanartist.controleur.actions;

import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;

import fr.eseo.gpi.beanartist.controleur.outils.Outil;
import fr.eseo.gpi.beanartist.controleur.outils.OutilLigne;
import fr.eseo.gpi.beanartist.controleur.outils.OutilRectangle;
import fr.eseo.gpi.beanartist.controleur.outils.OutilCarré;
import fr.eseo.gpi.beanartist.controleur.outils.OutilCercle;
import fr.eseo.gpi.beanartist.controleur.outils.OutilEllipse;
import fr.eseo.gpi.beanartist.vue.ui.FenêtreBeAnArtist;

public class ActionForme extends AbstractAction{
	
	public static final String NOM_ACTION_LIGNE = "Tracer Ligne";
	public static final String NOM_ACTION_RECTANGLE = "Tracer Rectangle";
	public static final String NOM_ACTION_CARRÉ = "Tracer Rectangle";
	public static final String NOM_ACTION_CERCLE = "Tracer Cercle";
	public static final String NOM_ACTION_ELLIPSE = "Tracer Ellipse";
	public static final String NOM_ACTION_TRACÉ = "Tracer Libre";
	FenêtreBeAnArtist fenêtreSave;
	Outil monOutil;
	
	public ActionForme(FenêtreBeAnArtist fenêtre){
		super();
		this.fenêtreSave = fenêtre;
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand() == NOM_ACTION_LIGNE){
			monOutil = new OutilLigne(fenêtreSave.getPanneauDessin());
			monOutil.associer(fenêtreSave.getPanneauDessin());
			fenêtreSave.getPanneauDessin().setOutilCourant(monOutil);
		}
		
		if(e.getActionCommand() == NOM_ACTION_RECTANGLE){
			monOutil = new OutilRectangle(fenêtreSave.getPanneauDessin());
			monOutil.associer(fenêtreSave.getPanneauDessin());
			fenêtreSave.getPanneauDessin().setOutilCourant(monOutil);
		}
		
		if(e.getActionCommand() == NOM_ACTION_CARRÉ){
			monOutil = new OutilCarré(fenêtreSave.getPanneauDessin());
			monOutil.associer(fenêtreSave.getPanneauDessin());
			fenêtreSave.getPanneauDessin().setOutilCourant(monOutil);
		}
		
		if(e.getActionCommand() == NOM_ACTION_CERCLE){
			monOutil = new OutilCercle(fenêtreSave.getPanneauDessin());
			monOutil.associer(fenêtreSave.getPanneauDessin());
			fenêtreSave.getPanneauDessin().setOutilCourant(monOutil);
		}
		
		if(e.getActionCommand() == NOM_ACTION_ELLIPSE){
			monOutil = new OutilEllipse(fenêtreSave.getPanneauDessin());
			monOutil.associer(fenêtreSave.getPanneauDessin());
			fenêtreSave.getPanneauDessin().setOutilCourant(monOutil);
		}
		
		if(e.getActionCommand() == NOM_ACTION_TRACÉ){
			monOutil = new OutilEllipse(fenêtreSave.getPanneauDessin());
			monOutil.associer(fenêtreSave.getPanneauDessin());
			fenêtreSave.getPanneauDessin().setOutilCourant(monOutil);
		}
	}
}
