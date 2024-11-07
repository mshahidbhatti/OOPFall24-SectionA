package week10_A;

import Week8_A.Lecture_2.Electronic;

public class ElectronicProduct extends Product implements Comparable{


    int manafactureYear;

    public int compareTo(Object o){
        int result=0;
        ElectronicProduct temp=(ElectronicProduct) o;
        if(temp.price==this.price)
            result=0;

        else
            if(temp.price<this.price)
                result=-1;
            else if(temp.price>this.price)
                result=1;
        return result;
    }
}
