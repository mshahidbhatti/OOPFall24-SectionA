package week_5B;

public class Seat {
    String id;
    String category;
    boolean isAvailable;
    double price;

    public Seat(String id, String category, boolean isAvailable, double price) {
        this.id = id;
        this.category = category;
        this.isAvailable = isAvailable;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id='" + id + '\'' +
                ", category='" + category + '\'' +
                ", isAvailable=" + isAvailable +
                ", price=" + price +
                '}';
    }
}
