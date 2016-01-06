package com.liepin.qa;

import javax.swing.*;

public class EnvPanel extends JPanel {
	public EnvPanel() {
		this.setSize(110,25);
		textField = new JTextField();
		add(textField);
		textField.setText("测试加载");
		textField.setSize(100, 25);
		textField.setColumns(8);
	}

	private static final long serialVersionUID = -8013387382227176014L;
	private JTextField textField;
}
