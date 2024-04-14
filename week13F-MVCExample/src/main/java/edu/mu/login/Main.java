package edu.mu.login;

import javax.swing.SwingUtilities;

import edu.mu.login.controller.UserInformationController;
import edu.mu.login.model.UserInformationContainerModel;
import edu.mu.login.view.UserInputView;

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				UserInformationController controller = 
						new UserInformationController(
								new UserInformationContainerModel(), 
								new UserInputView());
				controller.initiate();
			}
		});
	}

}
