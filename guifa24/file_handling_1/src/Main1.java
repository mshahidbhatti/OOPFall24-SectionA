import java.io.*;

public class Main1 {
    public static void main(String[] args) throws IOException {
        File file = new File("data.abc");
        // FileReader, FileWriter character wise file read and write
        // Bufffered Reader , BufferedWriter   // usually used for large text files

//        FileReader reader = new FileReader(file);
//        int a=reader.read();
//        int b=reader.read();
//        System.out.println(b);

        FileWriter fileWriter= new FileWriter(file,true);
        //fileWriter.write('A');
        //fileWriter.close();
        BufferedWriter buffWriter= new BufferedWriter(fileWriter);
        buffWriter.write("This is file ");
        buffWriter.newLine();
        buffWriter.close();

        FileReader reader = new FileReader(file);
        BufferedReader buffReader= new BufferedReader(reader);
        String text="";
        while((text=buffReader.readLine())!=null)
        {
            System.out.println(text);
        }

//        String text1=buffReader.readLine();
//        String text2=buffReader.readLine();
//        String text3=buffReader.readLine();
//        String text4=buffReader.readLine();
//        String text5=buffReader.readLine();
//        System.out.println(text1);
//        System.out.println(text2);
//        System.out.println(text3);
//        System.out.println(text4);






    }
}
