package test;

import com.project.control.WriteFile;
import com.project.model.Bed;
import com.project.model.Lift;
import com.project.model.Mattress;
import com.project.model.Product;
import com.project.model.Table;
import com.project.model.Wheelchair;

public class TestPojo {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			Product productModel = null;

			String thypeProduct = "Alite";

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
				productModel = new Wheelchair(150.00, 100.00);
				break;
			case "Alite":
				productModel = new Table(50.00, 50, 50, 50);
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
			System.out.println(productModel.toFile());

			WriteFile writeFile = new WriteFile();
			writeFile.writeProduct(thypeProduct + ";" + productModel.toFile(), thypeProduct);
		}
	}
}
