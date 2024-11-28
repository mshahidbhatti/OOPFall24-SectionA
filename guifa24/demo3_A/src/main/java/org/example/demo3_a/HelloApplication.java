package org.example.demo3_a;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;

public class HelloApplication extends Application {
    TextField nameTextField = new TextField();
    static ArrayList<Candidate> candidateArrayList = new ArrayList<>();

    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);

        // Banner Image
        Image bannerImage = new Image("file:C:\\temp\\oop\\OOPFall24-SectionA\\guifa24\\demo3_A\\src\\main\\resources\\dataentery.png");
        ImageView bannerImageView = new ImageView(bannerImage);
        bannerImageView.setFitWidth(600);
        bannerImageView.setFitHeight(150);
        bannerImageView.setPreserveRatio(true);
        grid.add(bannerImageView, 0, 0, 2, 1);

        // Name Field
        Label nameLabel = new Label("Name:");
        nameTextField.setPrefWidth(200);
        grid.add(nameLabel, 0, 1);
        grid.add(nameTextField, 1, 1);

        // Date of Birth Field
        Label dobLabel = new Label("Date of Birth:");
        DatePicker dobDatePicker = new DatePicker();
        grid.add(dobLabel, 0, 2);
        grid.add(dobDatePicker, 1, 2);

        // Gender Selection
        Label genderLabel = new Label("Gender:");
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        ToggleGroup genderToggle = new ToggleGroup();
        male.setToggleGroup(genderToggle);
        female.setToggleGroup(genderToggle);
        HBox genderBox = new HBox(10, male, female);
        grid.add(genderLabel, 0, 3);
        grid.add(genderBox, 1, 3);

        // Height Slider
        Label heightLabel = new Label("Height (cm):");
        Slider heightSlider = new Slider(100, 250, 175);
        heightSlider.setShowTickLabels(true);
        heightSlider.setShowTickMarks(true);
        heightSlider.setMajorTickUnit(50);
        heightSlider.setMinorTickCount(5);
        Label heightValueLabel = new Label(String.valueOf(heightSlider.getValue()));
        heightSlider.valueProperty().addListener((observable, oldValue, newValue) ->
                heightValueLabel.setText(String.format("%.1f", newValue.doubleValue()))
        );
        grid.add(heightLabel, 0, 4);
        grid.add(heightSlider, 1, 4);
        grid.add(heightValueLabel, 2, 4);

        // City Selection
        Label cityLabel = new Label("City:");
        ComboBox<String> cityComboBox = new ComboBox<>();
        cityComboBox.getItems().addAll("New York", "London", "Paris", "Tokyo", "Sydney");
        grid.add(cityLabel, 0, 5);
        grid.add(cityComboBox, 1, 5);

        // File Chooser for Image
        Button fileChooserButton = new Button("Choose Image");
        ImageView selectedImageView = new ImageView();
        fileChooserButton.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            File selectedFile = fileChooser.showOpenDialog(stage);
            if (selectedFile != null) {
                Image selectedImage = new Image(selectedFile.toURI().toString());
                selectedImageView.setImage(selectedImage);
                selectedImageView.setFitWidth(150);
                selectedImageView.setFitHeight(150);
                selectedImageView.setPreserveRatio(true);
            }
        });
        grid.add(fileChooserButton, 0, 6);
        grid.add(selectedImageView, 1, 6);

        // Submit Button
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> {
            String gender = genderToggle.getSelectedToggle() != null
                    ? ((RadioButton) genderToggle.getSelectedToggle()).getText()
                    : "Not Selected";

            System.out.println("Name: " + nameTextField.getText());
            System.out.println("Date of Birth: " + dobDatePicker.getValue());
            System.out.println("Gender: " + gender);
            System.out.println("Height: " + heightSlider.getValue());
            System.out.println("City: " + cityComboBox.getValue());
        });
        grid.add(submitButton, 0, 7);

        // Scene and Stage
        Scene scene = new Scene(grid, 800, 600);
        stage.setTitle("Data Entry Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
