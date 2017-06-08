package cn.windssoft.template;

/**
 * Created by Boston Hsu on 6/8/2017.
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        System.out.println("\nMaking coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
