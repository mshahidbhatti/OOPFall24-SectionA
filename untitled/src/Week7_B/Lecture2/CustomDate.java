package Week7_B.Lecture2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDate extends Date {


    public String disply(String pattren){
        SimpleDateFormat dateFormat=new SimpleDateFormat(pattren);
        return dateFormat.format(this);

    }

}
