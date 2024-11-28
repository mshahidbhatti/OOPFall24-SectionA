//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //Path=C:\\Users\\mshah\\Downloads    absolute

        //Path=C:/Users/mshah/Downloads   absolute path
        // File f="data.txt"
        //File f2 ="./data/data.txt"
        //File f3 = "../resources/data.temp"

        // textual data  //
        // binary data
        // File
        // FileReader f = new FileReader
        // BufferedReader
        //FileWrite
        // BufferedWrite
        // OutputStream
        //ObjectOutputStream
        //ObjectInputStream
        // ByteArrayOutputStream
        // ByteArrayInputStream

        File file = new File("data1.abc");
        System.out.println("File exists: " + file.exists());
        System.out.println(file.isDirectory());
//        System.out.println("File exists: " + file.exists());
//        System.out.println("File is hidden: " + file.isHidden());
//        System.out.println("File last modified: " + file.lastModified());
//        System.out.println("File size: " + file.length());
//        System.out.println(file.getAbsolutePath());


        writeToFile(file,"text for writing");

        System.out.println(readFromFile(file));


    }
    public static void writeToFile(File file, String text) throws IOException{
        // FileWriter writer= new FileWriter(file,true);

        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file, true))) { //autocolable access
            bufferedWriter.write(text);
            bufferedWriter.newLine(); // new line
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String readFromFile(File file){
        //FileReader reader = new FileReader(file);
        //BufferedReader bufferedReader = new BufferedReader(reader);
        String temp;
        try(BufferedReader reader=new BufferedReader(new FileReader(file))){
            temp= String.valueOf(reader.readLine());
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }

        return temp;
    }

}