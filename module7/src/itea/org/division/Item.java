package itea.org.division;

import static itea.org.division.Utils.*;

/**
 * Created by lsm on 13.05.2017.
 */
public class Item {
    private static final String DELIMETER_STR = "\n";
    private static final String SIMPLE_STR = "%s";
    private static final String FIRST_STR_FORMAT = "\033[0m%s\033[0m";
    private static final String SECOND_STR_FORMAT = "\033[4m%s\033[0m";
    private int value, diff, mult;

    public Item(int value, int diff, int mult) {
        this.value = value;
        this.diff = diff;
        this.mult = mult;
    }

    public int getValue() {
        return value;
    }

    public int getDiff() {
        return diff;
    }

    public int getMult() {
        return mult;
    }

    private String getValAsString(int val) {
        return "" + val;
    }

    public String getStringValue() {
        return getValAsString(value);
    }

    public String getStringDiff() {
        return getValAsString(diff);
    }

    public String getStringMult() {
        return getValAsString(mult);
    }

    private void append(StringBuilder b, int t, String s, String d) {
        b.append(pad(t));
        b.append(s);
        b.append(d);
    }

    public String getItemRow(int tab, char prefix, boolean format) {
        StringBuilder result = new StringBuilder("");
        //build first str
        append(result, tab, String.format((format) ? FIRST_STR_FORMAT : SIMPLE_STR, getStringValue()), DELIMETER_STR);
        //build second str
        append(result, tab - Character.charCount(prefix), String.format((format) ? SECOND_STR_FORMAT : SIMPLE_STR, prefix + getStringMult()), DELIMETER_STR);
        return result.toString();
    }

    @Override
    public String toString() {
        return "Item[" +
                "value=" + getStringValue() +
                ", diff=" + getStringDiff() +
                ", mult=" + getStringMult() +
                ']';
    }
}
