package edu.mu.observer.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import edu.mu.observer.model.ButtonSubjectModel;
import edu.mu.observer.view.ButtonObserverView;

public class ButtonController {
	
	private ButtonSubjectModel model;
	private ButtonObserverView view;
	
	public ButtonController() {
		this.model = new ButtonSubjectModel();
		this.view = new ButtonObserverView();
		this.view.addButtonActionListener(new ButtonActionListener());
		model.addObserver(view);
	}
	
	public class ButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// do something
			model.toggleButton();
		}
	}
	
	public void start() {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				view.setVisible(true);
			}
		});
	}
}
