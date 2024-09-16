class Person{
	private String name;
	private String email;

	// copy constructor
	Person(Person p){
		name= p.getName();
		email=p.getEmail();

	}
	Person(){
		name = "No Name";
		email="No email";
	}

	Person(String name, String email){
		this.name = name;
		this.email=email;
	}

	public void setName(String name){
		this.name = name;
	}
	public void setEmail(String email){
		this.email = email;
	}

	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}

	public void display(){
		System.out.println("Name :"+name);
		System.out.println("Email :"+email);
	}

}