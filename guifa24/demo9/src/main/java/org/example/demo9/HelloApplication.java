package org.example.demo9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.media.AudioClip;

import java.io.IOException;
import java.nio.file.Paths;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        String filePath= "C:\\temp\\oop\\OOPFall24-SectionA\\guifa24\\demo9\\src\\main\\resources\\noti.mp3";
        AudioClip sound = new AudioClip(Paths.get(filePath).toUri().toString());

        Pane pane =new Pane();
        Rectangle rectangle1 = new Rectangle(20,20, 50,50);
        rectangle1.setFill(Color.RED);

        Rectangle rectangle2 = new Rectangle(80,80,50,50);
        rectangle2.setFill(Color.BLUE);


        pane.setOnMouseMoved(e->{
            rectangle1.setX(e.getX());
            rectangle1.setY(e.getY());
            if(rectangle1.intersects(rectangle2.getLayoutBounds())){

                rectangle1.setFill(Color.YELLOW);
                sound.play();
            }

        });

        pane.getChildren().addAll(rectangle1, rectangle2);

        Scene scene = new Scene(pane, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}