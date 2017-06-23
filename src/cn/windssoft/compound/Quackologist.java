package cn.windssoft.compound;

/**
 * Created by Administrator on 2017/6/23.
 */
public class Quackologist implements Observer {

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked");
    }
}
