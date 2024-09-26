package week4_A;

import Week4_B.Product;

public class ArraysTest {
    public static void main(String args[]) {

        int list[]= new int[100]; // 0 -99 indexes , default values 0
        list[1]= 23432;
        int a=list[2];

        char[] charArray = new char[123];
        System.out.println(charArray);

        Product productList[] = new Product[23];
        for(int i=0; i <productList.length;i++)
            System.out.println(productList[i]);

        System.out.println(productList.length);
        int[] a1, b={1,2,3,4}, c= new int[5];
        a1= new int[200];
        int x[], y, z;


        System.out.println(a1);
        //int x[] ={1,2,3,4,5};

    }
}
