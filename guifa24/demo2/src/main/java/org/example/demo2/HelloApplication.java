package org.example.demo2;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


import java.awt.event.KeyEvent;
import java.io.IOException;

public class HelloApplication extends Application {

    TableView table= new TableView();

    ObservableList<Person> data=FXCollections.observableArrayList(new Person("Jacob", "Smith", "jacob.smith@example.com"),
            new Person("Isabella", "Johnson", "isabella.johnson@example.com"),
            new Person("Ethan", "Williams", "ethan.williams@example.com"),
            new Person("Emma", "Jones", "emma.jones@example.com"),
            new Person("Michael", "Brown", "michael.brown@example.com"));


    @Override
    public void start(Stage stage) throws IOException {
     //   FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Group group = new Group();
        Label label = new Label("Contact List");

        label.setFont(new Font("Arial", 20));

        table.setEditable(true);

        TableColumn firstNameColumn = new TableColumn("First Name");

        firstNameColumn.setMinWidth(100);

        firstNameColumn.setCellValueFactory(new PropertyValueFactory<Person,String>("firstName"));

        firstNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        firstNameColumn.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                ((Person) event.getTableView().getItems().get(event.getTablePosition().getRow())).setFirstName((String) event.getNewValue());
            }
        });

        

        TableColumn lastNameColumn = new TableColumn("Last Name");
        lastNameColumn.setMinWidth(100);
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<Person,String>("lastName"));

        TableColumn emailColumn = new TableColumn("Email");
        emailColumn.setMinWidth(200);
        emailColumn.setCellValueFactory(new PropertyValueFactory<Person,String>("email"));

        table.getColumns().addAll(firstNameColumn, lastNameColumn, emailColumn);

        table.setItems(data);

        TextField firstName = new TextField();
        firstName.setPromptText("First Name");

        TextField lastName = new TextField();
        lastName.setPromptText("Last Name");

        TextField email = new TextField();
        email.setPromptText("Email");

        Button addButton=new Button("Add");
 //       addButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                data.add(new Person(firstName.getText(), lastName.getText(), email.getText()));
//                // KeyEvent k= (KeyEvent) event.getSource();
//                firstName.clear();
//                lastName.clear();
//                email.clear();
//            }
//        });

        addButton.setOnAction(e->{
            data.add(new Person(firstName.getText(), lastName.getText(), email.getText()));
            firstName.clear();  lastName.clear();     email.clear();
        });


        HBox hBox = new HBox();
        hBox.getChildren().addAll(firstName,lastName,email,addButton);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, table,hBox);
        vBox.setSpacing(5);
        vBox.setPadding(new Insets(5));

        group.getChildren().add(vBox);
        Scene scene = new Scene(group, 600, 800);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static class Person {

        private final SimpleStringProperty firstName;
        private final SimpleStringProperty lastName;
        private final SimpleStringProperty email;

        private Person(String fName, String lName, String email) {
            this.firstName = new SimpleStringProperty(fName);
            this.lastName = new SimpleStringProperty(lName);
            this.email = new SimpleStringProperty(email);
        }

        public String getFirstName() {
            return firstName.get();
        }

        public void setFirstName(String fName) {
            firstName.set(fName);
        }

        public String getLastName() {
            return lastName.get();
        }

        public void setLastName(String fName) {
            lastName.set(fName);
        }

        public String getEmail() {
            return email.get();
        }

        public void setEmail(String fName) {
            email.set(fName);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}