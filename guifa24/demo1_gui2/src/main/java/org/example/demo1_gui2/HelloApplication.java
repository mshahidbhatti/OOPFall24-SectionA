package org.example.demo1_gui2;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


import java.io.IOException;
import java.time.LocalDate;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
      //  FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        GridPane gridPane = new GridPane();
        //f://c:/
        Image topBanner= new Image(this.getClass().getResource("/banner.png").toExternalForm());
        ImageView imageView = new ImageView(topBanner);

        DatePicker dob = new DatePicker();
        Label dobLabel = new Label("DOB:");

        HBox datePickerBox= new HBox();
        datePickerBox.setPadding(new Insets(10));
        dob.valueProperty().addListener(new ChangeListener<LocalDate>() {
            @Override
            public void changed(ObservableValue<? extends LocalDate> observable, LocalDate oldValue, LocalDate newValue) {
                int age = LocalDate.now().getYear() - newValue.getYear();
                if (newValue.getMonthValue() > LocalDate.now().getMonthValue()
                        || (newValue.getMonthValue() == LocalDate.now().getMonthValue()
                                && newValue.getDayOfMonth() > LocalDate.now().getDayOfMonth())) {
                    age--;
                }
               // System.out.println();
                dobLabel.setText("Age: " + age);
            }
        });

        RadioButton maleRadioButton = new RadioButton("Male");
        RadioButton femaleRadioButton = new RadioButton("Female");
        HBox genderBox = new HBox();
        genderBox.setPadding(new Insets(10));
         genderBox.setAlignment(Pos.CENTER);
         genderBox.setSpacing(20);
       // genderBox.setBorder(new Border(null,null,null,null,null));
        genderBox.setStyle("-fx-border-color: #4682B4; -fx-border-width: 2px; -fx-border-radius: 5px;");

        ToggleGroup genderToggleGroup = new ToggleGroup();
        maleRadioButton.setToggleGroup(genderToggleGroup);
        femaleRadioButton.setToggleGroup(genderToggleGroup);
        genderBox.getChildren().addAll(maleRadioButton, femaleRadioButton);

        Slider weightSlider = new Slider();
        weightSlider.setMin(40);
        weightSlider.setMax(200);
        weightSlider.setMajorTickUnit(20);
        weightSlider.setMinorTickCount(5);
        weightSlider.setSnapToTicks(true);
        weightSlider.setShowTickLabels(true);
        weightSlider.setShowTickMarks(true);
        Label weightValueLabel = new Label(String.valueOf((int) weightSlider.getValue()));

        FileChooser fileChooser = new FileChooser();

        HBox hightHBox= new HBox();
        hightHBox.getChildren().addAll(weightSlider,weightValueLabel);
        hightHBox.setStyle("-fx-border-color: #4682B4; -fx-border-width: 2px; -fx-border-radius: 5px;");

        Slider heightSlider =new Slider();
        heightSlider.setShowTickLabels(true);
        heightSlider.setMinorTickCount(5);
        heightSlider.setMajorTickUnit(10);
        heightSlider.setSnapToTicks(true);
        heightSlider.setShowTickMarks(true);
        Label heightValueLabel = new Label(String.valueOf((int)heightSlider.getValue()));

        heightSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                heightValueLabel.setText(String.valueOf(newValue.intValue()));

            }
        });




        HBox heightHBox = new HBox();
        heightHBox.getChildren().addAll(heightSlider, heightValueLabel);
        Button calculateBMI=new Button("BMI");
        calculateBMI.setOnAction(e -> {
            double weight = weightSlider.getValue();
            double height = heightSlider.getValue();
            double bmi = weight / Math.pow(height, 2);
            Label bmiValueLabel = new Label("BMI: " + String.format("%.2f", bmi));
            gridPane.add(bmiValueLabel, 0, 7);
        });

        datePickerBox.getChildren().addAll( dob,dobLabel);


        gridPane.add(imageView, 0, 0, 1, 1);
        gridPane.add(datePickerBox, 0, 1, 1, 1);
        gridPane.add(genderBox, 0, 2, 1, 1);
        gridPane.add(hightHBox, 0, 4);
        gridPane.add(heightHBox, 0, 5);
        gridPane.add(calculateBMI, 0, 6);


        gridPane.add(weightSlider, 0,3);
        Scene scene = new Scene(gridPane, 700, 500);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        //stage.setScene(createSecondScreen());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static Scene createSecondScreen(){
        return new Scene(new GridPane(),500,600);
    }
}