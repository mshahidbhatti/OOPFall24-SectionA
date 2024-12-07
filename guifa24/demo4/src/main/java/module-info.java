module org.example.demo4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demo4 to javafx.fxml;
    exports org.example.demo4;
}