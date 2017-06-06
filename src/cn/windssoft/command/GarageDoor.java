package cn.windssoft.command;

/**
 * Created by Administrator on 2017/6/5.
 */
public class GarageDoor {
    Light _light;
    String _name;

    public GarageDoor(String name) {
        _name = name;
    }

    public GarageDoor(Light light) {
        _light = light;
    }

    public void up() {
        System.out.println(_name + " garage door open.");
    }

    public void down() {
        System.out.println(_name + " garage door close.");
    }

    public void stop() {
        System.out.println(_name + " garage door stop.");
    }

    public void lightOn() {
        _light.on();
    }

    public void lightOff() {
        _light.off();
    }
}
