public class Driver{

	public static void main(String args[]){
		Date d1=new Date(1,1,24);
		Date d2=new Date(2,1,24);

		System.out.println(d1);

		System.out.println(d2);

		if(d2.equals(d1))
			System.out.println("Objects are equal");

		Student st1 = new Student("student 1", "001", new Date(1,1,1));

Student st2 = new Student("student 1", "001", new Date(1,1,1));

		System.out.println(st1);
		if(st1==st2)
			System.out.println("?");
		else
			System.out.println("Not equal");
	}

}