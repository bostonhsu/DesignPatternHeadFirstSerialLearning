package cn.windssoft.compound;

/**
 * Created by Administrator on 2017/6/22.
 */
public class DuckSimulator {
    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable goose = duckFactory.createGoose();

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(goose);

        Flock flockOfMallardDuck = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();
        Quackable mallardFive = duckFactory.createMallardDuck();

        flockOfMallardDuck.add(mallardOne);
        flockOfMallardDuck.add(mallardTwo);
        flockOfMallardDuck.add(mallardThree);
        flockOfMallardDuck.add(mallardFour);
        flockOfMallardDuck.add(mallardFive);

        flockOfDucks.add(flockOfMallardDuck);

        System.out.println("Duck Simulator: with Observer");

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver((java.util.Observer) quackologist);

        simulate(flockOfDucks);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
    }
}
