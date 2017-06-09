package cn.windssoft.iteratorcomposite;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/9.
 */
public class PancakeHouseIterator implements Iterator {
    ArrayList menuItems;
    int position = 0;

    public PancakeHouseIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Object object = menuItems.get(position);
        position ++;
        return object;
    }
}
