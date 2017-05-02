package Points;

/**
 * Created by lsm on 5/1/2017.
 */
public class Point {
    private int x, y;

    public void setX(int newX){
     x = newX;
    }
    public void setY(int newY){
        y = newY;
    }
    public int getX(){
        return x;
    }
    public int getY() {
        return y;
    }
    public static void printPoint(Point p) {

        System.out.println(String.format("%d:%d", p.getX(), p.getY()));
    }
}
