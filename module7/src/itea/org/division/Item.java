package itea.org.division;

/**
 * Created by lsm on 13.05.2017.
 */
public class Item {
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

    @Override
    public String toString() {
        return "Item[" +
                "value=" + value +
                ", diff=" + diff +
                ", mult=" + mult +
                ']';
    }
}
