package itea.org.division;

/**
 * Created by lsm on 15.05.2017.
 */
public class Utils {
    public static String pad(String str, int size, char padChar) {
        StringBuilder padded = new StringBuilder("");
        while (str.length() + padded.length() < Math.abs(size)) {
            padded.append(padChar);
        }
        return (size >= 0) ? str + padded.toString() : padded.toString() + str;
    }

    public static String pad(int val, int size) {
        return pad("" + val, size, ' ');
    }

    public static String pad(byte val, byte size) {
        return pad((int) val, (int) size);
    }

    public static String pad(int size) {
        return pad("", size, ' ');
    }

    public static int length(int val) {
        int result = 0;
        while (val > 0) {
            val = val / 10;
            result++;
        }

        return result;
    }
}
