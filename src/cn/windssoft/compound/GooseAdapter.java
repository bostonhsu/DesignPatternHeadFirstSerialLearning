package cn.windssoft.compound;

/**
 * Created by Administrator on 2017/6/22.
 */
public class GooseAdapter implements Quackable {
    Goose goose;
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
