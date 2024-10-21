package Week7_B.Lecture2;

public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double area(){
        return  Math.PI * radius *radius;
    }
}
