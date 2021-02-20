package factory.pizzastore;

import factory.pizza.NYStylePizza;
import factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        return new NYStylePizza();
    }
}
