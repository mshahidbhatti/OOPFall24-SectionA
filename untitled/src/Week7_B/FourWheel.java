package Week7_B;

public class FourWheel extends Vehicle{

    FourWheel(){
        super("make","name");

    }
    String color;
@Override
public void display(){
    super.display();
    System.out.println("color"+color);
}

}
