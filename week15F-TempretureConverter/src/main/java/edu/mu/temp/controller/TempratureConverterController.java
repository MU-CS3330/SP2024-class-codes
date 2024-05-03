package edu.mu.temp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import edu.mu.temp.model.CelsiusModel;
import edu.mu.temp.model.FahrenaitModel;
import edu.mu.temp.view.CelsiusView;
import edu.mu.temp.view.FahrenaitView;
import edu.mu.temp.view.TempratureInputView;

public class TempratureConverterController {
	
	private CelsiusModel celsiusModel;
	private FahrenaitModel fahrenaitModel;
	
	private CelsiusView celsiusView;
	private FahrenaitView fahrenaitView;
	private TempratureInputView inputView;
	
	public TempratureConverterController() {
		// models
		this.celsiusModel = new CelsiusModel(0);
		this.fahrenaitModel = celsiusModel.toFahrenait();
		
		// views
		this.celsiusView = new CelsiusView();
		this.fahrenaitView = new FahrenaitView();
		this.inputView = new TempratureInputView();
		
		inputView.addActionListenerToConvertButton(new ConvertButtonActionListener());
		inputView.addDocumentListenerToConvertTextField(new TextFieldDocumentListener());
		celsiusModel.addObserver(celsiusView);
		celsiusModel.addObserver(fahrenaitView);
	}
	
	public void startApp() {
		SwingUtilities.invokeLater(new Runnable() {	
			@Override
			public void run() {
				inputView.setVisible(true);
			}
		});
	}
	
	public class ConvertButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			double newTemp = inputView.getTempratureValue();
			celsiusModel.setTempratureValue(newTemp);
			fahrenaitModel.setTempratureValue(celsiusModel.toFahrenait().getTemprature());	
			if(!(celsiusView.isVisible() && fahrenaitView.isVisible())) {
				celsiusView.setVisible(true);
				fahrenaitView.setVisible(true);
			}
		}
	}
	
	public class TextFieldDocumentListener implements DocumentListener {

		@Override
		public void insertUpdate(DocumentEvent e) {
			double newTemp = inputView.getTempratureValue();
			celsiusModel.setTempratureValue(newTemp);
			fahrenaitModel.setTempratureValue(celsiusModel.toFahrenait().getTemprature());
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			double newTemp = inputView.getTempratureValue();
			celsiusModel.setTempratureValue(newTemp);
			fahrenaitModel.setTempratureValue(celsiusModel.toFahrenait().getTemprature());
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			
		}
		
	}

}
