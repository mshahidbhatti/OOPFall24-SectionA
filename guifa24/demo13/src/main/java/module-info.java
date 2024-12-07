module org.example.demo13 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.demo13 to javafx.fxml;
    exports org.example.demo13;
}