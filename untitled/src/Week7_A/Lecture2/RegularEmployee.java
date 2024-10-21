package Week7_A.Lecture2;

public class RegularEmployee extends Employee{
    double houseRent;
    RegularEmployee(String name, String email, String ssn, double salary, double houseRent){
        super(name, email, ssn, salary);

    }

    public double getHouseRent() {
        return houseRent;
    }

    public void setHouseRent(double houseRent) {
        this.houseRent = houseRent;
    }

    @Override
    public String toString(){

        return String.format("%s %f", super.toString(), houseRent);
    }

    public double calculateSalary(){
        return salary + houseRent;
    }



}
