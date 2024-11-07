package Week12_A;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {

        System.out.println("Welcome to our ERP");
        try {
            A obj = new A(-1);
        }
        catch (IllegalArgumentException e){
            System.out.println("Invalid argument: " + e.getMessage());
        }

        Scanner scanner=new Scanner(System.in);
        try {

            int array[]={1,2,3};
            int a = scanner.nextInt();
            int b = 10;
            System.out.println("Some processing");
            System.out.println(b / a);
            System.out.println("Array index"+array[4]);
        }

        catch (NullPointerException  e){
            System.out.println("Inside NullpointerException");
        }
        catch (ArithmeticException e){
            System.out.println("inside Arithmetic exception");
        }
        catch (InputMismatchException e){
            System.out.println("Input mismatch");
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        finally {
            scanner.close();
        }
        System.out.println("Thanks you for using our software");





    }
}
