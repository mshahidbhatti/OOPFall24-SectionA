package org.example.demo1_b;

import javafx.application.Application;
import javafx.application.Preloader;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class HelloApplication  extends Application {
    @Override
    public void start(Stage stage) throws IOException {
         // layout
        Text welcomeText=new Text("Welcome to our login screen");
        welcomeText.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        Label userlabel = new Label("User Name");
        Label passwordLabel = new Label("Password");

        TextField userNameText = new TextField();

        Button okButton = new Button("Hello GUI");
        PasswordField passwordField=new PasswordField();

        Button login = new Button("Login");
        Button cancel = new Button("Cancel");

        GridPane gridPane = new GridPane();
        gridPane.add(welcomeText,0,0,2,1);
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(10);
        gridPane.setVgap(10);

        HBox hbox = new HBox();
        hbox.getChildren().addAll(login, cancel);
        hbox.setAlignment(Pos.BOTTOM_RIGHT);
        hbox.setSpacing(10);
        cancel.setOnAction(e-> stage.hide());
        gridPane.add(userlabel,0,1);
        gridPane.add(userNameText,1,1);
        gridPane.add(passwordLabel,0,2);
        gridPane.add(passwordField,1,2);
        gridPane.add(hbox,1,3);
        //gridPane.add(cancel,2,3);



        Scene scene = new Scene(gridPane,500,200);

        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {

        launch();
    }
}