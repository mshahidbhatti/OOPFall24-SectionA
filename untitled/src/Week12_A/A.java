package Week12_A;

public class A {
    int a=0;


    A(int i) {
        if(i<0)
            throw new IllegalArgumentException("Invalid input: "+i);
        a=i;
    }

}
