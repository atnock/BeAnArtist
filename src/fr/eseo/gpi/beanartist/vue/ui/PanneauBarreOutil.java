package fr.eseo.gpi.beanartist.vue.ui;

import javax.swing.JButton;
import fr.eseo.gpi.beanartist.controleur.actions.ActionEffacer;

public class PanneauBarreOutil {
	
	private FenêtreBeAnArtist fenêtreBeAnArtist;
	
	public PanneauBarreOutil(FenêtreBeAnArtist fenêtre){
		this.fenêtreBeAnArtist = fenêtre;
		initComponents();
	}
	
	public FenêtreBeAnArtist getFenêtreBeAnArtist(){
		return this.fenêtreBeAnArtist;
	}
	
	private void initComponents(){
		this.fenêtreBeAnArtist.add(new JButton(new ActionEffacer(this.fenêtreBeAnArtist)));
		System.out.println("composant init");
	}
	
}
