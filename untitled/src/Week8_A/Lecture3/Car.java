package Week8_A.Lecture3;

public abstract class Car extends Vehicle implements MediaPlayer, Interface1{
    @Override
    public void drive() {
        System.out.println("Drive method of car");
    }


}
