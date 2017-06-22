package cn.windssoft.iteratorcomposite;

import java.util.ArrayList;

/**
 * Created by Boston Hsu on 6/21/2017.
 */
public class Menu extends MenuComponent {
    ArrayList menuComponets = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponets.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponets.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return (MenuComponent)menuComponets.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("-------------------------");
    }
}
