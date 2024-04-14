package edu.mu.login.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class UserInputView extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2637438139122651602L;
	private JPanel contentPane;
	private JTextField usernameTextField;
	private JTextField ageTextField;
	private JButton submitButton;
	
	public UserInputView() {
		setTitle("The User Input Page");
		setBounds(100, 100, 424, 270);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		
		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		usernameLabel.setBounds(74, 65, 79, 25);
		contentPane.add(usernameLabel);
		
		JLabel ageLabel = new JLabel("Age:");
		ageLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ageLabel.setBounds(110, 93, 39, 25);
		contentPane.add(ageLabel);
		
		usernameTextField = new JTextField();
		usernameTextField.setBounds(156, 65, 99, 22);
		contentPane.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		ageTextField = new JTextField();
		ageTextField.setColumns(10);
		ageTextField.setBounds(156, 93, 99, 22);
		contentPane.add(ageTextField);
		
		submitButton = new JButton("Submit");
		submitButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		submitButton.setBounds(156, 130, 99, 22);
		contentPane.add(submitButton);
	}
	
	public void addActionListenerToButton(ActionListener listener) {
		submitButton.addActionListener(listener);
	}
	
	public String getUsername() {
		return usernameTextField.getText();
	}
	
	public String getAge() {
		return ageTextField.getText();
	}
	
}
