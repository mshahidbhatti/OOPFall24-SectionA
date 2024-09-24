public class Student{

	private String name;
	private String email;

	Student(String name, String email){
		this.name = name;
		this.email = email;
	}


	public void setName(String name){
		this.name = name;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public String toString(){
		return String.format("%s %s", name, email);
	}
}