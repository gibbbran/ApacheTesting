package view;

import controller.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import model.User.UserType;

public class UserSelectController {
	@FXML
	private RadioButton attendeeRButton;
	@FXML
	private RadioButton judgeRButton;
	@FXML
	private Button cancelButton;
	@FXML
	private Button submitButton;

	// Reference to the main application.
	private Main mainApp;

	/**
	 * Is called by the main application to give a reference back to itself.
	 * 
	 * @author Griffin Toyoda
	 * @param mainApp
	 */
	public void setMainApp(Main mainApp) {
		this.mainApp = mainApp;
	}

	/**
	 * @author Griffin Toyoda
	 */
	@FXML
	private void cancelButtonClicked() {
		if (mainApp != null) {
			mainApp.showLoginPage();
		}
	}

	/**
	 * @author Griffin Toyoda
	 */
	@FXML
	private void submitButtonClicked() {
		if (mainApp != null) {
			if (attendeeRButton.isSelected()) {
				mainApp.currentUser.setUserType(UserType.ATTENDEE);
			} else if (judgeRButton.isSelected()) {
				mainApp.currentUser.setUserType(UserType.JUDGE);
			}
			mainApp.showRegisterPage();
		}
	}
}
