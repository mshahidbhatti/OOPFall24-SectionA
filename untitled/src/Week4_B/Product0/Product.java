package Week4_B.Product0;

import java.util.Objects;

public class Product {
    private String id;
    private String name;
    private double price;;
    private int quantity;

    private static int counter=0;

    public Product( String name, double price, int quantity) {
        this.id = String.format("%03d", ++counter);
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this(name, price, 0);
    }

    public Product(String name) {
        this(name,0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Product.counter = counter;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return  Objects.equals(id, product.id) ;
    }

    @Override
    public String toString() {
        return String.format("%s %s %f %d",id,name, price, quantity);
    }
}
