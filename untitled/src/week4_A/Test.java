package week4_A;

public class Test {

    int a;
    public static void main(String[] args) {
        Test obj = new Test();

        System.out.println(obj.a);

        Product p1 = new Product("keyboard",500);
        Product p2 = new Product("convertor",500);
        Product p3 = new Product("ram",500);
        Product p5 = new Product(null,500);
        Product p4 = new Product();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(Product.pi);

    }
}
