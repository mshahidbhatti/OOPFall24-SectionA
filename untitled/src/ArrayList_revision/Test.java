package ArrayList_revision;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Iterable<Product> productsIterator = new ArrayList<Product>();

      //  productsIterator.

        List<Product> products = new ArrayList<Product>();
        products.add(new Product("001","RAM",2000,4));
        products.add(new Product("002","Keyboard",2000,4));

        products.add(new Product("003","LCD",2000,4));
        products.add(new Product("004","Laptop",200000,1));
        products.add(2,new Product("006","CPU",20000,1));
        products.add(2,new Product("006","CPU",20000,1));

        System.out.println(products.size());

        for (Product product : products) {
            System.out.println(product);
        }
        products.add(2,new Product("006","CPU",20000,1));



        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println(products.size());

//        products.remove(1);
//        System.out.println("  ");
//        for (Product product : products) {
//            System.out.println(product);
//        }

        System.out.println(products.indexOf(new Product("006","LCD",2000,4)));
        System.out.println(products.lastIndexOf(new Product("006","LCD",2000,4)));

        for(Product product : products) {
            if(product.equals(new Product("006","LCD",2000,4)))
                System.out.println("found");
        }


        Product tempProduct=products.get(1);

        products.set(5,new Product("000","Camera",5000,1));
        products.set(products.indexOf(new Product("004","Camera",5000,1)),new Product("003","Mic",5000,1));

        for (Product product : products) {
            System.out.println(product);
        }

      //  products.remove(tempProduct);
      //  products.remove(1);

        ArrayList<Product> list2 = new ArrayList<Product>();
        list2.add(new Product("010","Camera",5000,4));
        list2.add(new Product("011","Camera",5000,4));
        list2.add(new Product("012","Camera",5000,4));

      //  products.addAll(list2); //append at the end of previous list
        products.addAll(5,list2); //append at the end of

        displayProduct(products);

        products.removeAll(list2);

        products.sort(new Product("012","Camera",5000,4));

        displayProduct(products);


        products.sort(new ProductNameComparator());
        displayProduct(products);

        Collections.sort(products);
        displayProduct(products);

        (products.get(products.indexOf(new Product("000","Camera",5000,1)))).setPrice(77777);
        displayProduct(products);

        //products.clear();

        products.reversed();
        displayProduct(products);
      //  Product[] array=(Product[]) products.toArray();

        String words[]=TextClass.longText.split(" ");
        System.out.println(words.length);

        ArrayList<String> wordsList=new ArrayList<String>();
        wordsList.addAll(List.of(words));

        Set<String> wordsSet=new HashSet<String>();
        wordsSet.addAll(wordsList);
        System.out.println(wordsSet.size());


        Set<Product> uniqueProd=new HashSet<Product>();
        uniqueProd.addAll(products);

        products.forEach(e-> System.out.println(e));

       products.forEach(e-> e.setPrice(e.getPrice()+100));
        displayProduct(products);


    }

    public static void displayProduct(List<Product> temp){
        System.out.println("=================");
        for (Product product : temp) {
            System.out.println(product);
        }
    }
}
