import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) throws IOException { // throws clause

        File file = new File("user.dat");
        addUserNameAndPassword(file,"admin5","admin05");
        System.out.println(validateUser(file,"admin3","admin03"));
    }

    public static void addUserNameAndPassword(File file, String userName, String password) throws FileNotFoundException {
        if (password.length() > 6 && userName.length() > 2 && !validateUser(file, userName, password)) {
            {
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
                    bufferedWriter.write(userName + " " + password);
                    bufferedWriter.newLine();

                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            System.out.println("user already exists or password is too short");
        }
    }

    public static boolean validateUser(File file, String userName,String password) throws FileNotFoundException {
            boolean temp=false;
            try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
                String userDetails="";
                while((userDetails=bufferedReader.readLine())!=null){
                    String user[]= userDetails.split(" ");

                    if(user[0].equals(userName)&& user[1].equals(password)) {
                        temp = true;
                        break;
                    }
                    else {
                        System.out.println("not found");
                      //  System.out.println(user[1]);
                    }
                    }
            }catch (IOException e){
                System.out.println("Error: " + e.getMessage());
            }


        return temp;
    }

}



