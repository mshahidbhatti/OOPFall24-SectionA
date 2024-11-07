package week10_A;

import java.io.Serializable;

public class D extends C implements Payable, Serializable {

    @Override
    public double getPayableAmount() {
        return 0;
    }
}
