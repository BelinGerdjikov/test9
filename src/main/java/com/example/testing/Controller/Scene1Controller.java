package com.example.testing.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1Controller {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    void toScene2(ActionEvent event) throws IOException {
        root= FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
