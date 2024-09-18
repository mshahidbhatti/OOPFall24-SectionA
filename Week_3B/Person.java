class Person{
	private String name;
	private String email;

	private Address address;


	// copy constructor
	Person(Person p){
		this.name= p.getName();
		this.email=p.getEmail();
	//	this.address=p.getAddress(); //shallow copy
		this.address = new Address(p.getAddress()); //deep copy

	}


	Person(){
		name = "No Name";
		email="No email";
		address = new Address("No city", "no country");
	}

	Person(String name, String email){
		this.name = name;
		this.email=email;
	}

	Person(String name, String email, Address address){
		this.name = name;
		this.email=email;
		this.address= address; //this will copy reference
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

	public void setAddress(Address address){
	
		this.address= address;
	}

	public Address getAddress(){

		return address;
	}

	public void display(){
		System.out.println("Name :"+name);
		System.out.println("Email :"+email);
		System.out.println(" City:"+ address.getCity());
		System.out.println(" Country:"+ address.getCountry());

		
	}

}