public class Campus{

	private String campusName;

	private Department se;

	private Department cs;


	public void setCampusName(String cn){
		campusName=cn;
	}
	public String getCampusName(){
		return campusName;

	}

	public void setCS(Department cs1){
		cs=cs1;

	}

	public Department getCS(){
		return cs;
	}

	public void setSE(Department se1){
		se=se1;
	}
	public Department getSE(){
		return se;
	}

	public void display(){
		System.out.println("Campus Name:"+campusName);
		se.displayInfo();
		cs.displayInfo();

	}
}