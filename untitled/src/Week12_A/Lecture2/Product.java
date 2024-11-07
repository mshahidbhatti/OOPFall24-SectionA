package Week12_A.Lecture2;

import java.util.Comparator;

public class Product implements Comparable, Comparator {
    double price;
    int rating;
    int manafuctureYear;
    String productName;

    public Product(double price, int rating, int manafuctureYear, String productName) {
        this.price = price;
        this.rating = rating;
        this.manafuctureYear = manafuctureYear;
        this.productName = productName;
    }

    @Override
    public int compareTo(Object o) {
        int compare=0;
        Product p=(Product)o;
        if(p.price==this.price)
            compare=0;
        else if(p.price<this.price)
            compare=-1;
        else
            compare=1;
        return compare;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
