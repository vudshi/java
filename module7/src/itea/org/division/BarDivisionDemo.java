package itea.org.division;

import static itea.org.division.Utils.*;
import static itea.org.division.BarDivision.*;

/**
 * Created by lsm on 13.05.2017.
 */
public class BarDivisionDemo {
    public static void main(String[] args) {

        String str = "33465489", divider = "2", dmtr = "|", sub = "-";
        int dividend = 0, div = Integer.parseInt(divider), result = 0;
        int dummy, mult;
        int[] digitArray = new int[str.length()];

        byte shift = 0;
        LinkedItemList itemList = new LinkedItemList();
        Item item = new Item(0, 0, 0);
        boolean format = false;

        BarDivision.getNumberAsArray(str, digitArray);
        for (byte i = 0; i < digitArray.length; i++) {
            dividend = dividend * 10 + digitArray[i];
            mult = getMultiplier(dividend, div);
            dummy = dividend - div * mult;
            dummy = (dummy == 0) ? 0 : dummy;
            if (mult > 0) {
                itemList.add(new Item(dividend, dummy, (div * mult)));
            }
            BarDivision.rollupCalcResult(mult);
            dividend = dummy;
        }
        System.out.println(itemList);
        System.out.println();
        item = itemList.getItem(1);

        //print header and first item
        if (format) {
            System.out.println(String.format("\033[0m%s%s\033[0;4m%s\033[0m", " " + str, dmtr, pad(div, length(BarDivision.getCalcResult()) + 1)));
            System.out.println(String.format("\033[4m%s\033[0m%s%d",
                    -itemList.getItem(1).getMult(), pad("", (str.length() - length(itemList.getItem(1).getMult())), ' ') + dmtr,
                    BarDivision.getCalcResult()));
        } else {
            System.out.println(String.format("%s%s%s", " " + str, dmtr, divider));
            System.out.println(String.format("%s", pad(str.length() + 1) + pad(sub, length(BarDivision.getCalcResult()) + 1, sub.charAt(0))));
            System.out.println(String.format("%s%s%s", " " + item.getStringValue(), pad(str.length() - length(item.getValue())) + dmtr, BarDivision.getCalcResult()));
            System.out.println(String.format("%s", sub + item.getStringMult()));
            System.out.println(pad(1) + pad("-", length(item.getMult()), '-'));
        }
        shift = (byte) ((item.getDiff() == 0) ? 0 : -1);
        //print all other items
        for (int i = 2; i <= itemList.length(); i++) {
            item = itemList.getItem(i);
            System.out.print(item.getItemRow(i - 1 + length(item.getDiff()), sub.charAt(0), format));
            if (!format) {
                System.out.println(pad(i + length(item.getDiff()) + shift) + pad(sub, length(item.getMult()), sub.charAt(0)));
            }
            shift = (byte) ((item.getDiff() == 0) ? 0 : -1);

        }
        //print last item difference
        if (format) {
            System.out.println(String.format("\033[0m%s%d", pad(itemList.length() + shift), item.getDiff()));
        } else {
            System.out.println(String.format("%s%d", pad(itemList.length() + length(item.getDiff())), item.getDiff()));
        }
    }
}
