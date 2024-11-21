module org.example.gui_demo1_a {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.gui_demo1_a to javafx.fxml;
    exports org.example.gui_demo1_a;
}