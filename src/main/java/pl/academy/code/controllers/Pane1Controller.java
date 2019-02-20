package pl.academy.code.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import pl.academy.code.App;

public class Pane1Controller {

    private int clicks = 0;
    @FXML
    Button button1;
    @FXML
    Button changeSceneButton;

    @FXML
    Label label1;

    @FXML
    private void someAction(ActionEvent event) {
        System.out.println("Klik !!!!!!!!!");
        this.clicks ++;
        this.label1.setText("Clicks: " + this.clicks + " !!!");
    }

    @FXML
    private void changeScene(ActionEvent event) {
        App.mainStage.setScene(App.scene2);
    }
}
