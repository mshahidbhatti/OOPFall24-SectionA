package week10_A;

import java.util.Comparator;

public class YearComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int result =0;
        ElectronicProduct electronicProduct1=(ElectronicProduct)o1;
        ElectronicProduct electronicProduct2=(ElectronicProduct)o2;
        if(electronicProduct2.manafactureYear>electronicProduct1.manafactureYear)
            result =-1;
        return result;
    }
}
