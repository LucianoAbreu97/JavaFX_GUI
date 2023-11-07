package sample.first_gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        //Load FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/scene/loginScene.fxml"));
        Parent root = loader.load();
        
        //Create Scene
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Login Screen");
        
        //Show Stage
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}