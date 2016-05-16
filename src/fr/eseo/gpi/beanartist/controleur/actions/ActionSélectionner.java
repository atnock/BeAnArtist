package fr.eseo.gpi.beanartist.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.eseo.gpi.beanartist.controleur.outils.OutilSélection;
import fr.eseo.gpi.beanartist.vue.ui.FenêtreBeAnArtist;

public class ActionSélectionner extends AbstractAction{

	public static final String NOM_ACTION_SELECTIONNER = "Sélectionner";
	FenêtreBeAnArtist fenêtreSave;

	public ActionSélectionner(FenêtreBeAnArtist fenêtre){
		super(NOM_ACTION_SELECTIONNER);
		fenêtreSave = fenêtre;
	}
	
	public void actionPerformed(ActionEvent e) {
		OutilSélection monOutil = new OutilSélection(fenêtreSave.getPanneauDessin());
		monOutil.associer(fenêtreSave.getPanneauDessin());
		fenêtreSave.getPanneauDessin().setOutilCourant(monOutil);
	}

}
