package cn.windssoft.iteratorcomposite;

import java.util.Iterator;

/**
 * Created by Administrator on 2017/6/9.
 */

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;


    public Waitress(Menu panCakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = panCakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n-------\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
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
