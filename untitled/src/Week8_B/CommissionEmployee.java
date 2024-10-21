package Week8_B;

public class CommissionEmployee extends ContractEmployee{
    private double commissionRate;
    double totoalSales;


    public double calSalary(){

        return super.calSalary() + (commissionRate * totoalSales);
    }

}
