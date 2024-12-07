package org.example.demo4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.BoundingBox;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloApplication extends Application {

    public void moveRect(Rectangle rectangle) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 20; i++) {
                    try {
                        rectangle.setX(rectangle.getX() + 10);

                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread.start();
    }



    public void moveRect(Rectangle rectangle, Rectangle newRect) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 20; i++) {
                    try {
                        rectangle.setX(rectangle.getX() + 10);
                        newRect.setX(rectangle.getWidth() -10);
//                        boolean colide=rectangle.intersects(new Bounds() {
//                        });
//                        if(colide) {
//                            System.out.println("Collision Detected");
//                            break;
//                        }

                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread.start();
    }


    @Override
    public void start(Stage stage) throws IOException {
       Pane pane =new Pane();
        Scene scene = new Scene(pane, 500, 600);
       Circle circle = new Circle(30,100,100);
       Line line =new Line(10,10,400,400);

       // pane.getChildren().add(circle);

        pane.setOnMouseMoved(e-> {
            circle.setCenterX(e.getX());
            circle.setCenterY(e.getY());

            line.setEndX(e.getX());
            line.setEndY(e.getY());



        });
      //  pane.setEventDispatcher();




        pane.setOnScroll(e->{
            circle.setRadius(circle.getRadius() + e.getDeltaY());
            circle.setCenterX(e.getX());
            circle.setCenterY(e.getY());
        });

        Rectangle rectangle=new Rectangle(1,1,200,200);
        Rectangle rectangle1 = new Rectangle(scene.getWidth(), scene.getHeight(),50,50);

        scene.setOnKeyPressed(e->{
            if(e.getCode().equals(KeyCode.UP)){
                rectangle.setY(rectangle.getY() - 50);
            }

            if(e.getCode().equals(KeyCode.DOWN)){
                rectangle.setY(rectangle.getY() + 50);
            }
            if(e.getCode().equals(KeyCode.LEFT)){
                rectangle.setX(rectangle.getX() - 50);
            }
            if(e.getCode().equals(KeyCode.RIGHT)){
                rectangle.setX(rectangle.getX() + 50);
            }
        });

        pane.setOnKeyTyped(e->{
            System.out.println("Typed: " + e.getCharacter());
        });

        pane.setOnMouseClicked(e->{
            circle.setFill(Color.LIGHTBLUE);
            moveRect(rectangle);
            moveRect(rectangle,rectangle1);
        });

        pane.getChildren().add(rectangle);
        pane.getChildren().add(line);
        pane.getChildren().add(rectangle1);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}