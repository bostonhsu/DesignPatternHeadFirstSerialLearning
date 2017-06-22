package cn.windssoft.compound;

/**
 * Created by Administrator on 2017/6/22.
 */
public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks ++;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }
}
