module org.example.demo7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demo7 to javafx.fxml;
    exports org.example.demo7;
}