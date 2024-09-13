class Date{

	int day;
	int month;
	int year;

	Date(int d, int m, int y){
		day=d;
		month=m;
		year=y;
	}

	//copy constructor
	Date(Date d){
		day=d.day;
		month=d.month;
		year=d.year;

	}

	public void display(){
		System.out.println(day+"-"+month+"-"+year);

	}

}