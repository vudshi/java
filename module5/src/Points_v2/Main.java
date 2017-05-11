package Points_v2;

/**
 * Created by lsm on 5/1/2017.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Point, Rectangle
         */
        Point left;
        Point right;

        left = new Point(12, 22);
        right = new Point(25, 26);
        Rectangle rectangle = new Rectangle(left, right);

        //left.print();
        //right.print();

        //System.out.println(rectangle);
        /*Point.printPoint(left);
        Point.printPoint(right);*/
        /**
         * CalcDistance
         */
        Point p = left.CalcDistance(right);
        //System.out.println(p);

        /**
         * QuadraticEquation
         */
        QuadraticEquation q = new QuadraticEquation(1, 5, 2);
        q.CalculateEquation();
        System.out.println(q.getX1()+" "+ q.getX2()+" "+ q.getD());
        System.out.println(q.toString());

        /**
         * MaxBox
         */
        MaxBox box;
        box = new MaxBox();

        box.setBox(-30);
        System.out.println(box.getBox()); //0
        box.setBox(10);
        box.setBox(150);
        box.setBox(70);
        System.out.println(box.getBox()); //150

    }

}
