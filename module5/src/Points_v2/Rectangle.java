package Points_v2;

/**
 * Created by lsm on 5/1/2017.
 */
public class Rectangle {
    private Point left, right;

    public Rectangle(Point left, Point right) {
        this.left = left;
        this.right = right;
    }

    public Point getLeft() {
        return left;
    }

    public Point getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
