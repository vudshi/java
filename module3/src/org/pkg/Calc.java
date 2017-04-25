package org.pkg;

/**
 * Created by lsm on 4/24/2017.
 */
public class Calc {
    public static void main(String[] args) {
        System.out.println(+ (float)25/3);
        System.out.println(calc(-9, 7, '-'));
    }
    public static float calc(int frst, int scnd, char op) {
        float result = 0;
        switch (op) {
            case '+': {result = sum(frst, scnd);
                       break;
                      }
            case '*': {result = mult(frst, scnd);
                       break;
                      }
            case '-': {result = sub(frst, scnd);
                       break;
                      }
            case '/': {result = frst / scnd;
                       break;
                      }
            case '%': {result = frst % scnd;
                       break;
                      }
            default : {result = 0;
                       break;
                      }
        }
        return result;
    }
    public static int sum(int frst, int scnd) {
        return frst + scnd;
    }
    public static int inc(int frst) {
        final byte ONE = 1;
        return sum(frst, ONE);
    }

    public static int mult(int frst, int scnd) {
        final byte ZERO = 0, NOT_ZERO = ~ZERO;
        int result = ZERO, sf, ss;
        sf = frst >> NOT_ZERO;
        ss = scnd >> NOT_ZERO;

        frst = (frst < ZERO) ? inc(~frst) : frst;
        scnd = (scnd < ZERO) ? inc(~scnd) : scnd;

        while (scnd > ZERO){
            scnd = sum(scnd, NOT_ZERO);
            result = sum(result, frst);
        }

        result = (sum(sf, ss) == NOT_ZERO) ?  inc(~result) : result;
        return result;
    }
    public static int sub(int frst, int scnd) {
        return sum(frst, inc(~scnd));
    }
}
