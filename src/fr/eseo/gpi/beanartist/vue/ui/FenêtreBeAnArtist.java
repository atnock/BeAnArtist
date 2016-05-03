package fr.eseo.gpi.beanartist.vue.ui;

import java.awt.Color;
import javax.swing.JFrame;

public class FenêtreBeAnArtist extends JFrame{
	
	public static final String TITRE_PAR_DÉFAUT = "Be An Artist";
	
	private PanneauDessin panneauDessin;
	
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
		setTitle(titre);
		setSize(largeur, hauteur);
		setLocationRelativeTo(null);
		setBackground(fond);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		associerPanneauDessin(largeur,hauteur,Color.blue);
		setVisible(true);
		
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
	
}
