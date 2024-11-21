package ArrayList_online_A;

public class Lamdas {
    public static void main(String[] args) {

//        PrintThings obj= new PrintThings();
//        obj.printThings();
//
//        printIt(obj);

Printable obj2 = new Printable (){
            public void printThings(){
                System.out.println("This is an anonymous class");
            }
        };
        printIt(obj2);
        Printable obj3 = ()-> System.out.println("This is an anonymous class version 2");


        Understandable understandable= e->System.out.println(e);

        understandable.printString("text");

//        Sumable sum1= (e,b)->System.out.println(e+b);
//        sum1.sum(10, 20);

//        Sumable sum2 = (e,b) -> {
//            System.out.println("This is an anonymous class version");
//            return e+b;
//        };

        Sumable sum3 = (a,t) -> a+t;

    }


    public static void printIt(Printable thing){
        thing.printThings();
    }
}
