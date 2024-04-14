package edu.mu.login.model;

import java.util.ArrayList;
import java.util.List;

public class UserInformationContainerModel {
	
	private List<UserInformation> userList;
	
	public UserInformationContainerModel() {
		this.userList = new ArrayList<UserInformation>();
	}

	public List<UserInformation> getUserList() {
		return userList;
	}

	public void setUserList(List<UserInformation> userList) {
		this.userList = userList;
	}
}
