package ArrayList_revision;

import java.util.Comparator;

public class Product implements Comparator<Product>, Comparable<Product> {
    String id;
    String name;
    double price;
    int quantity;

    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int compare(Product o1, Product o2) {
        return   (int)o2.price -(int) o1.price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass()!= obj.getClass()) return false;

        Product product = (Product) obj;

        return this.id.equals(product.id);
    }


    @Override
    public int compareTo(Product o) {
        return this.id.compareTo(o.id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
