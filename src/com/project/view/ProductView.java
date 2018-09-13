package com.project.view;

import java.awt.EventQueue;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class ProductView {

	public JFrame frame;
	public JPanel content;
	public JButton jbtSaveProduct;
	public JButton jbtCancel;
	public JComboBox<String> jcbProducts;
	public JTextField jtfNoRef;
	public JTextField jtfBrand;
	public JTextField jtfModel;
	public JTextField jtfPrice;
	public JSpinner jtfStock;
	private DefaultComboBoxModel<String> jcbmProducts;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductView window = new ProductView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ProductView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(800, 600);
		frame.setTitle("Ajouter un article");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		content = new JPanel();
		content.setSize(800, 600);
		
		jcbmProducts = new DefaultComboBoxModel<>();
		jcbmProducts.addElement("Lits");
		
		jcbProducts = new JComboBox<>();
		jcbProducts.setModel(jcbmProducts);
		jcbProducts.setBounds(100, 100, 200, 25);
		content.add(jcbProducts);
		
	}

}
