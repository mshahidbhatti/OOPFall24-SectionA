

import java.util.Scanner;

public class TestInput{
	
	public static void main(String args[]){

		Person p1 = new Person("Name","email");
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		String email = sc.nextLine();

		Person p2 = new Person(name, email);


		int a = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);

		sc2.next();

	


	}
}