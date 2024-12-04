import java.io.*;

public class MyIOUtility {

    public static String readFromFile(File file) {
        String temp="";
        StringBuilder sb=new StringBuilder();
        String text;
        try (BufferedReader reader= new BufferedReader(new FileReader(file))){
            while((text=reader.readLine())!=null){
                //temp+=text;
                sb.append(text).append("\n");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return  sb.toString();
    }

    public static void writeToFile(File file, String text)  {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file,true))){
            writer.write(text);
            writer.newLine();
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }


    public static boolean verifyUser(File file, String text){

        boolean found=false;
        String line="";
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(file))){
            while((line=bufferedReader.readLine())!=null){
                if(line.equals(text)){
                    found=true;
                    break;
                }

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return found;
    }



    public static boolean addUser(File file , String userInfo){
        boolean added=false;

        boolean alreadyExist=MyIOUtility.verifyUser(file,userInfo);
        MyIOUtility.writeToFile(file,userInfo);
        if(!alreadyExist){
            added=true;
        }

        return added;
    }

}
