
import java.util.Scanner;

public class Demo{

	public static void main(String args[]){

		Student std = new Student("name 1", "email 1");

		//System.out.println(std);


		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name:");
		String name = sc.nextLine();
		System.out.print("Enter your email:");
		String email = sc.next();
		Student std1 = new Student(name, email);

		System.out.println(std1);


		int i=sc.nextInt();
			sc.nextFloat();
			sc.nextDouble();

		Scanner input = new Scanner(System.in);


	


	}

}