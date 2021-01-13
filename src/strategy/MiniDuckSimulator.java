package strategy;

import strategy.duck.Duck;
import strategy.duck.MallardDuck;
import strategy.duck.ModelDuck;
import strategy.fly.FlyRockedPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRockedPowered());
        model.performFly();

    }
}
