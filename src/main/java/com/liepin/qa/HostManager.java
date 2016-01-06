package com.liepin.qa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HostManager {

	private JFrame frame;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(()->{
			HostManager window = new HostManager();
			window.frame.setVisible(true);
		});
	}

	/**
	 * Create the application.
	 */
	public HostManager() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 450, 300);
		frame.setMinimumSize(new Dimension(450, 300));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTextField textField = new JTextField();
		textField.setBounds(126, 6, 318, 266);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		panel = new JPanel(new FlowLayout());
		panel.setBounds(6, 6, 117, 225);
		frame.getContentPane().add(panel);
		
		JButton button = new JButton("\u65B0\u589E\u73AF\u5883");
		button.addActionListener(new AddEnvListener());
		button.setBounds(6, 243, 117, 29);
		frame.getContentPane().add(button);
		
	}
	
	private class AddEnvListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			panel.add(new EnvPanel());
			frame.pack();
		}
		
	}
}
