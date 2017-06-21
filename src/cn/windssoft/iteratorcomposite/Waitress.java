package cn.windssoft.iteratorcomposite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Administrator on 2017/6/9.
 */

public class Waitress {
    ArrayList menus;

    public Waitress(ArrayList menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + "\t");
            System.out.print(menuItem.getDescription() + "\t");
            System.out.println(menuItem.getRice());
        }
    }
}
