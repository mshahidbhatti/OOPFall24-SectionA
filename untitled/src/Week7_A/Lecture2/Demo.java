package Week7_A.Lecture2;

public class Demo {
    public static void main(String[] args) {

        Employee list[] = new Employee[20];

        Person p = new Person("Person 1","email1");
      //  System.out.println(p); // super classs toString
        list[0] = new Employee("Employee","email","ssn",5000);
      //  System.out.println(p); // super classs toString
        list[1]= new RegularEmployee("Employee","email","ssn",5000, 1000);
      //  System.out.println(p);

        list[2] = new ContractEmployee("Employee","email","ssn",5000, 1);
      //  System.out.println(p);
        list[3] = new ContractCommissionEmployee("Employee","email","ssn",5000, 1, 0.5);
      //  System.out.println(p);


//        for (Employee e:list)
//            if(e!=null)
//             System.out.println(e.toString());

for(Employee e:list)
    if(e!=null)
        if(e instanceof RegularEmployee)
        {
            double houseRent= ((RegularEmployee)e).getHouseRent();
            ((RegularEmployee)e).setHouseRent(houseRent+houseRent*.5);
        }


       // ((Employee)p).calculateSalary()  downcasting

      //  p= regularEmployee;



    }

    public static void increaseHouseRent(){

    }
}
