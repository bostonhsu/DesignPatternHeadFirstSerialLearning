package cn.windssoft.compound;

/**
 * Created by Administrator on 2017/6/22.
 */
public class DuckSimulator {
    private void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable goose = new GooseAdapter(new Goose());

        System.out.println("Duck Simulator: Goose play in");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
    }
}
