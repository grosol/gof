package strategy.duck;

import strategy.fly.FlyNoWay;
import strategy.quack.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
