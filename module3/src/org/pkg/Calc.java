package org.pkg;

/**
 * Created by lsm on 4/24/2017.
 */
public class Calc {
    public static final byte ZERO = 0, ONE = 1, NOT_ZERO = ~ZERO;

    public static void main(String[] args) {
        int a, b;
        a = -10; b = 6;

        System.out.println("* "+ calc(a, b, '+') + "| " + (a + b));
        System.out.println("* "+ calc(a, b, '*') + "| " + (a * b));
        System.out.println("- "+ calc(a, b, '-') + "| " + (a - b));
        System.out.println("/ "+ calc(a, b, '/') + "| " + ((b == ZERO) ? ZERO : a / b));
        System.out.println("% "+ calc(a, b, '%') + "| " + ((b == ZERO) ? ZERO : a % b));
        System.out.println("");
    }

    public static int calc(int frst, int scnd, char op) {
        int result = ONE;
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
            case '/': {result = div(frst, scnd);
                       break;
                      }
            case '%': {result = mod(frst, scnd);
                       break;
                      }
            default : {result = 0;
                       break;
                      }
        }
        return result;
    }

    public static int sum(int frst, int scnd) {
        int result;
        int q =(frst & scnd) << ONE;
        result = frst ^ scnd;
        frst = result;
        while (q != ZERO) {
            result = result ^ q;
            q = (frst & q) << ONE;
            frst = result;
        }
        return result;
    }

    /*public static int sum(int frst, int scnd) {
        System.out.println("r " + frst + " " + scnd);
        int result = frst ^ scnd;
        int q = (frst & scnd) << ONE;
        System.out.println("r0 " + result + " " + q);
        if (q != ZERO) {
            System.out.println("r1 " + result + " " + q);
            return sum(result, q);
        }
        return result;
    }*/

    public static int inc(int vl) {
        return sum(vl, ONE);
    }

    public static int sign(int vl) {
        return ((vl >> NOT_ZERO) == ZERO) ? ONE : NOT_ZERO;
    }

    public static int neg(int vl) {
        return (vl > ZERO) ? inc(~vl) : vl;
    }

    public static int pos(int vl) {
        return (vl < ZERO) ? inc(~vl) : vl;
    }

    public static int srev(int vl) {
        return (vl < ZERO) ? pos(vl) : neg(vl);
    }

    public static int mult(int frst, int scnd) {
        int result = ZERO, s = sum(sign(frst), sign(scnd));
        frst = pos(frst);
        scnd = pos(scnd);

        while (scnd > ZERO){
            scnd = sum(scnd, NOT_ZERO);
            result = sum(result, frst);
        }
        result = (s == ZERO) ?  neg(result) : result;
        return result;
    }

    public static int sub(int frst, int scnd) {
        return sum(frst, srev(scnd));
    }

    public static int mod(int frst, int scnd) {
        int s = ONE;
        return mult(div(frst, scnd, ZERO), sign(frst));
     }

    public static int div(int frst, int scnd) {
        int result = ZERO;
        return  mult(div(frst, scnd, ONE), (sum(sign(frst), sign(scnd)) == ZERO) ? NOT_ZERO : ONE);
    }
    public static int div(int frst, int scnd, int md) {
        int i = ZERO, result = ZERO;
        if (scnd != ZERO) {
            frst = pos(frst);
            scnd = pos(scnd);

            while (scnd <= frst) {
                i = inc(i);
                frst = sub(frst, scnd);
            }
        result = (md == ONE) ? i : frst;
        }
        return result;
    }
}
