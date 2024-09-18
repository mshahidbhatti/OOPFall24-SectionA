public class Demo{

	public static void main(String args[]){
		Student std1 = new Student("Husnain","SP24-BSE-046",3.6);

		Student std2 = new Student("Saqlain","SP24-BSE-046",3.1);


		System.out.println(std1);

		System.out.println(std2.toString());


		if(std1.equals(std2))
			System.out.println("Equal");


		if(std1.regNo == std2.regNo)
			System.out.println("Equal");
		else
			System.out.println("Not equal");



	}

}