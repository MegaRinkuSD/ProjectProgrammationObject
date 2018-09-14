package com.project.control;

import com.project.model.Product;
import com.project.view.ProductView;

public class InitProgram {

	public InitProgram() {
		
	}
	
	public void init() {
		Product productModel = new Product();
		ProductView productView = new ProductView();
		ProductControl init = new ProductControl(productModel, productView);
		productView.contentPane.setVisible(true);
	}
}
