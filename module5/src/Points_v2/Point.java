package Points_v2;

/**
 * Created by lsm on 5/1/2017.
 */
public class Point {
    private int x, y;

    private void setX(int newX){
        x = newX;
    }
    private void setY(int newY){
        y = newY;
    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX(){
        return x;
    }
    public int getY() {
        return y;
    }

    public Point CalcDistance(Point p){
        return new Point(this.getX() - p.getX(), this.getY() - p.getY());
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void print() {
        System.out.println(String.format("%d:%d", getX(), getY()));
    }
    public static void printPoint(Point p) {
        System.out.println(String.format("%d:%d", p.getX(), p.getY()));
    }
}
