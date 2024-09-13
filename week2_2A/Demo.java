class Demo{

	public static void main(String args[]){
		
		Point p=new Point();

		p.setX(20);
		p.setY(20);

		Circle c1=new Circle();
		c1.setRadius(100.0);
		
		
		
		c1.setCenter(new Point());	
		c1.getCenter().setX(60);
		c1.getCenter().setY(60);

		c1.display();

		Rectangle r1 =new Rectangle();
		r1.setHeight(30.0);
		r1.setWidth(20.0);

		r1.setLeftTopCorner(p);

		r1.display();
			



	}

}