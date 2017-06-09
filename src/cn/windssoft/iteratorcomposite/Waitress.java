package cn.windssoft.iteratorcomposite;

/**
 * Created by Administrator on 2017/6/9.
 */
public class Waitress {
    PanCakeHouseMenu panCakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PanCakeHouseMenu panCakeHouseMenu, DinerMenu dinerMenu) {
        this.panCakeHouseMenu = panCakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = panCakeHouseMenu.createIterator();
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
