package fr.eseo.gpi.beanartist.controleur.outils;

import fr.eseo.gpi.beanartist.modele.geom.Ligne;
import fr.eseo.gpi.beanartist.vue.geom.VueLigne;
import fr.eseo.gpi.beanartist.vue.ui.PanneauDessin;

public class OutilLigne extends OutilForme{
	
	public OutilLigne(PanneauDessin newPanneauDessin){
		super(newPanneauDessin);
	}
	
	protected VueLigne créerVueForme(){
		Ligne ligne = new Ligne(super.getDébut());
		ligne.setP2(super.getFin());
		VueLigne vueligne = new VueLigne(ligne, false);
		return vueligne;
	}
}
