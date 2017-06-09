package cn.windssoft.iteratorcomposite;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/9.
 */
public class MenuTestDrive {
    PanCakeHouseMenu panCakeHouseMenu = new PanCakeHouseMenu();
    ArrayList breakfastItems = panCakeHouseMenu.getMenuItems();

    DinerMenu dinerMenu = new DinerMenu();
    MenuItem[] lunchItems = dinerMenu.getMenuItems();

    
}
