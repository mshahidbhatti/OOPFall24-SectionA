public class Driver{


	public static void main(String args[]){
		Person p1=new Person();
		
		Person p2=new Person("Sami","sami@gmail.com");

		Person temp=p2;

		Person p3= new Person(p2);

		Person p4 = new Person(p2.getName(), p2.getEmail());

		temp.setName("Talha ");
		
		p2.display();

		System.out.println();
		temp.display();

		System.out.println(p2);
		System.out.println(temp);
		System.out.println(p3);
		System.out.println("++++++++++++++");

		Car car1= new Car();

		car1.display();


Car car2 = new Car("City","Honda", new 				Person("Sami","@email.com"));
		car2.display();	

	Car carTemp = new Car(car2.getModel(), car2.getMaker(), car2.getOwner());

car2.setOwner(new Person("ABC","XYZ"));


Car carTemp1 = new Car(car2.getModel(), car2.getMaker(),	new Person(car2.getOwner()));	

		//Car carTemp= new Car(car2);

		car2.setModel("Civic");
		//car2.setOwner(new Person());
		car2.getOwner().setEmail("sami@yahoomail.com");

		System.out.println("===========");
		car2.display();

		
		carTemp.display();


	}


}