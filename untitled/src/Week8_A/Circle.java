package Week8_A;

public class Circle extends Shape2D{

    public  double radius;

    @Override
    public void displayShape(){

        System.out.println("This is a Circle");

    }

    public double area(){
        return Math.PI * Math.pow(radius,2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
