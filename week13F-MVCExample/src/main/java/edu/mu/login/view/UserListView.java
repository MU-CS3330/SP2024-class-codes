package edu.mu.login.view;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import edu.mu.login.model.UserInformation;

import javax.swing.JList;
import java.awt.Font;
import java.awt.event.ActionListener;

public class UserListView extends JFrame {
	

	private static final long serialVersionUID = 4069733466946459655L;
	private JPanel contentPane;
	private JList<UserInformation> list;
	private JButton deleteSelectedItemButton;
	
	public UserListView() {
		setTitle("The User List Page");
		setBounds(500, 500, 537, 323);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		getContentPane().setLayout(null);
		
		
		DefaultListModel<UserInformation> model = new DefaultListModel<UserInformation>();
		list = new JList<UserInformation>(model);
		list.setBounds(36, 28, 456, 210);
		contentPane.add(list);
		
		deleteSelectedItemButton = new JButton("Delete Selected Item");
		
		deleteSelectedItemButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		deleteSelectedItemButton.setBounds(36, 252, 103, 25);
		contentPane.add(deleteSelectedItemButton);
	}
	
	public DefaultListModel<UserInformation> getUserList() {
		return (DefaultListModel<UserInformation>) list.getModel();
	}
	
	public void addActionListenerToDeteletButton(ActionListener listener) {
		deleteSelectedItemButton.addActionListener(listener);
	}
	
	public int getSelectedItemIndex() {
		return list.getSelectedIndex();
	}
}
