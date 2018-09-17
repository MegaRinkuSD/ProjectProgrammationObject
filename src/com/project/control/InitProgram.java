package com.project.control;

import com.project.model.Product;
import com.project.view.MenuView;
import com.project.view.ProductView;

public class InitProgram {
	
	public void init() {
		// On cree des instances tels que les fichiers txt des produits et dossiers
		new Instances().createInstances();
		// On appelle l'interface du menu
		MenuView menuView = new MenuView();
		// On appelle le control qui ajoute le "Listener" des boutons
		MenuControl menuControl = new MenuControl(menuView);
		// On dit que le frame sera visible
		menuView.frame.setVisible(true);
		// On met la fenetre au centre de l'ecran
		menuView.frame.setLocationRelativeTo(null);
	}
}
