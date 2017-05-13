package itea.org.book.samples;

/**
 * Created by lsm on 12.05.2017.
 */
public class sample1 {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank();
        tank1.level = 9;

        boolean b = false;
        int ib = b ? 1 : 0;

        switch (ib) {
            case 1:
                System.out.println("true");
            case 0:
                System.out.println("false");
            default:
                System.out.println("default");
        }
        double val = 123;
        byte sign = getSign(val);
        System.out.println(sign);

        val = -0.123;
        sign = getSign(val);
        System.out.println(sign);

        val = 0;
        sign = getSign(val);
        System.out.println(sign);
    }

    static byte getSign(double val) {
        return (byte) ((val > 0) ? 1 : (val < 0) ? -1 : 0);

        /*
        if val = 0 -> 0
        if val > 0 -> 1
        if val < 0 -> -1
        */

    }
}

class Letter {
    char c;
}

class Tank {
    int level;
}
