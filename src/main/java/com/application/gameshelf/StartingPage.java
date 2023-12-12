package com.application.gameshelf;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class StartingPage extends Application {
    @Override
    public void start(Stage stage) throws Exception {
    // Load the FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Starting-Page.fxml"));
        Parent root = fxmlLoader.load();

    // Set the FXML content as the root of the scene
        Scene scene = new Scene(root, 1080, 768);

    // Set the scene to the stage
        stage.setScene(scene);

    // Set other stage properties if needed
        stage.setTitle("GameShelf");

    // Show the stage
        stage.show();
}

    public static void main(String[] args) {
        launch(args);
    }
}
