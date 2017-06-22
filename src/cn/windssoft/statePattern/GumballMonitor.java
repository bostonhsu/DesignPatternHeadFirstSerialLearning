package cn.windssoft.statePattern;

/**
 * Created by Administrator on 2017/6/22.
 */
public class GumballMonitor {
    GumballMachine machine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.machine = gumballMachine;
    }

    public void report() {
        System.out.println("Gumball Machine: " + machine.getLocation());
        System.out.println("Current inventory: " + machine.getCount());
        System.out.println("Current state: " + machine.getState());
    }
}
