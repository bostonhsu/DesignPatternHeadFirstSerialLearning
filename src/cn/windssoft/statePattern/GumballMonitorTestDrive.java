package cn.windssoft.statePattern;

/**
 * Created by Administrator on 2017/6/22.
 */
public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        int count = 211;
        GumballMachine gumballMachine = new GumballMachine("Tianjin", count);
        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);

        gumballMonitor.report();
    }
}
