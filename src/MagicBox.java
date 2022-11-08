import java.util.Random;

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

    public T pick () {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                int j = items.length - i;
                //System.out.println("Коробка не полна, свободных ячеек: " + j);
                //break;
                throw new RuntimeException("Коробка не полна, свободных ячеек: " + j);
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }

}
