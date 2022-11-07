public class MagicBox <T> {
    protected T[] items;

    public MagicBox (int objectAmount) {
       items = (T[]) new Object[objectAmount];
    }
    public MagicBox() {
        this(1);
    }

    public boolean add (T item){
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }
    public T getItem (int itemNumber) {
        return items[itemNumber];
    }

}
