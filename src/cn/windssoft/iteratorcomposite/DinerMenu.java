package cn.windssoft.iteratorcomposite;

import java.util.Iterator;

/**
 * Created by Administrator on 2017/6/9.
 */
public class DinerMenu extends MenuComponent {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItemOld[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItemOld[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog", "A hot dog, with saurkrant, relish, onions, topped with cheese", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItemOld menuItem = new MenuItemOld(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems ++;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
