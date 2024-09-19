public class Student{
	String name;
	String regNo;
	Date dob;

	Student(String name, String regNo, Date dob){
		this.name = name;
		this.regNo= regNo;
		this.dob= dob;

	}



	@Override
	public String toString(){
		return String.format("%-20s %s %s", name, regNo, dob);
	}

	@Override
	public boolean equals(Object o){

		Student temp = (Student)o;

		return temp.name.equals(this.name) && temp.regNo.equals(this.regNo);

	}


}