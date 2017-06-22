package cn.windssoft.statePattern;

/**
 * Created by Administrator on 2017/6/22.
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("There isn't any gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void dispense() {
        System.out.println("There isn't any gumball");
    }

    public static void main(String[] args) {
        char c = 'A';
        int num = 10;
        switch (c) {
            case 'B':
                num ++;
            case 'A':
                num ++;
            case 'Y':
                num ++;
                break;
                default:
                    num --;
        }

        System.out.println(num);
    }

    public String ToString() {
        return this.getClass().toString();
    }
}
