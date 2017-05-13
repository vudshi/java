package itea.org.division;

/**
 * Created by lsm on 13.05.2017.
 */
public class BarDivision {
    public static void getNumberAsArray(String someInt, int[] digitArray) {
        for (int i = 0; i < digitArray.length; i++) {
            digitArray[i] = Integer.parseInt("" + someInt.charAt(i));
        }
    }

    public static int getMultiplier(int dividend, int divider) {
        int mult = 0;
        while (dividend - divider >= 0) {
            dividend -= divider;
            mult++;
        }
        return mult;
    }

}
