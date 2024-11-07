package week10_A;

public class InterfaceTest {
    public static void main(String[] args) {

        A obj= new B();


        Interface1 obj1=new B();

        Interface2 obj2=new B();

        if(obj instanceof  Interface1)
            System.out.println("True");

        if(obj1 instanceof A )
            System.out.println("True");

        Payable list[]=new Payable[4];

            list[0]=new B();
            list[1]=new D();
            list[2]=new B();
            list[3]=new D();

            for(Payable temp: list) {
                System.out.println(temp.getPayableAmount());
                ((B)temp).method1();
            }

    }
}
