package fr.eseo.gpi.beanartist.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.eseo.gpi.beanartist.vue.ui.PanneauDessin;

public class ActionModeRemplissage extends AbstractAction {
	
	public static final String NOM_ACTION_REMPLI = "Remplir";
	public static final String NOM_ACTION_CONTOUR = "Contour";
	
	PanneauDessin panneauSave;

	public ActionModeRemplissage(PanneauDessin panneau){
		super();
		this.panneauSave = panneau;
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand() == NOM_ACTION_REMPLI){
			panneauSave.setModeRemplissage(true);
		}
		
		if(e.getActionCommand() == NOM_ACTION_CONTOUR){
			panneauSave.setModeRemplissage(false);
		}
	}
}
