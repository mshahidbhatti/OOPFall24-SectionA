class Car {

	private String model;
	private String maker;


	private Person owner;

	Car(){
		model="No model";
		maker="No maker";

		owner= new Person();
	}

	Car(String model, String maker, Person owner){
		this.model = model;
		this.maker = maker;

		this.owner = owner;
	}

	Car(Car car){

		this.model = car.getModel();
		this.maker = car.getMaker();
		this.owner = new Person(car.getOwner());

		
	}

	public String getModel(){
		return model;
	}
	public String getMaker(){
		return maker;

	}

	public Person getOwner(){

		return owner;  // this will return address of object
	}

	public void setModel(String model){
		this.model = model;
	}

	public void setMaker(String maker){
		this.maker = maker;

	}

	public void setOwner(Person owner){
		this.owner = owner;
	}

	public void display(){

		System.out.println("Car Model :"+model);
		System.out.println("Car Maker :"+maker);
		owner.display();

	}




}