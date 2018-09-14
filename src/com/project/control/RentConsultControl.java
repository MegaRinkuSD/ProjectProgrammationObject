package com.project.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import com.project.model.Rent;
import com.project.view.RentConsultView;

public class RentConsultControl implements ActionListener, WindowListener {

	Rent rentModel;
	RentConsultView rentConsultView;

	public RentConsultControl(Rent rentModel, RentConsultView rentConsultView) {
		this.rentModel = rentModel;
		this.rentConsultView = rentConsultView;

		rentConsultView.addWindowListener(this);

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
		if (e.getSource().equals(this.rentConsultView)) {
			this.rentConsultView.jtRents.setModel(findAllRents());
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public DefaultTableModel findAllRents() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("No. Ref");
		model.addColumn("Nom client");
		model.addColumn("Adresse");
		model.addColumn("Tel.");
		model.addColumn("Debut");
		model.addColumn("Fin");
		model.addColumn("Total paye");

		ArrayList<Rent> rents = new ReadFile().readRents();
		for (int i = 0; i < rents.size(); i++) {
			Object[] info = new Object[7];
			info[0] = rents.get(i).getRef();
			info[1] = rents.get(i).getPrenom() + " " + rents.get(i).getNom();
			info[2] = rents.get(i).getRue() + " " + rents.get(i).getVille() + " " + rents.get(i).getBp();
			info[3] = rents.get(i).getTel();
			info[4] = rents.get(i).getDebut();
			info[5] = rents.get(i).getFin();
			info[6] = rents.get(i).getMontant();
			model.addRow(info);
		}
		return model;
	}

}
