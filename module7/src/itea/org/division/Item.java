package itea.org.division;

/**
 * Created by lsm on 13.05.2017.
 */
public class Item {
    private byte value, diff, mult;

    public Item(byte value, byte diff, byte mult) {
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
        return (val < 0) ? "" + val : " " + val;
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

    @Override
    public String toString() {
        return "Item[" +
                "value=" + value +
                ", diff=" + diff +
                ", mult=" + mult +
                ']';
    }
}
