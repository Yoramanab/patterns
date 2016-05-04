package creational.factory;

import creational.factory.fabrika.PizzaFactory;
import creational.factory.pizza.Pizza;

/**
 * Created by Base on 04.05.2016.
 */
public class StorePizza {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.createOrder("Village");
//        Pizza pizza = factory.createOrder("Village2"); //if wrong name
        if (pizza != null) {
            pizza.startCook();
        }

        Thread.yield();
        System.out.println("---------------------------------------");

        pizza = factory.createOrder("Homemade");
        pizza.startCook();
    }
}
