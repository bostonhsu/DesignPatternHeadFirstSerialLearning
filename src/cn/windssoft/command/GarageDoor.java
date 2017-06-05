package cn.windssoft.command;

/**
 * Created by Administrator on 2017/6/5.
 */
public class GarageDoor {
    Light _light;

    public GarageDoor(Light light) {
        _light = light;
    }

    public void up() {
        System.out.println("Garage door open.");
    }

    public void down() {
        System.out.println("Garage door close.");
    }

    public void stop() {
        System.out.println("Garage door stop.");
    }

    public void lightOn() {
        _light.on();
    }

    public void lightOff() {
        _light.off();
    }
}
