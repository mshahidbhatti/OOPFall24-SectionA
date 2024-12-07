package org.example.demo8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.media.AudioClip;

import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Paths;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        String audioFile ="C:\\temp\\oop\\OOPFall24-SectionA\\guifa24\\demo8\\src\\main\\resources\\wave.mp3";
        AudioClip sound = new AudioClip(Paths.get(audioFile).toUri().toASCIIString());
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 600);
        Rectangle rectangle=new Rectangle(50,50,50,50);
        rectangle.setFill(Color.RED);

        Rectangle rectangle2=new Rectangle(300,400,50,50);
        rectangle.setFill(Color.GREEN);


        Circle circle = new Circle(20,20,20);
        circle.setFill(Color.BLUE);


        Line line = new Line(20,20,100,100);

        pane.setOnMouseMoved(e-> {
            rectangle.setX(e.getX());
            rectangle.setY(e.getY());

            line.setEndX(e.getX());
            line.setEndY(e.getY());

//            if(rectangle2.intersects(rectangle.getLayoutBounds())){
//                System.out.println("collinsion detected");
//                rectangle2.setX(scene.getWidth()+50);
//                sound.play();
//            }

        });

        scene.setOnKeyPressed(e->{
            if(e.getCode().equals(KeyCode.UP)){
                rectangle.setY(rectangle.getY()-10);
            }

        });

        pane.setOnMouseClicked(e-> {
            //if(e.isAltDown())
            //    circle.setRadius(circle.getRadius()-10);
           // if(e.getEventType().equals(MouseEvent.BUTTON))
          //  circle.setRadius(circle.getRadius()+10);
            try {
                moveRandom(circle);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            //move(rectangle2);
        });




        pane.getChildren().add(rectangle2);
        pane.getChildren().add(line);
        pane.getChildren().add(rectangle);
        pane.getChildren().add(circle);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }




    public void move(Rectangle rect){


            try {

                for(int i=0;i<10;i++){
                    Thread.sleep(500);
                   // System.out.println("inside thread block");
                    rect.setX(rect.getX()+10);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }

    public void moveRandom(Circle circle) throws InterruptedException {
        while (true){

            Thread.sleep(100);
            circle.setCenterX(Math.random()*500);
            circle.setCenterY(Math.random()*600);
        }

    }


    public static void main(String[] args) {
        launch();
    }
}