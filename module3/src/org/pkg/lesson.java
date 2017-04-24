package org.pkg;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by lsm on 4/24/2017.
 */
public class lesson {
    public static void main(String[] args) {
        String[] laArrayY = null;
        String[] laArrayU = null;

        //System.arraycopy(args, 0, laArrayY, 0, 4);
        //System.arraycopy(args, 4, laArrayU, 0, 2);
        laArrayY = Arrays.copyOfRange(args,0, 4);
        laArrayU = Arrays.copyOfRange(args,4, 6);
        System.out.println(Arrays.toString(args));
        System.out.println(Arrays.toString(laArrayY));
        System.out.println(Arrays.toString(laArrayU));
        print("Hi I'm calling method print");
    }

    public static void print(String message) {
        System.out.println(message);
    }
}
