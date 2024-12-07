module org.example.demo15 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demo15 to javafx.fxml;
    exports org.example.demo15;
}