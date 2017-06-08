package cn.windssoft.template;

/**
 * Created by Boston Hsu on 6/8/2017.
 */
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Addding Sugar and Milk");
    }
}
