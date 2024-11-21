package ArrayList_online_A;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<Product>();

        productList.add(new Product("001","RAM",2500,2, 4));
        productList.add(new Product("002","Keyboard",400,2, 5));
        productList.add(new Product("003","LCD",2500,2, 3));
        productList.add(new Product("004","Monitor",2500,2, 5));
        productList.add(new Product("005","CPU",2500,2, 4));
        productList.set(4,new Product("009","GPU",2500,3,4));
        productList.set(4,new Product("009","GPU",2500,3,4));

      //  printProductList(productList);
        System.out.println(productList.size());

        productList.add(2,new Product("006","System Box",2500,2, 5));
        printProductList(productList);

       // productList.remove(1);
       // printProductList(productList);

       // productList.remove(new Product("006","System Box",2500,2, 5));

        printProductList(productList);

        productList.set(4,new Product("009","GPU",2500,3,4));
        printProductList(productList);

       // int index=productList.indexOf(new Product("009","GPU",2500,3,4));
       /* System.out.println(index);
        Product temp=productList.get(index);
            temp.setName("TPU");*/

//        int index = productList.lastIndexOf(new Product("009","GPU",2500,3,4));
//        productList.get(index).setName("Amazon");

        productList.get(productList.lastIndexOf(new Product("009","GPU",2500,3,3))).setName("Azure");
        printProductList(productList);

        List<Product> productList2 = new ArrayList<Product>();
        productList2.add(new Product("010","DDR-RAM",2500,2, 4));
        productList2.add(new Product("011","SDR-RAM",2500,2, 4));



//        productList.addAll(productList2);
        productList.addAll(3,productList2);
        printProductList(productList);

        Collections.sort(productList);
        printProductList(productList);

        productList.sort(productList.get(0));
        printProductList(productList);

        ArrayList<String> words = new ArrayList<String>();
        words.addAll(List.of(LongTextFile.longText.split(" ")));
        System.out.println(words.size());
        System.out.println(words.get(100));

        Set<String> uniqueWords= new HashSet<String>();
        uniqueWords.addAll(words);

        System.out.println(uniqueWords.size());

        Set<Product> uniqueProducts= new HashSet<Product>();
        uniqueProducts.addAll(productList);
        printProductList(productList);

        System.out.println("print using for each");




        productList.forEach(e -> e.setPrice(e.getPrice()+100));
        productList.forEach(e-> System.out.println(e));

    }

    public static void printProductList(List<Product> productList){
        System.out.println();
        for(Product product : productList)
            System.out.println(product);

    }
}
