package Week8_A.Lecture_2;

public abstract class Electronic extends Product{

    String brand;
    int warranty;

    public void displayProduct(){
        System.out.println(id);
        System.out.println(name);
        //...
    }

}
