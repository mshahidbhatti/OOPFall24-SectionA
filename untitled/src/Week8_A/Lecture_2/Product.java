package Week8_A.Lecture_2;

public abstract class Product {
    String name;
    String id;
    static int counter=0;

    public Product(){
        id=String.format("%03d",counter++);
    }

    public abstract void displayProduct();

}
