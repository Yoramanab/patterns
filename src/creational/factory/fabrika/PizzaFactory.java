package creational.factory.fabrika;

import creational.factory.pizza.Homemade;
import creational.factory.pizza.Pizza;
import creational.factory.pizza.Village;

/**
 * Created by Base on 04.05.2016.
 */
public class PizzaFactory {
    private String type;

    public Pizza createOrder(String type) {
        if (type.equalsIgnoreCase("Homemade")) {
            return new Homemade();
        } else if (type.equalsIgnoreCase("Village")) {
            return new Village();
        } else {
            System.out.println("not detected =(");
        }
        return null;
    }
}
