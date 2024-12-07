package org.example.demo5;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.awt.Toolkit;

public class RectangleIntersectionWithBeep extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create two rectangles
        Rectangle rect1 = new Rectangle(50, 50, 100, 100); // x=50, y=50, width=100, height=100
        rect1.setFill(Color.BLUE);

        Rectangle rect2 = new Rectangle(120, 120, 100, 100); // x=120, y=120, width=100, height=100
        rect2.setFill(Color.RED);

        // Check if the two rectangles intersect
        boolean intersects = rect1.getBoundsInLocal().intersects(rect2.getBoundsInLocal());

        // Print the result
        System.out.println("Rectangles intersect: " + intersects);

        // Play a beep sound if rectangles intersect
        if (intersects) {
            Toolkit.getDefaultToolkit().beep(); // This plays the system beep sound
        }

        // Visualize rectangles
        javafx.scene.layout.Pane pane = new javafx.scene.layout.Pane(rect1, rect2);
        Scene scene = new Scene(pane, 300, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Rectangle Intersection with Beep");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
