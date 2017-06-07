package cn.windssoft.command;

/**
 * Created by Boston Hsu on 2017/6/6.
 */
public class CeilingFan {
    String _name;
    int _speed;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String _location;

    public CeilingFan(String location) {
        _location = location;
        _speed = OFF;
    }

    public void high() {
        _speed = HIGH;
    }

    public void medium() {
        _speed = MEDIUM;
    }

    public void low() {
        _speed = LOW;
    }

    public void off() {
        _speed = OFF;
    }

    public int getSpeed() {
        return _speed;
    }
}
