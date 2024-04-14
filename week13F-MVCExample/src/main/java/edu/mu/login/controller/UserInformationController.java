package edu.mu.login.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.mu.login.model.UserInformation;
import edu.mu.login.model.UserInformationContainerModel;
import edu.mu.login.view.UserInputView;
import edu.mu.login.view.UserListView;

public class UserInformationController {
	
	private UserInformationContainerModel userModel;
	private UserInputView userInputView;
	private UserListView userListView;
	
	public UserInformationController(UserInformationContainerModel userModel, UserInputView userInputView) {
		super();
		this.userModel = userModel;
		this.userInputView = userInputView;
		this.userListView = new UserListView();
		userInputView.addActionListenerToButton(new UserInputListener());
		userListView.addActionListenerToDeteletButton(new UserListModelListener());
	}
	
	public class UserInputListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
//			System.out.println("Username: " + userInputView.getUsername());
			String username = userInputView.getUsername();
//			System.out.println("Age: " + userInputView.getAge());
			int age = Integer.parseInt(userInputView.getAge());
			UserInformation user = new UserInformation(username, age);
			userModel.getUserList().add(user);
			
			userListView.getUserList().addElement(user);
			userListView.setVisible(true);
			System.out.println("Number of users: " + userModel.getUserList().size());
		}
	}
	
	public void initiate() {
		userInputView.setVisible(true);
	}
	
	public class UserListModelListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
//			System.out.println(userListView.getUserList().size());
			int index = userListView.getSelectedItemIndex();
			if(index != -1) {
				userListView.getUserList().remove(index);
			}
			else {
				System.out.println("Nothing selected to Delete");
			}
			// TODO: Need to remove from the model (Container) as well
			
		}
	}

}
