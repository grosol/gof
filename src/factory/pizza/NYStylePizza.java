package factory.pizza;

public class NYStylePizza extends Pizza{
    public NYStylePizza() {
        name = "NY Style Sauce and Cheese pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
