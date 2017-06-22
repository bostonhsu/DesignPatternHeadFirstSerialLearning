package cn.windssoft.statePattern;

/**
 * Created by Administrator on 2017/6/22.
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
