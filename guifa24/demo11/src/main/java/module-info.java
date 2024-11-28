module org.example.demo11 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demo11 to javafx.fxml;
    exports org.example.demo11;
}