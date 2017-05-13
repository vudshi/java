package itea.org.division;

import java.lang.reflect.Array;

import static itea.org.division.BarDivision.*;

/**
 * Created by lsm on 13.05.2017.
 */
public class BarDivisionDemo {
    public static void main(String[] args) {

        String str = "784569", divider = "4", dmtr = "|", sub = "-";
        int dividend = 0, div = Integer.parseInt(divider), mult = 0, dummy;
        int[] digitArray = new int[str.length()];
        int result = 0;
        LinkedItemList itemList = new LinkedItemList();

        BarDivision.getNumberAsArray(str, digitArray);
        for (byte i = 0; i < digitArray.length; i++) {
            dividend = dividend * 10 + digitArray[i];
            if (dividend >= div) {
                mult = getMultiplier(dividend, div);
                dummy = dividend - div * mult;
                dummy = (dummy == 0) ? 0 : dummy;
                addNewListItem(itemList, dividend, dummy, mult);
                result = result * 10 + mult;
                dividend = dummy;
            }
        }
        System.out.println(itemList);
        System.out.println(BarDivision.getMultiplier(37, 5));
        System.out.println();

        for (int i = 1; i <= itemList.length(); i++) {
            System.out.println(itemList.getItem(i));
        }
        System.out.println(result);
        System.out.println();
        System.out.println();
        System.out.println(String.format("%s%s%s", str, dmtr, divider));
    }

    static void addNewListItem(LinkedItemList list, int value, int diff, int mult) {
        list.add(new Item(value, diff, mult));
    }

}
