package Week7_A.Lecture2;

public class ContractEmployee extends Employee{
    int contractDuration;


    ContractEmployee(String name, String email, String ssn, double salary, int contractDuration) {
        super(name, email, ssn, salary);
        this.contractDuration=contractDuration;
    }

    public double calSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return String.format("%s Duration: %d", super.toString(),contractDuration);//super.toString();
    }
}
