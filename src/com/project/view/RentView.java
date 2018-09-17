package com.project.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class RentView extends JFrame {

	public JPanel contentPane;
	public JTextField jtfNom;
	public JTextField jtfRue;
	public JTextField jtfBP;
	public JTextField jtfNoTel;
	public JTextField jtfPrenom;
	public JTextField jtfVille;
	public JTextField jtfMontant;
	public JTextField jtfDateFin;
	public JButton btnRetourner;
	public JComboBox<String> jcbRef;
	public JButton btnGarder;
	public JButton btnAnnuler;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RentView frame = new RentView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RentView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 834, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("# Ref");
		lblNewLabel.setBounds(30, 55, 56, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(30, 99, 56, 16);
		contentPane.add(lblNom);
		
		jtfNom = new JTextField();
		jtfNom.setColumns(10);
		jtfNom.setBounds(111, 96, 202, 22);
		contentPane.add(jtfNom);
		
		JLabel lblRue = new JLabel("Rue");
		lblRue.setBounds(30, 148, 56, 16);
		contentPane.add(lblRue);
		
		jtfRue = new JTextField();
		jtfRue.setColumns(10);
		jtfRue.setBounds(111, 145, 202, 22);
		contentPane.add(jtfRue);
		
		JLabel lblBp = new JLabel("BP");
		lblBp.setBounds(352, 145, 72, 16);
		contentPane.add(lblBp);
		
		jtfBP = new JTextField();
		jtfBP.setColumns(10);
		jtfBP.setBounds(433, 142, 104, 22);
		contentPane.add(jtfBP);
		
		JLabel lblTlphone = new JLabel("T\u00E9l\u00E9phone");
		lblTlphone.setBounds(352, 46, 82, 16);
		contentPane.add(lblTlphone);
		
		jtfNoTel = new JTextField();
		jtfNoTel.setColumns(10);
		jtfNoTel.setBounds(433, 43, 322, 22);
		contentPane.add(jtfNoTel);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setBounds(352, 96, 56, 16);
		contentPane.add(lblPrenom);
		
		jtfPrenom = new JTextField();
		jtfPrenom.setColumns(10);
		jtfPrenom.setBounds(433, 93, 322, 22);
		contentPane.add(jtfPrenom);
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setBounds(549, 145, 56, 16);
		contentPane.add(lblVille);
		
		jtfVille = new JTextField();
		jtfVille.setColumns(10);
		jtfVille.setBounds(630, 142, 125, 22);
		contentPane.add(jtfVille);
		
		JLabel lblMontant = new JLabel("Montant:");
		lblMontant.setBounds(78, 252, 56, 16);
		contentPane.add(lblMontant);
		
		jtfMontant = new JTextField();
		jtfMontant.setColumns(10);
		jtfMontant.setBounds(146, 249, 202, 22);
		contentPane.add(jtfMontant);
		
		JLabel lblDateFin = new JLabel("Combien Jours ?");
		lblDateFin.setBounds(30, 223, 104, 16);
		contentPane.add(lblDateFin);
		
		jtfDateFin = new JTextField();
		jtfDateFin.setColumns(10);
		jtfDateFin.setBounds(146, 220, 609, 22);
		contentPane.add(jtfDateFin);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(12, 13, 56, 16);
		contentPane.add(lblLocation);
		
		btnGarder = new JButton("Garder");
		btnGarder.setBounds(575, 367, 97, 25);
		contentPane.add(btnGarder);
		
		btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(466, 367, 97, 25);
		contentPane.add(btnAnnuler);
		
		btnRetourner = new JButton("Retourner");
		btnRetourner.setBounds(684, 367, 97, 25);
		contentPane.add(btnRetourner);
		
		jcbRef = new JComboBox();
		jcbRef.setBounds(111, 52, 202, 22);
		contentPane.add(jcbRef);
	}
}
