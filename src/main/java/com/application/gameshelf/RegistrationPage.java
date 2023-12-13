package com.application.gameshelf;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;


public class RegistrationPage extends Application {

    @Override
    public void start(Stage myStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Starting-Page.fxml"));
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root, 1040, 1440);

        myStage.setScene(scene);

        myStage.setTitle("Gameshelf");

        myStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
