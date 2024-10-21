package Week6_B;

enum MonthsNames{
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}

public class Demo {
    public static void main(String[] args) {

        NameTest nameTest1 = new NameTest("first name");


        String s1="Hello";
        String s2="Hello";
        String s3="Hello1";
        String s4=new String("Hello");

        if(s1.contains("He"))
            System.out.println("Substring found");




        s1=s1+" world";

        StringBuilder stringBuilder=new StringBuilder();


    //    for(MonthsNames temp: MonthsNames.values())
    //        System.out.println(temp);

        MonthsNames temp=MonthsNames.AUGUST;

        if(temp==MonthsNames.FEBRUARY)
            System.out.println("adf");


      //  String weekDays[]={"Sun", "Mon", "Tue", "Wed", "Thu","Fri", "Sat"};


      //  for(String day : weekDays)
      //      System.out.println(day);


        DaysOfWeek dayOfWeek = DaysOfWeek.FRIDAY;


        System.out.println(sum(10, sum(10,20)));
        System.out.println(sum(new double[]{1,2,3,4}));
        System.out.println(add(10, 10, 10, 10));
    }


    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sum(double a[]) {
        double sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i];


        return sum;
    }

    public static double add(double ... a) {
        double sum = 0;
        for(int i = 0; i < a.length; i++)
            sum += a[i];
        return sum;
    }

}
