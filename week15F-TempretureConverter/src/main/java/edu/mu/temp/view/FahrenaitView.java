package edu.mu.temp.view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import edu.mu.temp.model.CelsiusModel;

public class FahrenaitView extends JFrame implements Observer {
	
	private JPanel contentPane;
	private JTextField textField;
	
	public FahrenaitView() {
		setBounds(300, 300, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fahrenait:");
		lblNewLabel.setBounds(55, 97, 74, 30);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(112, 94, 114, 36);
		contentPane.add(textField);
		textField.setColumns(10);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof CelsiusModel) {
			CelsiusModel celsiusModel = (CelsiusModel) o;
			Double temp = celsiusModel.toFahrenait().getTemprature();
			textField.setText(temp.toString());
		}
	}
}
