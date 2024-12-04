import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main4 {
    public static void main(String[] args) {




    }

    public static boolean validateUser(File file, String [] userInfor){
    boolean found=false;

    try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
        String user="",password="";
        String text="";
        while((text= bufferedReader.readLine())!=null){
            String temparray[]=text.split(" ");
            user=temparray[0];
            password=temparray[1];
            


        }

    }
    catch (IOException e){

    }

    return found;
    }


}
