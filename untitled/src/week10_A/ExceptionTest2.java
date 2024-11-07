package week10_A;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTest2 {
    public static void main(String[] args) {


        File file = new File("data.txt");

        try {
            FileWriter fw = new FileWriter(file);
        }
        catch(IOException e){

        }




    }
}
