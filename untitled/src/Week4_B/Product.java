package Week4_B;

public class Product {
    //instane variables
    private  String name;
    private String id;
    private double price;

    public static final double PI=3.14;

    public static final String COMPANY_NAME="ABC";


    //class variables
    private static int counter=0;

    static {
        System.out.println("Static code block 1");
        System.out.println(counter);
        //Math.PI
    }

    {
       // x++;
        System.out.println("non static code block");
        this.id = String.format("%03d", ++counter);
        System.out.println(id);
        System.out.println(counter);
    }
    static {

        System.out.println("Static code block 2");
    }


    public Product( String name, double price) {
       setName(name);
        this.price = price;
    }
    Product( String name){
        this(name,0);
    }
    Product(){
        this("No name");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name!=null && name.length()>2)
        this.name = name;
    }

    public String getId() {
        return id;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s %-13s %f", id, name, price);
    }

    public static void display(){


    }
}
