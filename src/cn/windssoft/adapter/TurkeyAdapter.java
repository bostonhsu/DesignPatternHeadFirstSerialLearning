package cn.windssoft.adapter;

/**
 * Created by Boston Hsu on 6/8/2017.
 */
public class TurkeyAdapter implements Duck {
    Turkey _turkey;

    public TurkeyAdapter(Turkey turkey) {
        _turkey = turkey;
    }

    @Override
    public void quack() {
        _turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            _turkey.fly();
        }
    }
}
