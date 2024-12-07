package org.example.demo6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.media.AudioClip;

import java.nio.file.Paths;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Use an absolute path for the audio file
        String audioFilePath = "C:\\temp\\oop\\OOPFall24-SectionA\\guifa24\\demo6\\src\\main\\resources\\wave.mp3";
        AudioClip sound = new AudioClip(Paths.get(audioFilePath).toUri().toString());

        // Play the sound
        sound.play();

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Sound Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
