package Week7_B.Lecture2;

public class A {
    static int a=200;
    int x=999;
    int i=0;
    A(){
        super();
        System.out.println("A constructor called "+ i);
    }
    A(int i){
        super();
        this.i=i;
        System.out.println("Paramertized A constructor called "+ i);
    }

}
