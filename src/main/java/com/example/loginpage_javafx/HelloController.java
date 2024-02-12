package com.example.loginpage_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;


    public void btn_click(ActionEvent actionEvent){welcomeText.setText("Welcome to Login Page");}

    public void cancel_btn_click(ActionEvent actionEvent) {welcomeText.setText("Back to the Main Menu");}
}