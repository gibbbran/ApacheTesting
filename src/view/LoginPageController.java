package view;

import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LoginPageController extends BorderPane {
	@FXML
	private Button cancelButton;
	@FXML
	private Button loginButton;
	@FXML
	private Button registerButton;
	@FXML
	private TextField userNameField;
	@FXML
	private PasswordField passwordField;
	
	@FXML
	private void cancelButtonClicked(){
		// Go back to the UserSelect page.
		Parent root;
		Stage stage = (Stage)cancelButton.getScene().getWindow();
		try {
			root = FXMLLoader.load(getClass().getResource("UserSelectPage.fxml"));
			stage.setScene(new Scene(root));
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Or close the window.
		//Platform.exit();
	}
	
	@FXML
	private void loginButtonClicked(){
		System.out.println("Login button. This feature has not been implemented yet...");
		System.out.println("The user's username is: " + userNameField.getText());
		System.out.println("The user's password is: " + passwordField.getText());
	}
	
	@FXML
	private void registerButtonClicked(){
		System.out.println("Register button. This feature has not been implemented yet...");
	}
}