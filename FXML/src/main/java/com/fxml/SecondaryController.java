package com.fxml;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SecondaryController implements Initializable{
    String [] animal={"cat","dog","horse"};
    String s;
    @FXML
    ComboBox <String> combo;
    @FXML
    ImageView imageview;
    @FXML
    Button close;
    @FXML 
    void select(ActionEvent event){ 
        s=combo.getSelectionModel().getSelectedItem(); 
        File file = new File(s+".jpg");
        Image myimage = new Image(file.toURI().toString());
        imageview.setImage(myimage);
    }
    @FXML
    void exit(ActionEvent event){  
        Platform.exit();
    }
    @Override
    public void initialize(URL arg0, ResourceBundle agr1)  {
        combo.getItems().addAll(animal);
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        
    }
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
}