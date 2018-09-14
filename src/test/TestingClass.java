package test;

import com.project.control.ProductConsultControl;
import com.project.model.Product;
import com.project.view.ProductConsultView;

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
	}
}
