package Week7_B.Lecture2;

public class B extends A{


    String x="hello";

   static int a=400;

    int i = 20;
    B(){
      super(8);
        System.out.println("B's constructor I"+super.i);
        System.out.println("value in a "+a);
    }
}
