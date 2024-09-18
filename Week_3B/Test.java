public class Test{

	public static void main(String a[]){

		Address add1 = new Address("Karachi", "Pakistan");

		System.out.println(add1);

		Address add2 = add1;

		System.out.println(add2);

		add2 = new Address(add1);
		System.out.println(add2);

		
		
		Person p1=new Person();

		Person p2 = new Person("Muzamil","muzamil@gmail.com");

		Person p4 = new Person();

Address add5 = new Address("karachi","pakistan");
	Person p5= new Person("hammas","email",add5);

	Person p6 = new Person("Noor","email",new Address("lahore","pakistan"));	


Person p7 = new Person(p6);  //copy constructor
		
	p7.getAddress().setCity("Islamabad");


		System.out.println(p6);
		System.out.println(p6.getAddress());
		p6.display();
		System.out.println("------------");
		System.out.println(p7);
		System.out.println(p7.getAddress());
		p7.display();		
	
		int x =100;
		int temp= x;

		Person tempPerson = p2; // just copy reference

		Person p3 = new Person(p2.getName(), p2.getEmail());



		


		
	}


}