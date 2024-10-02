package Week5_A;

public class Main {
    public static void main(String[] args) {
        int array[][]= new int[10][];
        System.out.println(array.length);
        array[0]=new int[3];
        array[1]=new int[18];

        System.out.println(array.length); // address of two dimensional
        System.out.println(array[0].length); // address of one dimensional
        System.out.println(array[1][0]); // element
    }
}
