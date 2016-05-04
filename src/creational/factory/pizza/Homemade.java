package creational.factory.pizza;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Base on 04.05.2016.
 */
public class Homemade extends Pizza {
    private String name = "Homemade";
    private double price = 6.75;
    private ArrayList<String> toppings;

    @Override
    public ArrayList<String> setToppings(ArrayList<String> toppings) {
        toppings = super.setToppings(toppings);
        toppings.add("sausage");
        return toppings;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    void bake() {
        System.out.println("Bake for 20 minutes at 370");
        StringBuilder string = new StringBuilder(".");

        for (int i = 0; i < 6; i++) {
            System.out.print(string);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("=(");
            }
        }
        System.out.println();
    }
}
