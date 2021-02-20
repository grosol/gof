package factory.pizzastore;

import factory.pizza.ChicagoStyleCheesePizza;
import factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        return new ChicagoStyleCheesePizza();
    }
}
