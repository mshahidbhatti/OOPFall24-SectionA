module org.example.demo10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demo10 to javafx.fxml;
    exports org.example.demo10;
}