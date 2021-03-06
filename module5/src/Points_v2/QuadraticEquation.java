package Points_v2;

/**
 * Created by lsm on 5/1/2017.
 */


public class QuadraticEquation {
    private int a, b, c;
    private static double D = -1D;
    private InputData i;
    public static double x1, x2;

    public QuadraticEquation(int a, int b, int c) {
        i = new InputData();
        if (i.allArgIsGood(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            printBadInputData();
        }
    }

    private void printBadInputData() {
        System.out.println(i.toString());
    }

    private void CalculateD() {
        D = b * b - 4 * a * c;
    }

    private void CalculateX() {

        CalculateD();
        switch ((D > 0) ? 0 : (D < 0) ? -1 : 1) {
            case 0:
                this.x1 = (-b - Math.sqrt(D)) / (2 * a);
            case 1:
                this.x2 = (-b + Math.sqrt(D)) / (2 * a);
                break;
            default:
                break;
        }
    }

    public void CalculateEquation() {
        this.CalculateX();
    }

    public static double getX1() {
        return x1;
    }

    public static double getX2() {
        return x2;
    }

    public static double getD() {
        return D;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public String toString() {
        ResultData r = new ResultData();
        if (i.isResult()) {
            return r.formatResult(this);
        } else {
            return i.toString();
        }
    }
}
