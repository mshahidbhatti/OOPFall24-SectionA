public class Rectangle{
	
	// attributes
	private double length;
	private double width;


	private int x;
	private int y;



	//methods


	public void setLength(double length1){

		if(length>0)
			length=length1;


	}

	public double getWidth(){
		return width;
	}

	public double getLength(){
		return length;
	}

	public void setWidth(double width1){
		if(width1>0)
			width=width1;
	}

	public double area(){
		return length*width;
	}

	public double perimeter(){

		return length+width+2;
	}

	public void display(){
		System.out.println("Length :"+length);
		System.out.println("Width :"+width);
	}



}