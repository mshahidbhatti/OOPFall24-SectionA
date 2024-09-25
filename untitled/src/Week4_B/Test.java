package Week4_B;

public class Test {

    public static void main(String[] args) {

        Product p1 = new Product( "Keyboard", 100);
        Product p2 = new Product( "Keyboard", 100);
        Product p3 = new Product( "LCD");
        Product p4 = new Product();


        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);


        Product list[] = new Product[100];

        for(int i=0; i<list.length;i++)
            list[i] = new Product();


        System.out.println(list[30]);


    }
}
