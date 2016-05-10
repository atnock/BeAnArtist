package fr.eseo.gpi.beanartist.vue.ui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import fr.eseo.gpi.beanartist.vue.ui.PanneauBarreOutil;

public class FenêtreBeAnArtist extends JFrame{
	
	public static final String TITRE_PAR_DÉFAUT = "Be An Artist";
	
	private PanneauDessin panneauDessin;
	private PanneauBarreOutil panneauBarreOutil;
	
	public FenêtreBeAnArtist(){
		this(TITRE_PAR_DÉFAUT);
	}
	
	public FenêtreBeAnArtist(String titre){
		this(titre, PanneauDessin.LARGEUR_PAR_DÉFAUT, PanneauDessin.HAUTEUR_PAR_DÉFAUT);
	}
	
	public FenêtreBeAnArtist(int largeur, int hauteur){
		this(TITRE_PAR_DÉFAUT, largeur, hauteur, PanneauDessin.COULEUR_FOND_PAR_DÉFAUT);
	}
	
	public FenêtreBeAnArtist(String titre, int largeur, int hauteur){
		this(titre, largeur, hauteur, PanneauDessin.COULEUR_FOND_PAR_DÉFAUT);
	}
	
	public FenêtreBeAnArtist(String titre, int largeur, int hauteur, Color fond){
		this.setTitle(titre);
		this.setSize(largeur, hauteur);
		this.setLocationRelativeTo(null);
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setBackground(fond);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.associerPanneauDessin(largeur,hauteur,fond);
		this.associerBarreOutil();
		this.setVisible(true);
		
	}
	
	private void associerBarreOutil(){
		this.panneauBarreOutil = new PanneauBarreOutil(this);
	}
	
	private void associerPanneauDessin(int largeur, int hauteur){
		associerPanneauDessin(largeur, hauteur, PanneauDessin.COULEUR_FOND_PAR_DÉFAUT);
	}
	
	private void associerPanneauDessin(int largeur, int hauteur, Color fond){
		this.panneauDessin = new PanneauDessin(largeur,hauteur,fond);
		setContentPane(panneauDessin);
		setSize(largeur, hauteur);
	}
	
	public void setPanneauDessin(PanneauDessin panneau){
		this.panneauDessin = panneau;
	}
	
	public PanneauDessin getPanneauDessin(){
		return this.panneauDessin;
	}
	
	public void setPanneauBarreOutil(PanneauBarreOutil newPanneauBarreOutil){
		this.panneauBarreOutil = newPanneauBarreOutil;
	}
	
	public PanneauBarreOutil getPanneauBarreOutil(){
		return this.panneauBarreOutil;
	}
	
}
