package edu.mu.observer.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import edu.mu.observer.model.ButtonSubjectModel;

import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;

public class ButtonObserverView extends JFrame implements Observer{
	
	/**
	 * Added default serialization
	 */
	private static final long serialVersionUID = -2146498009579197418L;
	private JPanel contentPane;
	private JButton toggleButton;
	
	public ButtonObserverView() {
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		
		toggleButton = new JButton("New button");
		toggleButton.setBounds(95, 102, 89, 23);
		contentPane.add(toggleButton);
	}
	
	public void addButtonActionListener(ActionListener action) {
		toggleButton.addActionListener(action);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof ButtonSubjectModel) {
			ButtonSubjectModel model = (ButtonSubjectModel) o;
			System.out.println("Button status: " + model.getButtonStatus());
		}
		
	}
}
