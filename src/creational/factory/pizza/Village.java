package creational.factory.pizza;

import java.util.ArrayList;

/**
 * Created by Base on 04.05.2016.
 */
public class Village extends Pizza {
    private String name = "Village";
    private double price = 7.20;
    private ArrayList<String> toppings;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public ArrayList<String> setToppings(ArrayList<String> toppings) {
        toppings = super.setToppings(toppings);
        toppings.add("mushrooms");
        return toppings;
    }
}