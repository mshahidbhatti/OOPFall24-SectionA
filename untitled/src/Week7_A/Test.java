package Week7_A;

public class Test {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Vehicle 1");
        vehicle.display();
        vehicle = new FourWeel(true);
        vehicle.display();
        vehicle = new PassengerVehicle(false);
        vehicle.display();



    }
}
