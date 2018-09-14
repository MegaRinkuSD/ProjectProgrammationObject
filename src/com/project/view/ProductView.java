package com.project.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.CardLayout;
import javax.swing.JButton;

public class ProductView extends JFrame {

	private JPanel contentPane;
	private JTextField jtfNoRef;
	private JTextField jtfModel;
	private JTextField jtfMark;
	private JTextField jtfPrice;
	private JTextField jtfStock;
	private JLabel lblEnStock;
	private JPanel panel;
	private JButton btnAnnuler;
	private JButton btnGarder;
	private JPanel jpBed;
	private JTextField jtfWideBed;
	private JLabel label1;
	private JLabel lblLargeur;
	private JTextField jtfLargeBed;
	private JTextField jtfMaxWeightBed;
	private JLabel lblMaxPoids;
	private JLabel lblHautese;
	private JTextField jtfHightBed;
	private JPanel jpTable;
	private JTextField jtfWeightMaxTable;
	private JLabel label;
	private JLabel label_1;
	private JTextField jtfHightTable;
	private JTextField jtfLargeTable;
	private JTextField jtfWideTable;
	private JLabel label_2;
	private JLabel label_3;
	private JPanel jpMatress;
	private JTextField jtfInfatableMattress;
	private JLabel lblTempsGonflage;
	private JPanel jpLift;
	private JTextField jtfRaisingLift;
	private JTextField jtfSpinLift;
	private JLabel lblDegrDePivotage;
	private JLabel lblPoidsMax;
	private JPanel jpWheelchair;
	private JTextField jtfWeight;
	private JLabel lblPoids;
	private JLabel lblLaergeurDassise;
	private JTextField jtfWidthChair;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductView frame = new ProductView();
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
	public ProductView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox jcbProducts = new JComboBox();
		jcbProducts.setBounds(12, 13, 344, 22);
		contentPane.add(jcbProducts);
		
		JLabel lblRef = new JLabel("# Ref");
		lblRef.setBounds(111, 65, 56, 16);
		contentPane.add(lblRef);
		
		jtfNoRef = new JTextField();
		jtfNoRef.setBounds(161, 62, 159, 22);
		contentPane.add(jtfNoRef);
		jtfNoRef.setColumns(10);
		
		jtfModel = new JTextField();
		jtfModel.setColumns(10);
		jtfModel.setBounds(161, 129, 159, 22);
		contentPane.add(jtfModel);
		
		JLabel lblModle = new JLabel("Mod\u00E8le");
		lblModle.setBounds(111, 132, 56, 16);
		contentPane.add(lblModle);
		
		jtfMark = new JTextField();
		jtfMark.setColumns(10);
		jtfMark.setBounds(542, 65, 159, 22);
		contentPane.add(jtfMark);
		
		JLabel lblMarque = new JLabel("Marque");
		lblMarque.setBounds(492, 68, 56, 16);
		contentPane.add(lblMarque);
		
		jtfPrice = new JTextField();
		jtfPrice.setColumns(10);
		jtfPrice.setBounds(542, 129, 159, 22);
		contentPane.add(jtfPrice);
		
		JLabel lblPrix = new JLabel("Prix");
		lblPrix.setBounds(492, 132, 56, 16);
		contentPane.add(lblPrix);
		
		jtfStock = new JTextField();
		jtfStock.setColumns(10);
		jtfStock.setBounds(368, 188, 159, 22);
		contentPane.add(jtfStock);
		
		lblEnStock = new JLabel("En stock");
		lblEnStock.setBounds(318, 191, 56, 16);
		contentPane.add(lblEnStock);
		
		panel = new JPanel();
		panel.setBounds(12, 232, 783, 237);
		contentPane.add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		jpBed = new JPanel();
		panel.add(jpBed, "name_10338007794132");
		jpBed.setLayout(null);
		
		jtfWideBed = new JTextField();
		jtfWideBed.setColumns(10);
		jtfWideBed.setBounds(117, 141, 159, 22);
		jpBed.add(jtfWideBed);
		
		label1 = new JLabel("Grosseur");
		label1.setBounds(12, 141, 105, 16);
		jpBed.add(label1);
		
		lblLargeur = new JLabel("Largeur");
		lblLargeur.setBounds(12, 74, 105, 16);
		jpBed.add(lblLargeur);
		
		jtfLargeBed = new JTextField();
		jtfLargeBed.setColumns(10);
		jtfLargeBed.setBounds(117, 74, 159, 22);
		jpBed.add(jtfLargeBed);
		
		jtfMaxWeightBed = new JTextField();
		jtfMaxWeightBed.setColumns(10);
		jtfMaxWeightBed.setBounds(420, 141, 159, 22);
		jpBed.add(jtfMaxWeightBed);
		
		lblMaxPoids = new JLabel("Poids max");
		lblMaxPoids.setBounds(325, 141, 105, 16);
		jpBed.add(lblMaxPoids);
		
		lblHautese = new JLabel("Hautese");
		lblHautese.setBounds(325, 74, 105, 16);
		jpBed.add(lblHautese);
		
		jtfHightBed = new JTextField();
		jtfHightBed.setColumns(10);
		jtfHightBed.setBounds(420, 74, 159, 22);
		jpBed.add(jtfHightBed);
		
		jpTable = new JPanel();
		panel.add(jpTable, "name_11094942994488");
		jpTable.setLayout(null);
		
		jtfWeightMaxTable = new JTextField();
		jtfWeightMaxTable.setColumns(10);
		jtfWeightMaxTable.setBounds(420, 133, 159, 22);
		jpTable.add(jtfWeightMaxTable);
		
		label = new JLabel("Poids max");
		label.setBounds(325, 133, 105, 16);
		jpTable.add(label);
		
		label_1 = new JLabel("Hautese");
		label_1.setBounds(325, 66, 105, 16);
		jpTable.add(label_1);
		
		jtfHightTable = new JTextField();
		jtfHightTable.setColumns(10);
		jtfHightTable.setBounds(420, 66, 159, 22);
		jpTable.add(jtfHightTable);
		
		jtfLargeTable = new JTextField();
		jtfLargeTable.setColumns(10);
		jtfLargeTable.setBounds(117, 66, 159, 22);
		jpTable.add(jtfLargeTable);
		
		jtfWideTable = new JTextField();
		jtfWideTable.setColumns(10);
		jtfWideTable.setBounds(117, 133, 159, 22);
		jpTable.add(jtfWideTable);
		
		label_2 = new JLabel("Grosseur");
		label_2.setBounds(12, 133, 105, 16);
		jpTable.add(label_2);
		
		label_3 = new JLabel("Largeur");
		label_3.setBounds(12, 66, 105, 16);
		jpTable.add(label_3);
		
		jpMatress = new JPanel();
		panel.add(jpMatress, "name_11267438957023");
		jpMatress.setLayout(null);
		
		jtfInfatableMattress = new JTextField();
		jtfInfatableMattress.setColumns(10);
		jtfInfatableMattress.setBounds(117, 99, 159, 22);
		jpMatress.add(jtfInfatableMattress);
		
		lblTempsGonflage = new JLabel("Temps gonflage");
		lblTempsGonflage.setBounds(12, 99, 105, 16);
		jpMatress.add(lblTempsGonflage);
		
		jpLift = new JPanel();
		panel.add(jpLift, "name_11422502809614");
		jpLift.setLayout(null);
		
		jtfRaisingLift = new JTextField();
		jtfRaisingLift.setColumns(10);
		jtfRaisingLift.setBounds(137, 57, 159, 22);
		jpLift.add(jtfRaisingLift);
		
		jtfSpinLift = new JTextField();
		jtfSpinLift.setColumns(10);
		jtfSpinLift.setBounds(137, 124, 159, 22);
		jpLift.add(jtfSpinLift);
		
		lblDegrDePivotage = new JLabel("Degr\u00E9 de pivotage");
		lblDegrDePivotage.setBounds(12, 124, 105, 16);
		jpLift.add(lblDegrDePivotage);
		
		lblPoidsMax = new JLabel("Poids Max");
		lblPoidsMax.setBounds(12, 57, 105, 16);
		jpLift.add(lblPoidsMax);
		
		jpWheelchair = new JPanel();
		panel.add(jpWheelchair, "name_11561230413928");
		jpWheelchair.setLayout(null);
		
		jtfWeight = new JTextField();
		jtfWeight.setColumns(10);
		jtfWeight.setBounds(137, 135, 159, 22);
		jpWheelchair.add(jtfWeight);
		
		lblPoids = new JLabel("Poids");
		lblPoids.setBounds(12, 135, 105, 16);
		jpWheelchair.add(lblPoids);
		
		lblLaergeurDassise = new JLabel("Largeur d'assise");
		lblLaergeurDassise.setBounds(12, 68, 105, 16);
		jpWheelchair.add(lblLaergeurDassise);
		
		jtfWidthChair = new JTextField();
		jtfWidthChair.setColumns(10);
		jtfWidthChair.setBounds(137, 68, 159, 22);
		jpWheelchair.add(jtfWidthChair);
		
		btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(698, 499, 97, 25);
		contentPane.add(btnAnnuler);
		
		btnGarder = new JButton("Garder");
		btnGarder.setBounds(589, 499, 97, 25);
		contentPane.add(btnGarder);
	}

}
