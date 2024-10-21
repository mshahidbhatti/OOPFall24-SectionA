package Week7_A.Lecture2;

public class ContractCommissionEmployee extends ContractEmployee{
    double comissionRate;
    double sale;

    public ContractCommissionEmployee(String name, String email, String ssn, double salary, int contractDuration, double comissionRate) {
        super(name, email, ssn, salary, contractDuration);
        this.comissionRate = comissionRate;
        this.sale = sale;
    }

    @Override
    public String toString() {
        return String.format("%s %f %f",super.toString(),comissionRate,sale);
    }

    public double calculatePay() {
        return salary+ (comissionRate * sale);
    }

}
