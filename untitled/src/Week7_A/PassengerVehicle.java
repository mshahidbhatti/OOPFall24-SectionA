package Week7_A;

import Week7_B.PassengerVehicles;

public class PassengerVehicle extends FourWeel{
    int numberOfSeats;

    PassengerVehicle(boolean isFourByFour) {
        super(isFourByFour);
    }

    public void display(){

        System.out.println("This is a passenger vehicle with " + numberOfSeats + " seats.");
    }

}
