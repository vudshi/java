package itea.org.division;

/**
 * Created by lsm on 13.05.2017.
 */
public class LinkedItemList {
    private static InternalItem first;
    private static int length = 0;

    public LinkedItemList() {
        this.first = null;
    }

    private void setFirst(InternalItem newItem) {
        this.first = newItem;
        this.first.idx = ++this.length;
    }

    private InternalItem getItem(InternalItem item, int idx) {
        return ((item.next != null) && (idx >= item.idx)) ? getItem(item.next, idx) : item;
    }

    private void addInternal(InternalItem newItem) {
        InternalItem dummy = newItem;

        if (this.first == null) {
            setFirst(dummy);
        } else {
            dummy = getItem(this.first, this.length);
            dummy.next = newItem;
            dummy.idx = ++this.length;
        }
    }

    public void add(Item newItem) {
        InternalItem dummy = new InternalItem(newItem);
        addInternal(dummy);
    }

    public Item getFirst() {
        return first.item;
    }

    public Item getLast() {
        return getItem(this.first, this.length()).item;
    }

    public Item getItem(int idx) {
        return getItem(this.first, idx).item;
    }

    public int length() {
        return this.length;
    }

    private String toString(InternalItem item) {
        String result = "";
        if (item != null) {
            result += item.toString() + ((item.next == null) ? "" : ",") + toString(item.next);
        } else {
            result += "";
        }
        return result;
    }

    @Override
    public String toString() {
        return "LinkedItemList{" + toString(first) +
                '}';
    }

    class InternalItem {
        Item item;
        int idx = 0;
        InternalItem next = null;

        InternalItem(Item newItem) {
            item = newItem;
        }

        @Override
        public String toString() {
            return this.item.toString();
        }
    }
}
