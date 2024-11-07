package Week8_B;

import Week7_B.D;

public class Demo {

    public static void main(String[] args) {

      //  Employee employee=new Employee();
        Employee[] employees = new Employee[100];
        Employee employee;
       employees[0] = new RegularEmployee();
        System.out.println(employees[0].calSalary());

        employees[1] = new ContractEmployee();
    //    System.out.println(employees[1].calSalary());

        employees[2] = new CommissionEmployee();
     //   System.out.println(employees[2].calSalary());

        employees[3] = new HourlyWages();
     //   System.out.println(employees[3].calSalary());

        raiseSalary(employees);
        System.out.println("Revised Salary");
        displaySalaraies(employees);

    }

    public static void displaySalaraies(Employee employee[]){
        for(Employee e:employee)
            System.out.println(e.calSalary());


    }

    public static void raiseSalary(Employee employee[]){

        for(Employee e:employee){
           if(e!=null)
           {
               if(e instanceof HourlyWages)
               {
                   double temp=((HourlyWages) e).getHourlyRate();

                   ((HourlyWages) e).setHourlyRate(temp+temp*0.1);
               }
           }


        }

    }

    public static void countEmployees(Employee employee[]){

        int totalCount=0;
        int hourlyEmployeesCount=0;
        int commissionEmployeesCount=0;
        int contractEmployeesCount=0;
        int regularEmployeeCount=0;

        for(Employee e:employee){
            if(e != null)
            {
                if(e instanceof HourlyWages)
                    hourlyEmployeesCount++;
                if (e instanceof CommissionEmployee)
                    commissionEmployeesCount++;


            }

        }


    }

}
