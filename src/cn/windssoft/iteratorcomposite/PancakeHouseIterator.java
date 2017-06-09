package cn.windssoft.iteratorcomposite;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/9.
 */
public class PancakeHouseIterator extends DinerMenuIterator {

    public PancakeHouseIterator(ArrayList menuItems) {
        this.menuItems = (MenuItem[]) menuItems.toArray();
    }
}
