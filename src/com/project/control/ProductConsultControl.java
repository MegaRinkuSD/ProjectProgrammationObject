package com.project.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.table.DefaultTableModel;

import com.project.model.Product;
import com.project.view.MenuView;
import com.project.view.ProductConsultView;

public class ProductConsultControl implements ActionListener, WindowListener {

	ProductConsultView consultView;
	Product productModel;

	public ProductConsultControl(ProductConsultView consultView, Product productModel) {
		this.consultView = consultView;
		this.productModel = productModel;

		consultView.addWindowListener(this);
		consultView.btnRetourner.addActionListener(this);
//		consultView.btnOrderDate.addActionListener(this);
//		consultView.btnOrder
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		if (e.getSource().equals(this.consultView)) {
			this.consultView.jtProducts.setModel(setProducts());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(this.consultView.btnRetourner)) {
			this.consultView.dispose();
			MenuView menuView = new MenuView();
			MenuControl menuControl = new MenuControl(menuView);
			menuView.frame.setVisible(true);
		}
	}

	public DefaultTableModel setProducts() {
		DefaultTableModel model = new DefaultTableModel();
		
		model.addColumn("Type");
		model.addColumn("No. Ref.");
		model.addColumn("Marque");
		model.addColumn("Modele");
		model.addColumn("Prix");
		model.addColumn("Cantite");

		ArrayList<Product> products = new ReadFile().readProducts();

		for (int i = 0; i < products.size(); i++) {
			Object[] infoProd = new Object[6];
			infoProd[0] = products.get(i).getTypeProduct();
			infoProd[1] = products.get(i).getNoRef();
			infoProd[2] = products.get(i).getMark();
			infoProd[3] = products.get(i).getModel();
			infoProd[4] = products.get(i).getPrice();
			infoProd[5] = products.get(i).getStock();
			
			model.addRow(infoProd);
		}
		return model;
	}

}
