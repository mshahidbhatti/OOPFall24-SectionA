class Address{
	
	//instance variable
	//class attribute
	private String city;

	private String country;

	//constructors
	//no argument constructor
	Address(){
		city ="Lahore";
		country = "Pakistan";
	}

	//copy costructor
	Address(Address address){
		this.city = address.getCity();
		this.country= address.getCountry();
	}

	// parameterized constructor
	Address (String city, String country){
		this.city=city;
		this.country=country;
	}

	public String getCity(){
		return city;
	}
	public String getCountry(){
		return country;
	}
	public void setCity(String city){
		this.city=city;
	}

}