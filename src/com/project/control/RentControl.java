package com.project.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.project.model.Rent;
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
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(this.rentView.btnGarder)) {
			rentModel = new Rent();
			rentModel.setRef(Integer.parseInt(this.rentView.jtfNoRef.getText()));
			rentModel.setDebut(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
			int totalDays = Integer.parseInt(this.rentView.jtfTotalDays.getText());
			Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.DAY_OF_YEAR, totalDays);
			rentModel.setFin(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
			rentModel.setNom(this.rentView.jtfName.getText());
			rentModel.setPrenom(this.rentView.jtfSurname.getText());
			rentModel.setTel(this.rentView.jtfTel.getText());
			rentModel.setRue(this.rentView.jtfRue.getText());
			rentModel.setVille(this.rentView.jtfVille.getText());
			rentModel.setBp(this.rentView.jtfZip.getText());
			rentModel.setMontant(Double.parseDouble(this.rentView.jtfMontant.getText()));
			WriteFile writeFile = new WriteFile();
			writeFile.writeBook(rentModel.toFile());
		}
	}

}
