package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class AfterLogin {

    @FXML
    private Button logout;
    @FXML
    private Label thankYou;

    public void userLogout(ActionEvent event) throws IOException{
        Main m = new Main();
        m.changeScene("login.fxml");
    }
}
