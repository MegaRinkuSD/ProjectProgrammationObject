package test;

import com.project.control.WriteFile;
import com.project.model.Bed;
import com.project.model.Lift;
import com.project.model.Mattress;
import com.project.model.Product;

public class TestPojo {

	public static void main(String[] args) {
		Product productModel = null;
		
		String thypeProduct = "Souleve";
		
		WriteFile writeFile = new WriteFile();
		switch (thypeProduct) {
		case "Lit":
			productModel = new Bed(200, 200, 200, 50);
			break;
		case "Matelas":			
			productModel = new Mattress(50);
			break;
		case "Souleve":
			productModel = new Lift(200.50, 360.00);
			break;
		case "Fauteuil":
			break;
		case "Table":
			break;
		default:
			break;
		}
		
		productModel.setNoRef(1);
		productModel.setMark("JSP");
		productModel.setModel("EL01-01");
		productModel.setPrice(250.99);
		productModel.setStock(40);
		
		System.out.println(productModel.toString());
	}
}
