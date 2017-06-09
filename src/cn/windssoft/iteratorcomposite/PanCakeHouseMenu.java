package cn.windssoft.iteratorcomposite;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/9.
 */
public class PanCakeHouseMenu {
    ArrayList _menuItems;

    public PanCakeHouseMenu() {
        _menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        _menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return _menuItems;
    }
}
