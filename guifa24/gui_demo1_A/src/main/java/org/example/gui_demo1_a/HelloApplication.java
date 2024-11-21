package org.example.gui_demo1_a;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloApplication extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        // StackPane , FlowPane, GridPane, BorderedPane, HBox, VBox
      //  FlowPane flowPane = new FlowPane();
        GridPane gridPane = new GridPane();
        gridPane.setHgap(15);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(15,15,15,15));

        Scene scene = new Scene(gridPane, 500, 300);
        Text welcomeText = new Text("Welcome to login screen");
        welcomeText.setFont(new Font(30));

        gridPane.add(welcomeText,0,0,2,1);
       // flowPane.getChildren().add(welcomeText);

        Label userNameLabel= new Label("User Name");
        gridPane.add(userNameLabel,0,1);

        TextField userNameTextField= new TextField();
        gridPane.add(userNameTextField,1,1);

        Label passwordLabel= new Label("Password");
        gridPane.add(passwordLabel,0,2);

        PasswordField passwordField= new PasswordField();
        gridPane.add(passwordField,1,2);

        Button loginButton = new Button("Login");
       // gridPane.add(loginButton,1,3);

        loginButton.setOnAction(e -> {
           // System.out.println(userNameTextField.getText());
            if(userNameTextField.getText().equals(Credentials.username)) {
                System.out.println("Logged in");
                primaryStage.setScene(new Scene(new FlowPane(), 100, 100));
            }
            else
                System.out.println("Incorrect username");
        });

        Button canelButton = new Button("Cancel");
//        canelButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//
//                System.exit(0);
//            }
//        });


        canelButton.setOnAction(e->System.exit(0));


       // gridPane.add(canelButton,2,3);

        HBox hBox = new HBox();
        hBox.setSpacing(5);
        hBox.getChildren().addAll(loginButton,canelButton);
        hBox.setAlignment(Pos.BASELINE_RIGHT);
        gridPane.add(hBox,1,3);
       // gridPane.add(welcomeText, 0,0);




        primaryStage.setScene(scene);
        primaryStage.setTitle("My first Gui application");
       // primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}