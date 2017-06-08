package cn.windssoft.template;

/**
 * Created by Boston Hsu on 6/8/2017.
 */
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
