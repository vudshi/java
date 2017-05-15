package itea.org.division;

import java.lang.reflect.Array;

import static itea.org.division.BarDivision.*;

/**
 * Created by lsm on 13.05.2017.
 */
public class BarDivisionDemo {
    public static void main(String[] args) {

        String str = "354654", divider = "359", dmtr = "|", sub = "-", line;
        byte dividend = 0, dummy, div = (byte) Integer.parseInt(divider), mult = 0, pmult;
        int[] digitArray = new int[str.length()];
        int result = 0;
        LinkedItemList itemList = new LinkedItemList();

        BarDivision.getNumberAsArray(str, digitArray);
        for (byte i = 0; i < digitArray.length; i++) {
            dividend = (byte) (dividend * 10 + digitArray[i]);
            if (dividend >= div) {
                if (itemList.length() == 0) {
                    line = String.format("\033[0m%s%s\033[0;4m%s\033[0m", " " + str, dmtr, divider);
                } else {
                    line = "";
                }

                mult = (byte) getMultiplier(dividend, div);
                dummy = (byte) (dividend - div * mult);
                dummy = (dummy == 0) ? 0 : dummy;
                addNewListItem(itemList, dividend, dummy, (byte) (div * mult));
                BarDivision.rollupCalcResult(mult);
                dividend = dummy;
            }
        }
        System.out.println(itemList);
        System.out.println(BarDivision.getMultiplier(37, 5));
        System.out.println();


        System.out.println("************");
        System.out.println(String.format("\033[0m%s%s\033[0;4m%s\033[0m", " " + str, dmtr, pad(div, length(BarDivision.getCalcResult()))));
        System.out.println(String.format("\033[4m%s\033[0m%s%d",
                -itemList.getItem(1).getMult(), pad("", (str.length() - length(itemList.getItem(1).getMult())), ' ') + dmtr,
                BarDivision.getCalcResult()));
        pmult = (byte) (length(itemList.getItem(1).getMult()));

        if (itemList.getItem(1).getDiff() == 0) {
            pmult = (byte) (pmult + 1);
        }

        for (int i = 2; i <= itemList.length(); i++) {
            System.out.println(String.format("%s\033[0m%d\033[0m", pad("", -pmult, ' '), itemList.getItem(i).getValue()));
            System.out.println(String.format("%s\033[4m%s\033[0m", pad("", -pmult + 1, ' '),
                    pad(-itemList.getItem(i).getMult(),
                            -length(itemList.getItem(i).getValue()) - 1)
                    )
            );

            pmult = (byte) (pmult + length(itemList.getItem(i).getMult()) - 1);
            if (itemList.getItem(i).getDiff() == 0) {
                pmult = (byte) (pmult + 1);
            }

        }
        System.out.println(String.format("\033[0m%s%d", pad("", -pmult + 1, ' '), itemList.getItem(itemList.length()).getDiff()));
        System.out.println("************");


        System.out.println("result " + BarDivision.getCalcResult());
        System.out.println();
        System.out.println(pad(-100, -4));
        System.out.println(String.format("%s%s%s", str, dmtr, divider));
        System.out.println(Character.toString((char) 175));
        System.out.println("second word is \033[0;4m" + "aaaa");
    }


    static void addNewListItem(LinkedItemList list, byte value, byte diff, byte mult) {
        Item item = new Item(value, diff, mult);
        list.add(item);
    }


    public static String pad(String str, int size, char padChar) {
        StringBuffer padded = new StringBuffer("");
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

    public static int length(int val) {
        int result = 0;
        while (val > 0) {
            val = val / 10;
            result++;
        }

        return result;
    }

    public static int length(byte val) {
        return length((int) val);
    }
}
