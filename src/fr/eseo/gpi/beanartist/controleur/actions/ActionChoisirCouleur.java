package fr.eseo.gpi.beanartist.controleur.actions;

import fr.eseo.gpi.beanartist.vue.ui.PanneauDessin;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JColorChooser;

public class ActionChoisirCouleur extends AbstractAction {
  
  private static final long serialVersionUID = 1625467056011429968L;

  PanneauDessin panneau;
  
  public static final String CHOISIR_COULEUR = "Couleur Ligne";
  
  public ActionChoisirCouleur(PanneauDessin thePanneau) {
    super(CHOISIR_COULEUR);
    this.panneau = thePanneau;
  }
  
  /** Permet la modification de la couleur du tracé courant ou d'un sélectionné.*/
  public void actionPerformed(ActionEvent event) {
    Color couleur = JColorChooser.showDialog(null, "couleur du fond", Color.WHITE);
    if (this.panneau.getVueFormes().size() > 0) {
      this.panneau.getVueFormes().get(
              this.panneau.getVueFormes().size() - 1).setCouleurLigne(couleur);
      this.panneau.repaint();
    }
    
  }
}
