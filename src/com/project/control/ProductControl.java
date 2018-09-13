package com.project.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.project.model.Bed;
import com.project.model.Lift;
import com.project.model.Mattress;
import com.project.model.Product;
import com.project.model.Table;
import com.project.model.Wheelchair;
import com.project.view.ProductView;

public class ProductControl implements ActionListener {

	private Product productModel;
	private ProductView productView;
	private WriteFile writeFile;

	public ProductControl(Product productModel, ProductView productView) {
		this.productModel = productModel;
		this.productView = productView;

		productView.jbtSaveProduct.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(this.productView.jbtCancel)) {
			cleanView();
		} else if (e.getSource().equals(this.productView.jbtSaveProduct)) {

			String thypeProduct = this.productView.jcbProducts.getSelectedItem().toString();

			writeFile = new WriteFile();
			switch (thypeProduct) {
			case "Lit":

				productModel = new Bed(200, 200, 200, 50);

				break;
			case "Matelas":

				productModel = new Mattress(50);

				break;
			case "Lift":

				productModel = new Lift(250.00, 120.99);

				break;
			case "Wheelchair":

				productModel = new Wheelchair(38.00, 13.8);

				break;
			case "Table":

				productModel = new Table(120, 50, 50, 50);
				break;
			default:
				productModel = null;
				break;
			}

			System.out.println(productModel.toString());
		}
	}

	public void cleanView() {

	}
}
