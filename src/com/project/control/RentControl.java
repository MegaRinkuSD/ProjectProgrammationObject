package com.project.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import com.project.model.Product;
import com.project.model.Rent;
import com.project.view.MenuView;
import com.project.view.RentView;

public class RentControl implements ActionListener, WindowListener {

	Rent rentModel;
	RentView rentView;

	public RentControl(Rent rentModel, RentView rentView) {
		this.rentModel = rentModel;
		this.rentView = rentView;

		rentView.addWindowListener(this);
		rentView.btnGarder.addActionListener(this);
		rentView.btnAnnuler.addActionListener(this);
		rentView.btnRetourner.addActionListener(this);
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		this.rentView.jcbRef.setModel(setRefProducts());
//		this.rentView.jtfMontant.setEditable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(this.rentView.btnGarder)) {
			
			rentModel = new Rent();
			rentModel.setRef(this.rentView.jcbRef.getSelectedItem().toString());
			rentModel.setDebut(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
			int totalDays = Integer.parseInt(this.rentView.jtfDateFin.getText());
			Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.DAY_OF_YEAR, totalDays);
			rentModel.setFin(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
			rentModel.setNom(this.rentView.jtfNom.getText());
			rentModel.setPrenom(this.rentView.jtfPrenom.getText());
			rentModel.setTel(this.rentView.jtfNoTel.getText());
			rentModel.setRue(this.rentView.jtfRue.getText());
			rentModel.setVille(this.rentView.jtfVille.getText());
			rentModel.setBp(this.rentView.jtfBP.getText());
			rentModel.setMontant(Double.parseDouble(this.rentView.jtfMontant.getText()));
			
			WriteFile writeFile = new WriteFile();
			writeFile.writeRent(rentModel.toFile());
			System.out.println(rentModel.toFile());
		}else if(e.getSource().equals(this.rentView.btnRetourner)) {
			this.rentView.dispose();
			MenuView menuView = new MenuView();
			MenuControl menuControl = new MenuControl(menuView);
			menuView.frame.setVisible(true);
		}
	}

	public DefaultComboBoxModel<String> setRefProducts() {
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
		ArrayList<Product> products = new ReadFile().readProducts();
		for (int i = 0; i < products.size(); i++) {
			model.addElement(String.valueOf(products.get(i).getNoRef()));
		}
		return model;
	}
}
