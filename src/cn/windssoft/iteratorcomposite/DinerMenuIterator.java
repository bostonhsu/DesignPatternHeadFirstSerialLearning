package cn.windssoft.iteratorcomposite;

/**
 * Created by Boston Hsu on 2017/6/9.
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator() {}

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position ++;
        return menuItem;
    }
}
