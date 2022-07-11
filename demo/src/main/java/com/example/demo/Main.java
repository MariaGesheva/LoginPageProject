package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage stg;

    @Override
    public void start(Stage primaryStage) throws IOException {
        stg = primaryStage;
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("Monzo Login");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
//        primaryStage.setTitle("Monzo Login");
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }

    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
    }

    public static void main(String[] args) {
        launch();
    }
}