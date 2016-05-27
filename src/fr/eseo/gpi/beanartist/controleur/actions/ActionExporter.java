package fr.eseo.gpi.beanartist.controleur.actions;

import fr.eseo.gpi.beanartist.vue.ui.FenêtreBeAnArtist;
import fr.eseo.gpi.beanartist.xml.EnregistreurSVG;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ActionExporter extends AbstractAction {

  private static final long serialVersionUID = -4597482454919003186L;
  public static final String NOM_ACTION_EFFACER = "Effacer Tout";
  FenêtreBeAnArtist fenêtreSave;

  /** Constructeur de la classe.*/
  public ActionExporter(FenêtreBeAnArtist fenêtre) {
    super(NOM_ACTION_EFFACER);
    fenêtreSave = fenêtre;
    addPropertyChangeListener(null);
  }
  
  /** Permet l'effacement de toutes les formes présentes dans le PanneauDessin.*/
  public void actionPerformed(ActionEvent event) {
    new EnregistreurSVG();
  }
  
}