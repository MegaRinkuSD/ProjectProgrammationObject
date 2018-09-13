package com.project.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

import com.project.model.Book;
import com.project.model.Product;

public class ReadFile {

	public ArrayList<Book> readBook() {
		ArrayList<Book> books = new ArrayList<Book>();
		try {

			File fileDay = new File("..//Book//" + new SimpleDateFormat("yyyyMM").format(new Date()) + "//"
					+ new SimpleDateFormat("dd").format(new Date()) + ".txt");

			BufferedReader br = new BufferedReader(new FileReader(fileDay));

			String line = br.readLine();

			while (line != null) {
				StringTokenizer st = new StringTokenizer(line, ";");
				Book book = new Book();
				book.setRef(st.nextToken());
				book.setDebut(st.nextToken());
				book.setFin(st.nextToken());
				book.setNom(st.nextToken());
				book.setPrenom(st.nextToken());
				book.setTel(st.nextToken());
				book.setRue(st.nextToken());
				book.setVille(st.nextToken());
				book.setBp(st.nextToken());
				book.setMontant(Double.parseDouble(st.nextToken()));
				books.add(book);
				line = br.readLine();
			}

			br.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return books;
	}

	public ArrayList<Product> readProducts() {
		File fileToRead = null;
		BufferedReader br = null;
		String line = null;

		ArrayList<Product> products = new ArrayList<>();

		try {
			fileToRead = new File("..//Product//Alite.txt");

			br = new BufferedReader(new FileReader(fileToRead));

			line = br.readLine();

			while (line != null) {
				StringTokenizer st = new StringTokenizer(line, ";");
				Product product = new Product();
				product.setTypeProduct(st.nextToken());
				product.setNoRef(Integer.parseInt(st.nextToken()));
				product.setMark(st.nextToken());
				product.setModel(st.nextToken());
				product.setPrice(Double.parseDouble(st.nextToken()));
				product.setStock(Integer.parseInt(st.nextToken()));
				products.add(product);
				line = br.readLine();
			}
			br.close();

			fileToRead = new File("..//Product//Fauteuil.txt");

			br = new BufferedReader(new FileReader(fileToRead));

			line = br.readLine();

			while (line != null) {
				StringTokenizer st = new StringTokenizer(line, ";");
				Product product = new Product();
				product.setTypeProduct(st.nextToken());
				product.setNoRef(Integer.parseInt(st.nextToken()));
				product.setMark(st.nextToken());
				product.setModel(st.nextToken());
				product.setPrice(Double.parseDouble(st.nextToken()));
				product.setStock(Integer.parseInt(st.nextToken()));
				products.add(product);
				line = br.readLine();
			}
			br.close();

			fileToRead = new File("..//Product//Lit.txt");

			br = new BufferedReader(new FileReader(fileToRead));

			line = br.readLine();

			while (line != null) {
				StringTokenizer st = new StringTokenizer(line, ";");
				Product product = new Product();
				product.setTypeProduct(st.nextToken());
				product.setNoRef(Integer.parseInt(st.nextToken()));
				product.setMark(st.nextToken());
				product.setModel(st.nextToken());
				product.setPrice(Double.parseDouble(st.nextToken()));
				product.setStock(Integer.parseInt(st.nextToken()));
				products.add(product);
				line = br.readLine();
			}
			br.close();
			fileToRead = new File("..//Product//Matelas.txt");

			br = new BufferedReader(new FileReader(fileToRead));

			line = br.readLine();

			while (line != null) {
				StringTokenizer st = new StringTokenizer(line, ";");
				Product product = new Product();
				product.setTypeProduct(st.nextToken());
				product.setNoRef(Integer.parseInt(st.nextToken()));
				product.setMark(st.nextToken());
				product.setModel(st.nextToken());
				product.setPrice(Double.parseDouble(st.nextToken()));
				product.setStock(Integer.parseInt(st.nextToken()));
				products.add(product);
				line = br.readLine();
			}
			br.close();
			fileToRead = new File("..//Product//Souleve.txt");

			br = new BufferedReader(new FileReader(fileToRead));

			line = br.readLine();

			while (line != null) {
				StringTokenizer st = new StringTokenizer(line, ";");
				Product product = new Product();
				product.setTypeProduct(st.nextToken());
				product.setNoRef(Integer.parseInt(st.nextToken()));
				product.setMark(st.nextToken());
				product.setModel(st.nextToken());
				product.setPrice(Double.parseDouble(st.nextToken()));
				product.setStock(Integer.parseInt(st.nextToken()));
				products.add(product);
				line = br.readLine();
			}
			br.close();
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return products;
	}

	public static void main(String[] args) {
		double montant = 0;
		ArrayList<Product> books = new ReadFile().readProducts();
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i).getTypeProduct());
		}
		
	}
}
