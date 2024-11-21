package ArrayList_revision;

public class Lambdas {
    public static void main(String[] args) {

//        Printable obj1=new PrintThings();
//        obj1.print();
//
//        //annynemous inner class
//        Printable obj2= new Printable(){
//            public void print(){
//                System.out.println("Anynemous Inner Class");
//            }
//        };
//        obj2.print();
//
//
//
//        printText(obj2);
//
//
//        Printable obj3= ()->System.out.println("Anynous Inner Class 2");
//        obj3.print();


        Printable2 printIt=  e -> System.out.println(e);
        printIt.printThings("print this text");

        printText(e -> System.out.println("Anynous Inner Class 3"));


        Sumable sumable = (a,b) -> System.out.println("sum of ints "+ (a+b));
        sumable.sum(4,4);



        Sumable2 sumable2 = (a,b) -> {
            System.out.println("new additional statements");
            return a+b;
        };

        int c=sumable2.sum(4,4);




    }


    public static void printText(Printable printable){
        printable.print();
    }

    public static void printText(Printable2 printable){
        printable.printThings("print this text");
    }

}
