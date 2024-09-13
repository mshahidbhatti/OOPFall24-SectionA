class Circle{
	double radius;

	Point center;

	public void setCenter(Point c){
		center=c;
	}

	public Point getCenter(){
		return center;
	}

	

	public void setRadius(double r){
		radius=r;

	}
	public double getRadius(){
		return radius;
	}
	
	public void display(){
		System.out.println("Radius :"+radius);
	//System.out.println("Center x:"+center.getX()+" y: "+center.getY());
		center.display();

	}

	


}