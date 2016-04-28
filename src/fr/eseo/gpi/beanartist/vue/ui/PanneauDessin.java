package fr.eseo.gpi.beanartist.vue.ui;

import java.awt.Color;
import javax.swing.JPanel;

public class PanneauDessin extends JPanel {
	
	public static final int LARGEUR_PAR_DÉFAUT = 100;
	public static final int HAUTEUR_PAR_DÉFAUT = 100;
	public static final Color COULEUR_FOND_PAR_DÉFAUT = Color.WHITE;
	public static final Color COULEUR_LIGNE_PAR_DÉFAUT = Color.BLACK;
	
	private FenêtreBeAnArtist fenêtre;
	
	public PanneauDessin(int largeurZone, int hauteurZone){
		this(largeurZone, hauteurZone, COULEUR_FOND_PAR_DÉFAUT);
	}
	
	public PanneauDessin(int largeurZone, int hauteurZone, Color couleurFond){
		setBackground(couleurFond);
		setSize(largeurZone, hauteurZone);
	}
	
	public void setFenêtre(FenêtreBeAnArtist fen){
		this.fenêtre = fen;
	}
}
