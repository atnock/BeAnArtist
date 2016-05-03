package fr.eseo.gpi.beanartist.vue.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import fr.eseo.gpi.beanartist.controleur.outils.Outil;
import fr.eseo.gpi.beanartist.vue.geom.VueForme; 

public class PanneauDessin extends JPanel {
	
	public static final int LARGEUR_PAR_DÉFAUT = 100;
	public static final int HAUTEUR_PAR_DÉFAUT = 100;
	public static final Color COULEUR_FOND_PAR_DÉFAUT = Color.WHITE;
	public static final Color COULEUR_LIGNE_PAR_DÉFAUT = Color.BLACK;
	
	private List<VueForme> vueFormes= new ArrayList<VueForme>();
	private Outil outilCourant;
	private boolean modeRemplissage = false;
	private Color couleurLigne = COULEUR_LIGNE_PAR_DÉFAUT;
	
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
	
	public void ajouterVueForme(VueForme vueForme){
		vueFormes.add(vueForme);
	}
	
	public List<VueForme> getVueFormes(){
		return vueFormes;
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g.create();
		for(int i = 0; i < vueFormes.size(); i++){
			vueFormes.get(i).affiche(g2d);
		}
		g2d.dispose();
	}
	
	public Outil getOutilCourant(){
		return this.outilCourant;
	}
	
	public void setOutilCourant(Outil newOutil){
		this.outilCourant = newOutil;
	}
	
	public boolean getModeRemplissage(){
		return this.modeRemplissage;
	}
	
	public void setModeRemplissage(boolean newModeremplissage){
		this.modeRemplissage = newModeremplissage;
	}
	
	public Color getCouleurLigne(){
		return this.couleurLigne;
	}
	
	public void setCouleurLigne(Color newCouleurLigne){
		this.couleurLigne = newCouleurLigne;
	}
	
}
