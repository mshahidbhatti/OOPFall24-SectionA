package week10_A;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ProductTest {
    public static void main(String[] args) {

        ElectronicProduct list[]= new ElectronicProduct[10];

        Arrays.sort(list);
       // Arrays.fi


        Arrays.sort(list,new ElectronicRatingComparator());
        Comparator myComparator = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                ElectronicProduct p1=(ElectronicProduct)o1;
                ElectronicProduct p2=(ElectronicProduct) o2;

                return p1.name.compareTo(p2.name);
            }

        };

        Arrays.sort(list,myComparator);
      //  Arrays.sort(list,new YearComparator());



       // Collections.sort(list, new ElectronicProduct());

        }








    }

