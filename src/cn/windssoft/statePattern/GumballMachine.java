package cn.windssoft.statePattern;

/**
 * Created by Administrator on 2017/6/22.
 */
public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state = soldOutState;
    int count = 0;
}
