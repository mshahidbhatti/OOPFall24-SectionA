class Point{

	private int x;
	private int y;


	public void setX(int x1){
		if(x1>0)
			x=x1;
	}
	public void setY(int y1){
		y=y1;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public void display(){
		System.out.println("x :"+x);
		System.out.println("y :"+y);
	}


}