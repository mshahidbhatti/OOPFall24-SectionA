module org.example.demo1_b {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.demo1_b to javafx.fxml;
    exports org.example.demo1_b;
}