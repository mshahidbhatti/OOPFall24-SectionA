class Student{

	String name;
	String regNo;

	double cgpa;

	Student(String name, String regNo, double cgpa){
		this.name= name;
		this.regNo = regNo;
		this.cgpa = cgpa;

	}


	 public String toString(){

		return String.format("%s %s %f", name, regNo, cgpa);
	}



}