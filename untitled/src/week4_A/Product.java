package week4_A;

import java.util.Objects;

public class Product {
    private String name;
    private String id;
    private double price;
    private Date manufacturerDate;
    private static int count=0;
    public  static final double pi=3.14;


    {

        System.out.println("Product non static block");
    }

    static {
        System.out.println("Product static block");
    }
    static {
        System.out.println("Product static block");
    }

    public Product(String name,  double price, Date manufacturerDate) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.manufacturerDate = manufacturerDate;
    }

    public Product(String name, double price ) {
        this(name, price, new Date(1,1,1));
        setName(name);
        setPrice(price);
        this.id = String.format("%03d",count++);

    }

    Product(){

       this("Default Name",0);
        System.out.println("");
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

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>=0)
            this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && Objects.equals(name, product.name) && Objects.equals(id, product.id);
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public Object clone(){
        return new Product(name,price);
    }
}
