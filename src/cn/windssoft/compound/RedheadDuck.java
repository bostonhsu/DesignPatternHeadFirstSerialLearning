package cn.windssoft.compound;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Observer;

/**
 * Created by Administrator on 2017/6/22.
 */
public class RedheadDuck implements Quackable {
    Observable observable;

    public RedheadDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        observable.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
