public class Department{

	private String name;
	private String hodName;


	public void setName(String n){
		name=n;

	}

	public void setHodName(String hod){
		hodName=hod;
	}

	public String getName(){
		return name;
	}

	public String getHodName(){
		return hodName;
	}

	public void displayInfo(){
		System.out.println("Department Name:"+name);
		System.out.println("HOD Name:"+hodName);
	}
}