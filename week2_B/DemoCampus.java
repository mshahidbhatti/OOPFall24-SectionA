public class DemoCampus{
	public static void main(String args[]){
		Campus campus=new Campus();

		campus.setCampusName("Lahore Campus");
		
		Department se=new Department();
		se.setName("Software Engineering");
		se.setHodName("HOD OF se");

		Department cs=new Department();
		cs.setName("Computer Science");
		cs.setHodName("HOD OF CS");


		campus.setCS(cs);
		campus.setSE(se);



		campus.display();




	}


}