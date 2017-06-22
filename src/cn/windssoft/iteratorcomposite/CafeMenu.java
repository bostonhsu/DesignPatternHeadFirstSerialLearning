package cn.windssoft.iteratorcomposite;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by Boston Hsu on 6/21/2017.
 */
public class CafeMenu extends MenuComponent {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burge and Air Fries", "Veggie burge on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamola", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItemOld menuItem = new MenuItemOld(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
