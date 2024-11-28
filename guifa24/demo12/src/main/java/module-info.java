module org.example.demo12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demo12 to javafx.fxml;
    exports org.example.demo12;
}