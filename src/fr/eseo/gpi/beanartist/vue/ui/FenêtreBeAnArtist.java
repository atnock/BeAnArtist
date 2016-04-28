package fr.eseo.gpi.beanartist.vue.ui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FenêtreBeAnArtist extends JFrame{
	private static final String TITRE_PAR_DÉFAUT = "Be An Artist";
	private static final int LARGEUR_PAR_DÉFAUT = 100;
	private static final int HAUTEUR_PAR_DÉFAUT = 100;
	private static final Color COULEUR_FOND_PAR_DÉFAUT = Color.WHITE;
	
	public FenêtreBeAnArtist(){
		this(TITRE_PAR_DÉFAUT);
	}
	
	public FenêtreBeAnArtist(String titre){
		this(titre, LARGEUR_PAR_DÉFAUT, HAUTEUR_PAR_DÉFAUT);
	}
	
	public FenêtreBeAnArtist(String titre, int largeur, int hauteur){
		this(titre, largeur, hauteur,COULEUR_FOND_PAR_DÉFAUT);
	}
	
	public FenêtreBeAnArtist(String titre, int largeur, int hauteur, Color fond){
		this.setTitle(titre);
		this.setSize(largeur, hauteur);
		this.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setBackground(fond);
		this.setContentPane(panel);
		this.setVisible(true);
		
	}
	
}
