package Week12_A.Lecture2;

import java.io.Serializable;
import java.util.Comparator;

public class Rectangle implements Comparable, Comparator, Serializable {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
