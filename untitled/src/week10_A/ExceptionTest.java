package week10_A;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("Welcome to exception handling demo");
        Scanner scanner = new Scanner(System.in);


try {
    int array[]={1,2,3};

    int a=scanner.nextInt();

    int b=5;

    System.out.println(b / array[4]);
}
catch (InputMismatchException | ArrayIndexOutOfBoundsException  e){
    System.out.println("InputmismatchException");
}
//catch(ArithmeticException e){
//    System.out.println("In arithmetic exception");
//}
//catch (ArrayIndexOutOfBoundsException e){
//    System.out.println("ArithmeticException :"+e.getMessage());
//}
catch (RuntimeException e){

}


finally {
    System.out.println("Inside finally block");
    System.out.println("This block will always execute");
}


        System.out.println("Thank you for using our software");

    }
}
