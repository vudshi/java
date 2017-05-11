package org.pkg;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by lsm on 4/24/2017.
 */
public class Lesson3 {
    public static void main(String[] args) {
        String[] laArrayY = null;
        String[] laArrayU = null;
        float[] af = {5.0F, 2.0F, 3.0F};
        int a = 1;
        int[] ar = {0, 1, 2, 3, 4};
        //System.arraycopy(args, 0, laArrayY, 0, 4);
        //System.arraycopy(args, 4, laArrayU, 0, 2);
        /*laArrayY = Arrays.copyOfRange(args,0, 4);
        laArrayU = Arrays.copyOfRange(args,4, 6);
        System.out.println(Arrays.toString(args));
        System.out.println(Arrays.toString(laArrayY));
        System.out.println(Arrays.toString(laArrayU));
        print("Hi I'm calling method print "+ sum(1, 2));*/
        //System.out.println(concat(5.2F, true, "aaaa", 1, 2, 3, 4));

        /*inc(a, ar);
        System.out.println("a = " + a + " ar = " + Arrays.toString(ar));
        inc(a, ar);
        System.out.println("a = " + a + " ar = " + Arrays.toString(ar));*/
        //System.out.println(avg(new float[] {5.0F, 2.0F, 3.0F}));
    }

    public static void print(String message) {
        System.out.println(message);
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
        }
        return result;
    }

    public static int sum(int frst, int scnd) {
        System.out.println("d");
        int result;
        result = frst + scnd;
        return result;
    }
    public static int sum(int...  numbers) {
        System.out.println("v");
        int result;
        result = numbers[0] + numbers[1];
        return result;
    }
    public static float avg(float[] ar) {
        float result = 0;

        for (int i = 0; i < ar.length; i++) {
            result += ar[i];
        }
        return result / ar.length;
    }
    //метод который принимает float boolean string varargs возвращает string
    public static String concat(float pf, boolean bl, String str, int...  numbers) {
        String result;
        result = "" + pf + bl + str;
        for(int i = 0; i < numbers.length; i++) result += numbers[i];
        return result;
    }
    //метод который принимает int x и массив int of 5 увеличавает x на 1 и в массиве не четные индексы на 1. Инициализация в
    //  main. Два раза вызвать метод и вывод чисел в main провеить что изменилось.
    public static void inc(int in, int[] ar) {
        in++;
        for(int i = 0; i < ar.length; i++) {
            if(i % 2 != 0){
                ar[i]++;
            }
        }
    }



}
