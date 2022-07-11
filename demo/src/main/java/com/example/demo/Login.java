package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Login {
    public Login() {

    }

    @FXML
    private Button loginButton;
    @FXML
    private Button cancelButton;
    @FXML
    private Label wrongLogin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    public void userLogin(ActionEvent event) throws IOException {
        checkLogin();
    }

    private void checkLogin() throws IOException {
        Main m = new Main();
        if (username.getText().toString().equals("javacoding") && password.getText().toString().equals("123")) {
            wrongLogin.setText("Successful login!");

            m.changeScene("afterLogin.fxml");

        } else if (username.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogin.setText("Fields cannot be empty!");
        } else {
            wrongLogin.setText("Wrong username or password!");
        }
    }

    private void cancelButtonOnAction(ActionEvent event) {
        Stage stg = (Stage) cancelButton.getScene().getWindow();
        stg.close();
    }
}
