package Week7_B.Lecture2;
import java.awt.Rectangle;
public class MyRectangle extends Rectangle{


    public MyRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public boolean isInsideRect(int x, int y){
        return this.contains(2,2);
    }
//    public boolean isInsideRect(MyRectangle myRectangle)
//    {
//        //this.intersects()
//    }
}
