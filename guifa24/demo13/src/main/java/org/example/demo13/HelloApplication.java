package org.example.demo13;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane grid=new GridPane();
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        TextField nameTextField = new TextField();

        Button helloButton = new Button("Hello");

        Button readButton = new Button("Read");
        readButton.setOnAction(e->{
           // FileInput
        });

        helloButton.setOnAction(e->{
            try {
                FileOutputStream fout=new FileOutputStream("abc.ser");
                ObjectOutputStream oout=new ObjectOutputStream(fout);
                oout.writeObject(new Person(nameTextField.getText()));
                oout.close();
                System.out.println("Object has been serialized");
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        });
        grid.add(nameTextField, 0, 0);
        grid.add(helloButton, 1, 0);
        grid.add(readButton, 0, 1);
        Scene scene = new Scene(grid, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}