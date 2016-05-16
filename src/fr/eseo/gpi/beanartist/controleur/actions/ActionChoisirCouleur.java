package fr.eseo.gpi.beanartist.controleur.actions;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JColorChooser;

import fr.eseo.gpi.beanartist.vue.ui.PanneauDessin;;

public class ActionChoisirCouleur extends AbstractAction{
	
	PanneauDessin panneau;
	
	public static final String CHOISIR_COULEUR = "Couleur Ligne";
	
	public ActionChoisirCouleur(PanneauDessin thePanneau){
		super(CHOISIR_COULEUR);
		this.panneau = thePanneau;
	}
	
	public void actionPerformed(ActionEvent e){
		Color couleur = JColorChooser.showDialog(null, "couleur du fond", Color.WHITE);
		if(this.panneau.getVueFormes().size()>0){
			this.panneau.getVueFormes().get(this.panneau.getVueFormes().size()-1).setCouleurLigne(couleur);
			this.panneau.repaint();
		}
		
	}
}
