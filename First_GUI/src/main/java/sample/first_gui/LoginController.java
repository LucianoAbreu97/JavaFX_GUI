package sample.first_gui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class LoginController implements Initializable {
    
    @FXML
    private PasswordField passwordLogin;
    
    @FXML
    private Hyperlink forgotLogin;
    
    @FXML
    private Button loginButton;
    
    @FXML
    private TextField usernameLogin;
    
    @FXML
    private CheckBox rememberLogin;
    
    @FXML
    private Label error_msgLogin;
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        
        //Initialization code
    }
    
    @FXML
    void handleLoginButton(ActionEvent event) {
        
        String enteredUsername = usernameLogin.getText();
        String enteredPassword = passwordLogin.getText();
        
        if (enteredUsername.isEmpty() || enteredPassword.isEmpty()) {
            //If fields are empty
            error_msgLogin.setText("Por favor digite usuário e senha.");
        }
        else if (validation(enteredUsername, enteredPassword)) {
            //If login is correct, call mainScene
            switchToMainScene();
        } else {
            //If login incorrect
            error_msgLogin.setText("Usuario ou senha inválidos.");
        }
    }
    
    private boolean validation(String username, String password) {
        //Check login and password
        return username.equals("Luciano") && password.equals("123");
    }
    
    private void switchToMainScene() {
        //Change of scene
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/scene/mainScene.fxml"));
            Parent root = loader.load();
            
            Scene mainScene = new Scene(root);
            
            Stage stage = (Stage) usernameLogin.getScene().getWindow();
            
            stage.setScene(mainScene);
            stage.setTitle("Main Scene");
            
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    void handleForgotLoginLink(ActionEvent event) {
        
        //Forgot Password Logic code
    }
            
}