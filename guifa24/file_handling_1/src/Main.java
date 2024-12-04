import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        // File Handling
        // characters, binary , stream
        // absolute path C:\temp\oop\OOPFall24-SectionA\guifa24\file_handling_1\src\Main.java
        // absolute path C:\temp\filehandling
        // relative path file_handling_1/
        // relative path src/Main.java   /data/data.txt, data/images/image1.png
        // C:\temp\oop\exms  ,  C:\temp\filehandling  , ../oop/exam/.*
        // classes
        // File

        File file = new File("data.abc");  //file_handling_1.iml
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());

        System.out.println(file.isDirectory());
        System.out.println(file.isHidden());

        //file.mkdir(); //
       // file.delete();

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}