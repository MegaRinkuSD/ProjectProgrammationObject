package com.project.control;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Instances {

	public void createInstances() {
		createFolders();
		createFileProducts();
		createFileDay();
	}
	
	public void createFolders() {
		File folderProduct = new File("..//Product");
		File folderBook = new File("..//Book");
		File folderMonth = new File("..//Book//" + new SimpleDateFormat("yyyyMM").format(new Date()));
		try {
			if (!folderProduct.exists()) {
				folderProduct.mkdirs();
			}
			if (!folderBook.exists()) {
				folderBook.mkdirs();
			}
			if (!folderMonth.exists()) {
				folderMonth.mkdirs();
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public void createFileProducts() {
		BufferedWriter writer = null;
		File productLits = new File("..//Product//Lit.txt");
		File productMatelas = new File("..//Product//Matela.txt");
		File productSouleve = new File("..//Product//Souleve.txt");
		File productFauteuils = new File("..//Product//Fauteuil.txt");
		File productAlite = new File("..//Product//Alite.txt");
		try {
			if (!productLits.exists()) {
				writer = new BufferedWriter(new FileWriter(productLits));
			}
			if (!productMatelas.exists()) {
				writer = new BufferedWriter(new FileWriter(productMatelas));
			}
			if (!productSouleve.exists()) {
				writer = new BufferedWriter(new FileWriter(productSouleve));
			}
			if (!productFauteuils.exists()) {
				writer = new BufferedWriter(new FileWriter(productFauteuils));
			}
			if (!productAlite.exists()) {
				writer = new BufferedWriter(new FileWriter(productAlite));
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public void createFileDay() {
		BufferedWriter writer = null;
		File fileDay = new File("..//Book//" + new SimpleDateFormat("yyyyMM").format(new Date()) + "//"
				+ new SimpleDateFormat("dd").format(new Date()) + ".txt");
		try {
			if (!fileDay.exists()) {
				writer = new BufferedWriter(new FileWriter(fileDay));
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
