package Week8_A;

import Week7_B.C;

public class ShapeTest {
  //  Shape shapes[]=new Shape[10];

    public static void main(String[] args) {

//        Shape shape1; //= new Shape();
//
//        Shape shape2 ;
//
//        shape1 = new Circle();
//        shape1.displayShape();
//        ((Shape2D)shape1).area();

    Shape shapes[]=new Shape[10];
    shapes[0]=new Circle();
    shapes[1]=new Cube();

    shapes[3]=new Circle();
    shapes[4]=new Rectangle();





        for (Shape temp: shapes)
            if(temp!=null)
            temp.displayShape();


        for (Shape temp: shapes)
            if (temp!=null) {
                if (temp instanceof Shape2D)
                    System.out.println(((Circle) temp).area());
                if (temp instanceof Shape3D)
                    System.out.println(((Cube) temp).volume());
            }


         //   increaseRadius(shapes,0.1);



    }

    public static  void increaseRadius(Shape shapes[], double increaseValue){
        for (Shape temp: shapes)
            if(temp!=null)
            {
                double previousRadius=0;
                double newRadius=0;
                if(temp instanceof Circle) {
                    previousRadius = ((Circle)temp).getRadius();
                    newRadius= previousRadius*increaseValue+previousRadius;
                    ((Circle)temp).setRadius(newRadius);



                }
            }
    }
}
