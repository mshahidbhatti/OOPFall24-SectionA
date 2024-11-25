module org.example.demo3_a {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demo3_a to javafx.fxml;
    exports org.example.demo3_a;
}