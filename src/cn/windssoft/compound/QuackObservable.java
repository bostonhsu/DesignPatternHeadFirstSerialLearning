package cn.windssoft.compound;

import java.util.Observer;

/**
 * Created by Administrator on 2017/6/22.
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
