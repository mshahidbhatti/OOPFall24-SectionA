package week10_A.Lab;

import java.util.ArrayList;

public class Movie implements Comparable{
    String name;
    String artist;
    int releaseYear;
    int rating;
    double budget;




    @Override
    public int compareTo(Object o) {
        Movie temp = (Movie) o;
        return this.name.compareTo(temp.name);
    }
}
