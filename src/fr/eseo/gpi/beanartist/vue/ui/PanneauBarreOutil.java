package fr.eseo.gpi.beanartist.vue.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

import fr.eseo.gpi.beanartist.controleur.actions.ActionChoisirCouleur;
import fr.eseo.gpi.beanartist.controleur.actions.ActionChoisirCouleurFond;
import fr.eseo.gpi.beanartist.controleur.actions.ActionEffacer;
import fr.eseo.gpi.beanartist.controleur.actions.ActionForme;
import fr.eseo.gpi.beanartist.controleur.actions.ActionModeRemplissage;
import fr.eseo.gpi.beanartist.controleur.actions.ActionSélectionner;


public class PanneauBarreOutil extends JPanel{
	
	private FenêtreBeAnArtist fenêtreBeAnArtist;
	
	public PanneauBarreOutil(FenêtreBeAnArtist fenêtre){
		super();
		this.fenêtreBeAnArtist = fenêtre;
		this.setPreferredSize(new Dimension(150, this.fenêtreBeAnArtist.getHeight()));
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.fenêtreBeAnArtist.getContentPane().add(this, BorderLayout.EAST);
		this.fenêtreBeAnArtist.pack();
		initComponents();
	}
	
	public FenêtreBeAnArtist getFenêtreBeAnArtist(){
		return this.fenêtreBeAnArtist;
	}
	
	private void initComponents(){
		
		
		this.add(new JButton(new ActionEffacer(this.fenêtreBeAnArtist)));
		
		this.add(new JButton(new ActionSélectionner(this.fenêtreBeAnArtist)));
		
		this.add(new JButton(new ActionChoisirCouleur(this.fenêtreBeAnArtist.getPanneauDessin())));
		
		this.add(new JButton(new ActionChoisirCouleurFond(this.fenêtreBeAnArtist)));
		
		JButton boutonLigne = new JButton(new ActionForme(this.fenêtreBeAnArtist));
		boutonLigne.setActionCommand("Tracer Ligne");
		boutonLigne.setText("Ligne");
		this.add(boutonLigne);
		
		JButton boutonRectangle = new JButton(new ActionForme(this.fenêtreBeAnArtist));
		boutonRectangle.setActionCommand("Tracer Rectangle");
		boutonRectangle.setText("Rectangle");
		this.add(boutonRectangle);
		
		JButton boutonCarré = new JButton(new ActionForme(this.fenêtreBeAnArtist));
		boutonCarré.setActionCommand("Tracer Carré");
		boutonCarré.setText("Carré");
		this.add(boutonCarré);
		
		JButton boutonCercle = new JButton(new ActionForme(this.fenêtreBeAnArtist));
		boutonCercle.setActionCommand("Tracer Cercle");
		boutonCercle.setText("Cercle");
		this.add(boutonCercle);
		
		JButton boutonEllipse = new JButton(new ActionForme(this.fenêtreBeAnArtist));
		boutonEllipse.setActionCommand("Tracer Ellipse");
		boutonEllipse.setText("Ellipse");
		this.add(boutonEllipse);
		
		ButtonGroup groupeRemplir = new ButtonGroup();
		
		JRadioButton boutonRemplir = new JRadioButton(new ActionModeRemplissage(this.fenêtreBeAnArtist.getPanneauDessin()));
		boutonRemplir.setActionCommand("Remplir");
		boutonRemplir.setText("Remplir");
		groupeRemplir.add(boutonRemplir);
		this.add(boutonRemplir);
		
		JRadioButton boutonContour = new JRadioButton(new ActionModeRemplissage(this.fenêtreBeAnArtist.getPanneauDessin()));
		boutonContour.setActionCommand("Contour");
		boutonContour.setText("Contour");
		boutonContour.setSelected(true);
		groupeRemplir.add(boutonContour);
		this.add(boutonContour);
		
	}

}
