module org.example.demo3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.demo3 to javafx.fxml;
    exports org.example.demo3;
}