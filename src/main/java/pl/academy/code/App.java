package pl.academy.code;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class App extends Application {

    public static Stage mainStage;

    public static Scene scene1;
    public static Scene scene2;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        App.mainStage = stage;
        stage.setTitle("Aplikacja !!!");

        /*FlowPane flowPane = new FlowPane();

        Button button = new Button();
        button.setText("Click me !!");
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Klik !!!");
            }
        });

        flowPane.getChildren().add(button);*/

        Parent pane1 = FXMLLoader.load(getClass().getClassLoader().getResource("pane1.fxml"));
        Parent pane2 = FXMLLoader.load(getClass().getClassLoader().getResource("pane2.fxml"));

        App.scene1 = new Scene(pane1, 300, 300);
        App.scene2 = new Scene(pane2, 300, 300);

        stage.setScene(App.scene1);
        stage.setResizable(false);

        stage.show();
    }
}
