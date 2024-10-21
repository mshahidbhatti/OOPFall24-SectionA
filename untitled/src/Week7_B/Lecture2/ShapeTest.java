package Week7_B.Lecture2;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[10];

        shapes[0]= new Shae2D();
        shapes[1]= new Rectangle(10,15);
        shapes[2]= new Circle(5);

        for(Shape shape: shapes)
          System.out.println(shape.area());






    }
}
