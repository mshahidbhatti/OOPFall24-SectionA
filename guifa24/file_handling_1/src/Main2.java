import java.io.*;

// APIs

public class Main2 {
    public static void main(String[] args) {

        File file= new File("users.ser");


        MyIOUtility.writeToFile(file,"admin admin");

        String text=MyIOUtility.readFromFile(file);
        System.out.println(text);
    }

}
