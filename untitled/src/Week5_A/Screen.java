package Week5_A;

public class Screen {
    String screenID;
    String screenType;
    Seat seats[][];

    {
    seats=new Seat[10][];
    for(int i=0;i<seats.length;i++)
        seats[i]=new Seat[5+i];

    for(int i=0;i<seats.length;i++)
        for(int j=0;j<seats[i].length;j++)
            seats[i][j]=new Seat("Seat"+(i+1)+(j+1),false,100,"standard");

    seats[1][1].setAvailable(true);

    //seats[0][0]= new Seat("Screen",true,500,"type");

    }

    Screen(String screenID, String screenType) {
        this.screenID = screenID;
        this.screenType=screenType;
    }



    public void displaySeats(){
        for (int i=0;i<seats.length;i++)
            for(int j=0;j<seats[i].length;j++)
                System.out.println(seats[i][j]);


    }

    public  void displayAvailableSeats(){

        for (int i=0;i<seats.length;i++)
            for(int j=0;j<seats[i].length;j++)
                if(seats[i][j].isAvailable())
                    System.out.println(seats[i][j]);

    }


}
