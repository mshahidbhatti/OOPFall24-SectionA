package Week8_B;

public class ContractEmployee extends Employee{

    double fixedSalary=40000;

    @Override
    public double calSalary() {
        return fixedSalary;
    }
}
