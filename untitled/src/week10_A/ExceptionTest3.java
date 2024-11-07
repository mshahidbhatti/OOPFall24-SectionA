package week10_A;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest3 {
    public static void main(String[] args)  {

            readFromFile(new File("test.data"));
         }

    public static void readFromFile(File file)  {

        try {
            FileReader reader = new FileReader(file);
        }
        catch(FileNotFoundException e) {

        }
    }

}
