package Points_v2;

/**
 * Created by lsm on 5/1/2017.
 */
public class MaxBox {
    private int box;

    public int getBox() {
        return box;
    }

    public void setBox(int box) {
        if (box > 0 & (this.box < box))
        this.box = box;
    }
}
