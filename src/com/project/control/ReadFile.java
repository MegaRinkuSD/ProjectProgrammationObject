package com.project.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

import com.project.model.Book;

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

	public static void main(String[] args) {
		double montant = 0;
		ArrayList<Book> books = new ReadFile().readBook();
		for (int i = 0; i < books.size(); i++) {
			montant += books.get(i).getMontant();
		}
		System.out.println(montant);
	}
}
