package Points;

/**
 * Created by lsm on 5/1/2017.
 */
public class Main {
    public static void main(String[] args) {
        Point left;
        left = new Point();
        left.setX(12);
        Point right;
        right = new Point();
        right.setX(25);
        Point.printPoint(left);
        Point.printPoint(right);

    }

}
