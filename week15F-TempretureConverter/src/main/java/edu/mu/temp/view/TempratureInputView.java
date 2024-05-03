package edu.mu.temp.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TempratureInputView extends JFrame {
	
	private JPanel contentPane;
	private JTextField tempratureInputTextField;
	private JButton convertButton;
	
	public TempratureInputView() {
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		
		tempratureInputTextField = new JTextField();
		tempratureInputTextField.setText("0");
		tempratureInputTextField.setBounds(159, 91, 119, 37);
		contentPane.add(tempratureInputTextField);
		tempratureInputTextField.setColumns(10);
		
		
		JLabel lblNewLabel = new JLabel("Temprature in Celsius:");
		lblNewLabel.setBounds(25, 94, 139, 31);
		contentPane.add(lblNewLabel);
		
		convertButton = new JButton("Convert");
		convertButton.setBounds(75, 161, 133, 37);
		contentPane.add(convertButton);
	
	}
	
	public void addActionListenerToConvertButton(ActionListener action) {
		convertButton.addActionListener(action);
	}
	
	public void addDocumentListenerToConvertTextField(DocumentListener evnt) {
		tempratureInputTextField.getDocument().addDocumentListener(evnt);
	}
	
	
	public double getTempratureValue() {
		Double tempratureValue = Double.parseDouble(tempratureInputTextField.getText());
		return tempratureValue.doubleValue();
	}
	
}
