import java.io.*;

public class Main3 {
    public static void main(String[] args) {

        File file = new File("users.ser");

        System.out.println(MyIOUtility.verifyUser(file,"admin2 admin2"));


        System.out.println(MyIOUtility.addUser(file,"admin4 admin04"));

    }







}
