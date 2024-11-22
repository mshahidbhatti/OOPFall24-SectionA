module org.example.demo1_gui2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demo1_gui2 to javafx.fxml;
    exports org.example.demo1_gui2;
}