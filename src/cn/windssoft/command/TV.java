package cn.windssoft.command;

/**
 * Created by Administrator on 2017/6/5.
 */
public class TV {
    private int _channel;
    private int _volume;
    private String _name;

    public TV(String name) {
        _name = name;
    }
    public void on() {
        System.out.println(_name + " is on.");
    }

    public void off() {
        System.out.println(_name + " is off.");
    }

    public void setInputChannel(int channel) {
        _channel = channel;
    }

    public void setVolume(int volume) {
        _volume = volume;
    }
}
