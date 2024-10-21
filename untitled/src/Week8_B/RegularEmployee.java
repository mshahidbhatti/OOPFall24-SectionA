package Week8_B;

public class RegularEmployee extends Employee {

    double houseRent=0.1;
    double baseSalary;

    @Override
    public double calSalary() {
        return baseSalary+baseSalary*houseRent;
    }

}
