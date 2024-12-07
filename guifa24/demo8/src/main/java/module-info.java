module org.example.demo8 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens org.example.demo8 to javafx.fxml;
    exports org.example.demo8;
}