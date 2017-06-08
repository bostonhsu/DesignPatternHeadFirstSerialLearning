package cn.windssoft.adapter;

import java.util.Random;

/**
 * Created by Boston Hsu on 6/8/2017.
 */
public class DuckAdapter implements Turkey {
    Duck _duck;
    Random _random;

    public DuckAdapter(Duck duck) {
        _duck = duck;
        _random = new Random();
    }

    @Override
    public void gobble() {
        _duck.quack();
    }

    @Override
    public void fly() {
        if (_random.nextInt(5) == 0) {
            _duck.fly();
        }
    }
}
