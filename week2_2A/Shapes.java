class Rectangle{

	private double height;
	private double width;


	private Point leftTopCorner;


	public void setLeftTopCorner(Point ltopcorner){

		leftTopCorner=ltopcorner;
	}
	
	public Point getLeftTopCorner(){
		return leftTopCorner;
	}


	public void setWidth(double w){

		width=w;
	}
	public void setHeight(double h){
		height=h;
	}

	public double getWidth(){
		return width;
	}
	public double getHeight(){
		return height;
	}

	
	public void display(){
		System.out.println("Height :"+ height+", width :"+width);
		//System.out.println(" Left Top Corner : x:"+leftTopCorner.getX()+", y"+leftTopCorner.getY());

		leftTopCorner.display();

	}

}

