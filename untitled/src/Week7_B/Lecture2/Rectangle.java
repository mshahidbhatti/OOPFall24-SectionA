package Week7_B.Lecture2;

public class Rectangle extends Shae2D{
    double length;
    double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double area(){
        return length * width;
    }
}
