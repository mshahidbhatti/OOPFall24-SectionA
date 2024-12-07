package org.example.demo15;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

public class HelloApplication extends Application {

    File file = new File("data.ser");

    ArrayList<Person> list=new ArrayList<>();


    public void writeToFile(File file , Person person) throws IOException{
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(person);
        objectOutputStream.close();
    }

    public void readFromFile(File file ) throws IOException{

        FileInputStream fileInput = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInput);
        try {
            Object o=objectInputStream.readObject();
            Person person=(Person)o;
            System.out.println("Name: " + person.getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        GridPane grid = new GridPane();

        list.add(new Person("Person 1"));
        list.add(new Person("Person 2"));
        list.add(new Person("Person 3"));

        TextField nameTextField = new TextField();
        nameTextField.setPromptText("Enter your name");
        grid.add(nameTextField, 0, 0);


        Button button = new Button("Save");
        button.setOnAction(e->{
            FileOutputStream fout= null;
            try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file))){


                oos.writeObject(list);

            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }


        });
//        button.setOnAction(event -> {
//            String name = nameTextField.getText();
//            try {
//                writeToFile(file,new Person("person1"));
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Hello, " + name + "!");
//        });
        grid.add(button, 1, 0);

        Button readButton = new Button("Read");
        readButton.setOnAction(e->{
            try {
                ArrayList<Person> list1=new ArrayList<>();
                FileInputStream fin = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fin);
                list1 = (ArrayList<Person>) ois.readObject();
                System.out.println("Name: " + list1.get(0).getName());
                System.out.println("Name: " + list1.get(1).getName());
                System.out.println("Name: " + list1.get(2).getName());
                System.out.println();
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        });
//        readButton.setOnAction(event -> {
//            try {
//                readFromFile(file);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });

        grid.add(readButton,2,0);
        Scene scene = new Scene(grid, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}