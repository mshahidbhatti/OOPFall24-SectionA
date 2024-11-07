package Week12_A.Lecture2;

public class Test {
    public static void main(String[] args) {

        Vehicle vehicle = new Car();

        MediaPlayer mediaPlayer=new Car();

        if(vehicle instanceof MediaPlayer){
            System.out.println("Vehicle instance of MediaPlayer");
        }

     if(mediaPlayer instanceof Vehicle){
         System.out.println("Vehicle instance of Vehicle");
     }

    }
}
