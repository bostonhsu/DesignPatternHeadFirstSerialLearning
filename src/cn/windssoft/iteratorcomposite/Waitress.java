package cn.windssoft.iteratorcomposite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Administrator on 2017/6/9.
 */

public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
