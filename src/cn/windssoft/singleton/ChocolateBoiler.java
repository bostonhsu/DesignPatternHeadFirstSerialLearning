package cn.windssoft.singleton;

/**
 * Created by Boston Hsu on 6/4/2017.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private volatile static ChocolateBoiler uniqueChocolateBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueChocolateBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (uniqueChocolateBoiler == null) {
                    uniqueChocolateBoiler = new ChocolateBoiler();
                }
            }
        }
        return uniqueChocolateBoiler;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
