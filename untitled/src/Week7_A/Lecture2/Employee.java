package Week7_A.Lecture2;


public class Employee extends Person{

    double salary;
    String ssn;
    Employee(String name, String email, String ssn, double salary){
     super(name,email);
     this.salary=salary;
     this.ssn=ssn;
    }

    public double calculateSalary(){
        return salary*1.1;
    }

    @Override
    public String toString(){

        return String.format("%s %s %f",super.toString(), ssn, calculateSalary());
    }

}
