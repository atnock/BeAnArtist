package fr.eseo.gpi.beanartist.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import fr.eseo.gpi.beanartist.vue.ui.FenêtreBeAnArtist;

public class ActionEffacer extends AbstractAction{
	
	public static final String NOM_ACTION_EFFACER = "Effacer Tout";
	FenêtreBeAnArtist fenêtreSave;

	public ActionEffacer(FenêtreBeAnArtist fenêtre){
		super(NOM_ACTION_EFFACER);
		fenêtreSave = fenêtre;
	 	addPropertyChangeListener(null);
	}
	
	public void actionPerformed(ActionEvent e){
		fenêtreSave.getPanneauDessin().getVueFormes().clear();
		System.out.println("on clear la liste d'obj !");
		fenêtreSave.repaint();
	}
	
}