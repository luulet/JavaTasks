package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


import static javafx.application.Application.launch;

public class ConverterView extends Application {

    private ConverterController controller = new ConverterController();
    private Label resultField = new Label();
    public void start(Stage view) {
        VBox layout = new VBox();
        TextField textInput = new TextField();
        Button switchButton = new Button("Euro to Dollar");
        Button convertButton = new Button("Convert");

        layout.getChildren().add(textInput);
        layout.getChildren().add(resultField);
        layout.getChildren().add(switchButton);
        layout.getChildren().add(convertButton);


        view.setScene(new Scene(layout));
        view.setWidth(200);
        view.setHeight(300);
        view.show();
        layout.getStylesheets().add("style.css");

        switchButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                controller.toggleMode();
                if (controller.getMode()) {
                    switchButton.setText("Dollar to Euro");
                } else {
                    switchButton.setText("Euro to Dollar");
                }
            }
        });
        convertButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

            }
        });





    }



    public static void main(String[] args) {
        launch(ConverterView.class);
    }
}

