package com.fxml;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;  
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class PrimaryController {
    @FXML
    private Label label2;
    @FXML
    private TextField text;
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void reactToClick( ) throws IOException {      
        String s=text.getText();
        double i = Double.parseDouble(s);
        label2.setText(s+" meter = "+i/1000+" kilometer");
    }
    }


