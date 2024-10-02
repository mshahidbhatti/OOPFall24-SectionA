package Week5_A;

public class Seat {
    String id;
    boolean isAvailable;
    double price;
    String type;

    public Seat(String id, boolean isAvailable, double price, String type) {
        this.id = id;
        this.isAvailable = isAvailable;
        this.price = price;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return
                "id='" + id  +
                ", isAvailable=" + isAvailable +
                ", price=" + price +
                ", type='" + type ;
    }
}
