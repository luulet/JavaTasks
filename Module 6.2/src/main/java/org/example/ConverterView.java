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

    private Controller controller = new Controller();
    private Label resultField = new Label();
    public void start(Stage window) {
        VBox layout = new VBox();
        TextField textInput = new TextField();
        Label instruction = new Label("Enter the amount of euros to convert:");
        Button switchButton = new Button("Euro to Dollar");
        Button convertButton = new Button("Convert");

        layout.getChildren().add(instruction);
        layout.getChildren().add(textInput);
        layout.getChildren().add(resultField);
        layout.getChildren().add(switchButton);
        layout.getChildren().add(convertButton);




        window.setWidth(300);
        window.setHeight(300);



        switchButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                controller.toggleMode();
                if (controller.getMode()) {
                    switchButton.setText("Dollar to Euro");
                    instruction.setText("Enter the amount of dollars to convert:");
                } else {
                    switchButton.setText("Euro to Dollar");
                    instruction.setText("Enter the amount of euros to convert:");
                }
            }
        });
        convertButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    double result = controller.convert(Double.parseDouble(textInput.getText()));
                    resultField.setText(String.valueOf(result));
                } catch (Exception e) {
                    resultField.setText("Invalid input");
                }
            }
        });
        Scene view = new Scene(layout);
        layout.getStylesheets().add("style.css");
        window.setScene(view);
        window.show();





    }



    public static void main(String[] args) {
        launch(ConverterView.class);
    }
}

