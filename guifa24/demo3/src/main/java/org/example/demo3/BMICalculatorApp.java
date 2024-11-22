package org.example.demo3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.*;

public class BMICalculatorApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane= new GridPane();
        gridPane.setPadding(new Insets(15));

        Image image=new Image(getClass().getResource("/logo.png").toExternalForm());
        ImageView imageView= new ImageView(image);

        HBox datePickerBox= new HBox();

        datePickerBox.setBorder(new Border(new BorderStroke(Color.BLUE, // Border color
                BorderStrokeStyle.SOLID, // Border style
                new CornerRadii(5), // Rounded corners
                new BorderWidths(2) // Border width)
                 )));
        Label dateLabel= new Label("Date of Birth:");
        DatePicker datePicker= new DatePicker();
        datePickerBox.getChildren().addAll(dateLabel, datePicker);
        gridPane.add(datePickerBox,0,0);
        gridPane.add(imageView,0,1);
        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("BMI Calculator App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
