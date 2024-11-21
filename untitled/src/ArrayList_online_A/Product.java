package ArrayList_online_A;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product>, Comparator<Product> {
    String id;
    String name;
    double price;
    int quantity;
    int rating;
    public Product(String id, String name, double price, int quantity, int rating) {
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.rating=rating;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compare(Product o1, Product o2) {
        return o2.name.compareTo(o1.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        Product product = (Product) o;
        return  Objects.equals(id, product.id) && Objects.equals(name, product.name);
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Product o) {
        return this.id.compareTo(o.getId());
    }
}
