public class Test{

public static void main(String args[]){

	System.out.println( new A() );

	A obj1 = new A();

	System.out.println(obj1);

	obj1.A();

	Date d1= new Date(13, 9, 2024);

	d1.display();

	// new Date(1,1,1).display();

	Date d2 = d1;

	d2.display();
	d2.day=20;
	d1.display();
	d2.display();

	Date temp=new Date(d1.day,d1.month, d1.year);

	Date temp2=new Date(temp);

	



}


}