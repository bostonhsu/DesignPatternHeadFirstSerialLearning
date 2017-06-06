package cn.windssoft.command;

/**
 * Created by Administrator on 2017/6/6.
 */
public class Stereo {
    CD _cd;
    Dvd _dvd;
    Radio _radio;
    int _volume;
    String _name;

    public Stereo(String name) {
        _name = name;
    }

    public void on() {
        System.out.println(_name + " stereo is on.");
    }

    public void off() {
        System.out.println(_name + " stereo is off.");
    }

    public void setCd(CD cd) {
        _cd = cd;
    }

    public void setDvd(Dvd dvd) {
        _dvd = dvd;
    }

    public void setRadio(Radio radio) {
        _radio = radio;
    }

    public void setVolume(int volume) {
        _volume = volume;
    }
}
