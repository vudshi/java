package org.pkg;

/**
 * Created by lsm on 4/24/2017.
 */
public class Calc {
    public static void main(String[] args) {
        
    }
    public static float calc(int frst, int scnd, char op) {
        float result;
        switch (op) {
            case '+': result = frst + scnd;
            case '*': result = frst * scnd;
            case '-': result = frst - scnd;
            case '/': result = frst / scnd;
            case '%': result = frst % scnd;
            default : result = 0;
                break;
        };
        return result;
    }
}
