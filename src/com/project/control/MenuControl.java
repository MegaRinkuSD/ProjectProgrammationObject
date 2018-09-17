package com.project.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.project.model.Product;
import com.project.model.Rent;
import com.project.view.MenuView;
import com.project.view.ProductConsultView;
import com.project.view.ProductView;
import com.project.view.RentConsultView;
import com.project.view.RentView;

public class MenuControl implements ActionListener {

	MenuView menuView;

	public MenuControl(MenuView menuView) {
		this.menuView = menuView;

		// On ajoute les listeners a les boutons
		menuView.btnRentCheck.addActionListener(this);
		menuView.btnProductCheck.addActionListener(this);
		menuView.btnRentInsert.addActionListener(this);
		menuView.btnProductInsert.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// On valide quand un bouton est presse pour savoir qui a ete appuye
		if (e.getSource().equals(this.menuView.btnProductCheck)) {

			// On cree un modele d'info
			Product productModel = new Product();
			// On cree la fenetre
			ProductConsultView productConsultView = new ProductConsultView();
			// On appelle le controleur pour ajouter des evenements
			ProductConsultControl productConsultControl = new ProductConsultControl(productConsultView, productModel);
			productConsultView.setVisible(true);
			// On ferme cette fenetre
			this.menuView.frame.dispose();
		} else if (e.getSource().equals(this.menuView.btnRentCheck)) {

			Rent rentModel = new Rent();
			RentConsultView rentConsultView = new RentConsultView();
			RentConsultControl rentConsultControl = new RentConsultControl(rentModel, rentConsultView);
			rentConsultView.setVisible(true);
			this.menuView.frame.dispose();

		} else if (e.getSource().equals(this.menuView.btnProductInsert)) {

			Product productModel = new Product();
			ProductView productView = new ProductView();
			ProductControl productControl = new ProductControl(productModel, productView);
			productView.setVisible(true);
			this.menuView.frame.dispose();
		} else if (e.getSource().equals(this.menuView.btnRentInsert)) {

			Rent rentModel = new Rent();
			RentView rentView = new RentView();
			RentControl rentControl = new RentControl(rentModel, rentView);
			rentView.setVisible(true);
			this.menuView.frame.dispose();
		}
	}

}
