package fr.eseo.gpi.beanartist.controleur.actions;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JColorChooser;

import fr.eseo.gpi.beanartist.vue.ui.FenêtreBeAnArtist;

public class ActionChoisirCouleurFond extends AbstractAction{
	
	FenêtreBeAnArtist fenêtre;
	
	public static final String NOM_ACTION_COULEUR_FOND = "Couleur Fond";
	
	public ActionChoisirCouleurFond(FenêtreBeAnArtist theFenêtre){
		super(NOM_ACTION_COULEUR_FOND);
		this.fenêtre = theFenêtre;
	}
	
	public void actionPerformed(ActionEvent e){
		Color couleur = JColorChooser.showDialog(null, "couleur du fond", Color.WHITE);
		this.fenêtre.getPanneauDessin().setCouleurFond(couleur);
	}
}
