package week10_A;

import java.util.Arrays;
import java.util.Collections;

public class ProductTest {
    public static void main(String[] args) {

        ElectronicProduct list[]= new ElectronicProduct[10];

        Arrays.sort(list);


        Arrays.sort(list,new ElectronicRatingComparator());

        Arrays.sort(list,new YearComparator());



       // Collections.sort(list, new ElectronicProduct());

        }








    }
}
