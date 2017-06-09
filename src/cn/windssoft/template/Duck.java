package cn.windssoft.template;

/**
 * Created by Administrator on 2017/6/9.
 */
public class Duck implements Comparable {
    String _name;
    int _weight;

    public Duck(String name, int weight) {
        _name = name;
        _weight = weight;
    }

    public String toString() {
        return _name + " weighs " + _weight;
    }

    @Override
    public int compareTo(Object o) {
        Duck otherDuck = (Duck) o;
        if (this._weight < otherDuck._weight) {
            return -1;
        } else if (this._weight == otherDuck._weight) {
            return 0;
        } else {
            return 1;
        }
    }
}
