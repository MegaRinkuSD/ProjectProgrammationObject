package com.project.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.table.DefaultTableModel;

import com.project.model.Product;
import com.project.view.ProductConsultView;

public class ProductConsultControl implements ActionListener, WindowListener {

	ProductConsultView consultView;
	Product productModel;

	public ProductConsultControl(ProductConsultView consultView, Product productModel) {
		this.consultView = consultView;
		this.productModel = productModel;

		consultView.addWindowListener(this);
	}

	public ProductConsultControl() {
		// TODO Auto-generated constructor stub
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
			jtProducts.setModel(setProducts());
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public DefaultTableModel setProducts() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Type");
		model.addColumn("No. Ref.");
		model.addColumn("Marque");
		model.addColumn("Modèle");
		model.addColumn("Prix");
		model.addColumn("Cantité");

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
