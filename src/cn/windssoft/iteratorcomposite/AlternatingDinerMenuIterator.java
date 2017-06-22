package cn.windssoft.iteratorcomposite;

import java.util.Iterator;
import java.util.Calendar;

/**
 * Created by Boston Hsu on 6/21/2017.
 */
public class AlternatingDinerMenuIterator implements Iterator {
    MenuItemOld[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItemOld[] items) {
        this.items = items;
        Calendar rightNow = Calendar.getInstance();
        position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItemOld item = items[position];
        position = position + 2;
        return item;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove()");
    }
}
