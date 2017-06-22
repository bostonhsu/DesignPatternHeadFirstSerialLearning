package cn.windssoft.iteratorcomposite;

/**
 * Created by Administrator on 2017/6/9.
 */
public class MenuItemOld {
    String _name;
    String _description;
    boolean _vegetarian;
    double _rice;

    public MenuItemOld(String name, String description, boolean vegetarian, double rice) {
        _name = name;
        _description = description;
        _vegetarian = vegetarian;
        _rice = rice;
    }

    public String getName() {
        return _name;
    }

    public String getDescription() {
        return _description;
    }

    public boolean isVegetarian() {
        return _vegetarian;
    }

    public double getRice() {
        return _rice;
    }
}
