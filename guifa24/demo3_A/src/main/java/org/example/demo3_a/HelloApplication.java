package org.example.demo3_a;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    TextField nameTextField = new TextField();

    static ArrayList<Candidate> candidateArrayList=new ArrayList<Candidate>();
    @Override
    public void start(Stage stage) throws IOException {
     //   FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        GridPane grid = new GridPane();
       // Image image = new Image(this.getClass().getResource("/dataentry.png").toExternalForm());
        Image image = new Image("file:C:\\temp\\oop\\OOPFall24-SectionA\\guifa24\\demo3_A\\src\\main\\resources\\dataentery.png");
        ImageView imageView = new ImageView(image);

        grid.add(imageView, 0, 0, 2,1);
       // TextField nameTextField = new TextField();
        Label nameLabel = new Label("Name");

        HBox nameHBox = new HBox();
        nameHBox.setSpacing(10);
        nameHBox.setBorder(new Border(new BorderStroke(
                Color.WHITE,                  // Border color
                BorderStrokeStyle.SOLID,      // Border style
                CornerRadii.EMPTY,            // Corner radii
                new BorderWidths(2, 4, 6, 8)  // Border widths (top, right, bottom, left)
        )));

        nameHBox.setPadding(new Insets(10));
        nameHBox.getChildren().addAll(nameLabel, nameTextField);
        grid.add(nameHBox, 0, 1, 1, 1);

        DatePicker dobDatePicker = new DatePicker();
        Label dobLabel = new Label("Date of Birth");

        HBox dobHBox = new HBox();
        dobHBox.setPadding(new Insets(10));
        dobHBox.setSpacing(10);
        dobHBox.getChildren().addAll(dobLabel, dobDatePicker);
        dobHBox.setBorder(new Border(new BorderStroke(
                Color.WHITE,                  // Border color
                BorderStrokeStyle.SOLID,      // Border style
                CornerRadii.EMPTY,            // Corner radii
                new BorderWidths(2, 4, 6, 8)  // Border widths (top, right, bottom, left)
        )));
        grid.add(dobHBox, 1, 1, 1, 1);

        RadioButton male=new RadioButton("Male");
        RadioButton female=new RadioButton("Female");
        ToggleGroup genderToggle=new ToggleGroup();
        male.setToggleGroup(genderToggle);
        female.setToggleGroup(genderToggle);

        HBox genderHBox = new HBox();
        genderHBox.setPadding(new Insets(10));
        genderHBox.setSpacing(10);
        genderHBox.getChildren().addAll(male, female);
        genderHBox.setBorder(new Border(new BorderStroke(
                Color.WHITE,                  // Border color
                BorderStrokeStyle.SOLID,      // Border style
                CornerRadii.EMPTY,            // Corner radii
                new BorderWidths(2, 4, 6, 8)  // Border widths (top, right, bottom, left)
        )));
        grid.add(genderHBox, 0, 2, 2, 1);


        Slider heightSlider = new Slider();

        heightSlider.setPrefWidth(300);
        heightSlider.setMin(100);
        heightSlider.setMax(400);
        heightSlider.setValue(175);
        heightSlider.setShowTickLabels(true);

        Label heightLabel =new Label("Height in cm");
        HBox heightHBox = new HBox();
        heightHBox.setPadding(new Insets(10));
        heightHBox.setSpacing(10);
        //heightLabel.setText("Height in cm");
        Label heightLabelValue= new Label();
        heightSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                heightLabelValue.setText(String.valueOf(heightSlider.getValue()));
                //System.out.println(String.valueOf(heightSlider.getValue()));
            }
        });



        heightLabel.setPrefWidth(100);
        heightHBox.getChildren().addAll(heightSlider);

        grid.add(heightLabelValue,1,3);

        ComboBox<String> cityCombo = new ComboBox<String>();
        cityCombo.getItems().addAll("New York", "London", "Paris", "Tokyo", "Sydney");
        Label cityLabel = new Label("City");
        HBox cityHBox = new HBox();
        cityHBox.getChildren().addAll(cityLabel,cityCombo);

        //FileChooser imageFileChooser = new FileChooser();
        Image yourImage=new Image("file:C:\\temp\\oop\\OOPFall24-SectionA\\guifa24\\demo3_A\\src\\main\\resources\\logo.png");
        ImageView imageView1=new ImageView(yourImage);



        Button submitButton=new Button("Submit Data");
        submitButton.setOnAction(e->{
            System.out.println("Name: "+nameTextField.getText());
            System.out.println("Date of Birth: "+dobDatePicker.getValue());
            System.out.println("Gender: "+genderToggle.getSelectedToggle().getUserData());
            System.out.println("Height: "+heightSlider.getValue());
            System.out.println("City: "+cityCombo.getValue());
            Candidate candidate=new Candidate(nameTextField.getText(),dobDatePicker.getValue().toString(),cityCombo.getValue());
            candidateArrayList.add(candidate);
            System.out.println("added successfully");
            stage.setScene(getSecondScreenScene());

        });


        grid.add(heightSlider, 0,3);
        grid.add(cityHBox, 1, 2);
        grid.add(submitButton, 1, 4);

        //grid.add(imageView1,1,6);



        Scene scene = new Scene(grid, 800, 800);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public  Scene getSecondScreenScene(){
        Stage secondStage = new Stage();
        GridPane secondGrid = new GridPane();
        secondGrid.add(new TextField( nameTextField.getText()),1,1);
        Label secondLabel = new Label("This is the second screen");
        secondGrid.add(secondLabel, 0, 0);
        Scene secondScene = new Scene(secondGrid, 800, 800);
        secondStage.setTitle("Second Screen");
        secondStage.setScene(secondScene);
        return secondScene;
    }
}