package Week4_B.Product0;

import java.util.Scanner;

public class Shop {


    private Product productList[]= new Product[500];
    private Person owner;
    private String address;
    private static int productCount=0;

    private static double revenue;

    {
       // productList[0]=new Product();
    }
    public Shop(Person owner, String address) {
        this.owner = owner;
        this.address = address;
        this.productList = new Product[100];
    }



    public void addProduct(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Product details");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Quantity: ");
        int quantity = input.nextInt();
        Product product = new Product(name, price, quantity);
        productList[productCount++]=product;
        System.out.println("Product added");


    }

    public void sale(){
        System.out.println("Sale Menu");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        String id= scanner.nextLine();

            int index= find(id);


        for(int i=0; i<productCount; i++){

            if(productList[i].getId().equals(id))
            {
                productList[i].setQuantity(productList[i].getQuantity()-1);
                revenue+=productList[i].getPrice();
                System.out.println("Sale successful");
            }
            else{
                System.out.println("Product not found");
            }

        }


    }


    public int find(String name){
        int index=-1;
        for(int i=0; i<productCount; i++){
                if(productList[i].getName().equalsIgnoreCase(name)) {
                    index = i;
                    break;
                }

        }

        return index;
    }

}
