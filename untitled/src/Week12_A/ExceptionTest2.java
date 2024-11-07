package Week12_A;

import java.io.File;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionTest2 {
    public static void main(String[] args)  {

        File file = new File("data.txt");


        try (Scanner sc = new Scanner(file)){
            readFromFile(file);
        }
        catch (IOException e) {

        }
        catch (MyException e) {

        }

    }

    public static void readFromFile(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
    }
}
