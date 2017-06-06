package cn.windssoft.command;

/**
 * Created by Administrator on 2017/6/5.
 */
public class Light {
    String _name;

    public Light(String name) {
        _name = name;
    }

    public void on() {
        System.out.println(_name + " light is on.");
    }

    public void off() {
        System.out.println(_name + " light is off.");
    }
}
