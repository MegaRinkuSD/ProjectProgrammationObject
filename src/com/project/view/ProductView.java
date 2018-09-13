package com.project.view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class ProductView {

	public JFrame frame;
	public JButton jbtSaveProduct;
	public JButton jbtCancel;
	public JComboBox<String> jcbProducts;
	public JTextField jtfNoRef;
	public JTextField jtfBrand;
	public JTextField jtfModel;
	public JTextField jtfPrice;
	public JSpinner jtfStock;
	
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
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		jcbProducts = new JComboBox<>();
		
		
		jbtSaveProduct = new JButton("Garder");
		jbtSaveProduct.setBounds(0, 0, 0, 0);
	}

}
