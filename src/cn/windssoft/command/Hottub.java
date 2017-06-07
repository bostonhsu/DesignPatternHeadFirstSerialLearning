package cn.windssoft.command;

/**
 * Created by Boston Hsu on 6/7/2017.
 */
public class Hottub {
    private String _name;

    public Hottub(String name) {
        _name = name;
    }

    public void on() {
        System.out.println(_name + " is on.");
    }

    public void off() {
        System.out.println(_name + " is off.");
    }
}
