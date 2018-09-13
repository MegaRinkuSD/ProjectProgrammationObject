package com.project.control;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.project.model.Product;

public class WriteFile {

	PrintWriter writer = null;

	public void writeProduct(String message, String thype) {
		try {
			File fileDay = new File("..//Product//" + thype + ".txt");
			writer = new PrintWriter(new FileWriter(fileDay, true));
			writer.append(message);
			writer.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public void writeBook(String message) {
		try {
			File fileDay = new File("..//Book//" + new SimpleDateFormat("yyyyMM").format(new Date()) + "//"
					+ new SimpleDateFormat("dd").format(new Date()) + ".txt");
			writer = new PrintWriter(new FileWriter(fileDay, true));
			writer.append(message);
			writer.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
