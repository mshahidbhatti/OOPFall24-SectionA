module org.example.demo14 {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.j;


    opens org.example.demo14 to javafx.fxml;
    exports org.example.demo14;
}