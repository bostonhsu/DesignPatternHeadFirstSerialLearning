package cn.windssoft.iteratorcomposite;

import java.util.Iterator;

/**
 * Created by Boston Hsu on 2017/6/9.
 */
public class DinerMenuIterator implements Iterator {
    MenuItemOld[] menuItems;
    int position = 0;

    public DinerMenuIterator() {}

    public DinerMenuIterator(MenuItemOld[] menuItems) {
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
        MenuItemOld menuItem = menuItems[position];
        position ++;
        return menuItem;
    }

    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (menuItems[position - 1] != null) {
            for (int i = position - 1; i < (menuItems.length - 1); i++) {
                menuItems[i] = menuItems[i + 1];
            }
            menuItems[menuItems.length - 1] = null;
        }
    }
}
