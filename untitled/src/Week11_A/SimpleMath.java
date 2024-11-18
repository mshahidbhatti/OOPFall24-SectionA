package Week11_A;

public class SimpleMath <T extends Number>{


    public double sum(T t1, T t2){
        return t1.doubleValue() + t2.doubleValue();
    }
}
