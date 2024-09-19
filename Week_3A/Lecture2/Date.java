public class Date{

	int day;
	int month;
	int year;

	Date(int day, int month , int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}

	//annotations
	@Override
	public String toString(){

	//	String temp=String.format("%02d-%02d-%04d",day,month,year);
		return String.format("%02d-%02d-%04d",day,month,year);
		//return day+"-"+month+"-"+year;

	}

	@Override
	public boolean equals(Object o){
		Date temp= (Date)o;
		return this.day==temp.day && this.month == temp.month && this.year == temp.year;

	}



}