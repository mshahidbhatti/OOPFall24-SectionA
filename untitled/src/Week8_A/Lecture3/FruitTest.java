package Week8_A.Lecture3;

public class FruitTest {
    public static void main(String[] args) {

        Fruits apple = new Apples();

        apple.display();
        apple = new Mango();
        apple.display();

        Apples apples2=((Apples)apple);  // explicit, programer will do it
        apples2.calPrice();

        Fruits fuits2= apples2; // upcasting , implicit conversion







    }
}
