package edu.mu.login.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;

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
			if(!userModel.getUserList().contains(user)) {
				userModel.getUserList().add(user);
				userListView.getUserList().addElement(user);
				System.out.println("User added!");
			}
			else {
				System.out.println("This user exists.");
			}
			
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
//			int index = userListView.getSelectedItemIndex();
//			if(index != -1) {
//				userListView.getUserList().remove(index);
//				userModel.getUserList().remove(index);
//			}
//			else {
//				System.out.println("Nothing selected to Delete");
//			}
//			System.out.println("Current number of user: " + userModel.getUserList().size());
//			// TODO: Need to remove from the model (Container) as well
//		
			int[] indecies = userListView.getMultipleSelectedItemIndex();
			if(indecies.length > 0) {
				for(int i=indecies.length-1; i>=0; i--) {
					Iterator it = userModel.getUserList().iterator();
					while(it.hasNext()) {
						UserInformation user = userModel.getUserList().get(indecies[i]);
						if(it.next().equals(user)) {
							it.remove();
							userListView.getUserList().removeElement(user);
							break;
						}
					}
				}
				
//				ArrayList<UserInformation> userList = new ArrayList<>();
//				for(int i=indecies.length-1; i>=0; i--) {
//					userList.add(userModel.getUserList().get(indecies[i]));
//					UserInformation u = userListView.getUserList().get(indecies[i]);
//					System.out.println(u);
//					System.out.println(userModel.getUserList().get(indecies[i]));
//				}
//				for(UserInformation user : userList) {
//					deleteUserFromList(user);
//				}
////				userListView.getUserList().removeAllElements();
////				userListView.getUserList().addAll(userModel.getUserList());
			}
			else {
				System.out.println("Nothing selected to Delete");
			}
			System.out.println("Current number of user: " + userModel.getUserList().size());
			// TODO: Need to remove from the model (Container) as well
		}
	}
	
	private boolean deleteUserFromList(UserInformation user) {
		userListView.getUserList().removeElement(user);
		return userModel.getUserList().remove(user);
	}

}
