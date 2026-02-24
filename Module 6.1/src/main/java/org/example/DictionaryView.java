package org.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class DictionaryView extends Application {
    private Label result = new Label();
    private DictionaryController controller = new DictionaryController();

    public void start(Stage stage) {
        FlowPane layout = new FlowPane();
        TextField textInput = new TextField();
        Button button = new Button("Search");


        layout.getChildren().add(textInput);
        layout.getChildren().add(button);
        layout.getChildren().add(result);
        Scene view = new Scene(layout);
        stage.setHeight(200);
        stage.setWidth(300);
        stage.setScene(view);
        stage.show();

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String word = textInput.getText();
                String definition = controller.searchDefinition(word);
                result.setText(definition);
            }
        });



    }


    public static void main(String[] args) {
        launch(DictionaryView.class);
    }
}
