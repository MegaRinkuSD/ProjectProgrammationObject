package test;

import com.project.control.ProductConsultControl;
import com.project.control.ProductControl;
import com.project.model.Product;
import com.project.view.ProductConsultView;
import com.project.view.ProductView;

public class TestingClass {

	public static void main(String[] args) {

		try {
			Product model = new Product();
			ProductConsultView view = new ProductConsultView();	

			ProductConsultControl control = new ProductConsultControl(view, model);
			view.setVisible(true);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
//		Product model = new Product();
//		ProductView view = new ProductView();
//		
//		ProductControl control = new ProductControl(model, view);
//		
//		view.setVisible(true);
//		view.setLocationRelativeTo(null);
	}
}
