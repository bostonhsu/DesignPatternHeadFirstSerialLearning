package cn.windssoft.command;

/**
 * Created by Administrator on 2017/6/6.
 */
public class CeilingFan {
    String _name;
    int _speed;

    public CeilingFan(String name) {
        _name = name;
    }

    public void high() {
        System.out.println(_name + " ceiling fan is high speed.");
    }

    public void medium() {
        System.out.println(_name + " ceiling fan is medium speed.");
    }

    public void low() {
        System.out.println(_name + " ceiling fan is low speed.");
    }

    public void off() {
        System.out.println(_name + " ceiling fan is off.");
    }

    public int getSpeed() {
        return _speed;
    }
}
