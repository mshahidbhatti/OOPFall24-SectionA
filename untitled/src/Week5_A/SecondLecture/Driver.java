package Week5_A.SecondLecture;

public class Driver {

    enum GameStatus{Won, Lost};

    static String list[][]= new String[10][];
    public static void main(String[] args) {

        sum(1,1,1,1,1,1,1,1,1,1);

        sum( new int[]{1,2,2,3} );

        //String daysOfWeek[]= {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri"};

        DaysOfTheWeek daysOfWeek = DaysOfTheWeek.Saturday;

        for (DaysOfTheWeek day : DaysOfTheWeek.values())
            System.out.println(day);

        if(daysOfWeek==DaysOfTheWeek.Friday)
            System.out.println();


        System.out.println(list);

        for(int i=0;i<list.length;i++) {
            list[i]=new String[5];
        }

        initArray(list);

        displayArrau(list);
    }

    public static void displayArrau(String temp[][]){
        for(int i=0;i<temp.length;i++)
            display1DArray(temp[i]);

    }
    public static void display1DArray(String temp[]){
        for(int j=0;j<temp.length;j++)
            System.out.println(temp[j]);
    }


    public static void initArray(String temp[][]){

        //enhanced for loop
        for(String temp1[]:list)
            for(String temp2:temp1)
                temp2="Hello";
    }


    public static String[][] getArray(){
        return list;
    }



    public static void sum(int ... b){
     int temp=0;
     for(int a:b)
         temp+=a;
     System.out.println(temp);
    }

    public static void sum(double a[]){

    }
}
