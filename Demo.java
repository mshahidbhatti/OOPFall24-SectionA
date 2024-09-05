public class Demo{

	public static void main(String args[]){
		
		Rectangle r1= new Rectangle();
		Rectangle r2= new Rectangle();

		r1.setLength(20);

		//r1.length=-20;
		//r1.width=10;

		double area=r1.calArea();

		
		double perimeter= r1.calPerimeter(); // call Rec class method
		System.out.println("Area of Rectangle :"+area);
		System.out.println("Perimeter of Rectangle :"+perimeter);
				

	}


}