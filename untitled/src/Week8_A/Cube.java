package Week8_A;

public class Cube extends Shape3D{

    double side1;


    public double volume(){
        return Math.pow(side1, 3);
    }
    public void displayShape(){
        System.out.println("Cube");
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }
}
