package factory;

import factory.pizza.Pizza;
import factory.pizzastore.ChicagoPizzaStore;
import factory.pizzastore.NYPizzaStore;
import factory.pizzastore.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicago = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + '\n');

        pizza = chicago.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
