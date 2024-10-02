package week_5B;

public class Screen {
    String name;
    String description;
    Seat seats[][];
    {
        seats=new Seat[7][];
        seats[0]=new Seat[7];
        seats[1]=new Seat[8];
        for(int i=0; i< seats.length;i++)
            seats[i]=new Seat[i+7];
        for(int i=0; i<seats.length; i++)
            for (int j=0;j<seats[i].length;j++)

                seats[0][0].setAvailable(false);
        seats[0][1].setAvailable(false);



    }

    public void displaySeats(){
        for(int i=0; i<seats.length;i++)
            for(int j=0; j<seats[i].length;j++)
                System.out.println(seats[i][j]);
    }
    public void displayReservedSeats(){
        for(int i=0; i<seats.length;i++)
            for(int j=0; j<seats[i].length;j++)
                if(seats[i][j].isAvailable())
                System.out.println(seats[i][j]);
    }
    public Seat[][] getSeats(){
        return seats;
    }
    public Seat[] getSeat(){
        return seats[0];
    }

}
