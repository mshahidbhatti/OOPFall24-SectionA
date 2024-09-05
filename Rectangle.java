public class Rectangle{
	private double length;  // length any positive number
	private double width;

	public void setLength(double length1){
		if(length1>0)
		length= length1;
		
	}

	public double getLength(){

		return length;
	}

	public double calArea(){
		return length*width;
	}

	public double calPerimeter(){
		return (length+width)*2;
	}


}