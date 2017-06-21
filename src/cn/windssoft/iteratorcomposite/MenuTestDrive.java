package cn.windssoft.iteratorcomposite;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/9.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PanCakeHouseMenu panCakeHouseMenu = new PanCakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(panCakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
