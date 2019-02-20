package pl.academy.code.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pl.academy.code.App;

public class Pane2Controller {

    @FXML
    Button button;
    @FXML
    Button goBackButton;
    @FXML
    Label label;
    @FXML
    TextField textField;

    @FXML
    private void action(ActionEvent event) {
        label.setText(textField.getText());
    }

    @FXML
    private void goBack(ActionEvent event) {
        App.mainStage.setScene(App.scene1);
    }
}
