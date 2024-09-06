public class Demo{

	public static void main(String args[]){

		int i=10;

		Rectangle r1;  // declaration of variable


		r1 = null;

		r1 = new Rectangle(); // initialise object

		//access error
		//r1.length=-10;
		r1.setLength(-10);

		//r1.width=20;
		r1.setWidth(200);

		double area= r1.area();

		System.out.println("Area of Rectangle 1:"+ area);

		System.out.println(r1);

		r1.display();

		Rectangle r2=new Rectangle();

		if(r1.getLength()>r2.getLength())
			System.out.println("Length of r2 is greater");
		
		

	}




}