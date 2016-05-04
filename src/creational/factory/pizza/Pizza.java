package creational.factory.pizza;

import java.util.ArrayList;

/**
 * Created by Base on 04.05.2016.
 */
public abstract class Pizza {
    private String name;
    private String dough;
    private String sauce;
    private ArrayList<String> toppings = new ArrayList<>();
    private double price;

    public ArrayList<String> setToppings(ArrayList<String> toppings) {
        toppings.add("tomato");
        toppings.add("cheese");
        toppings.add("bacon");
        toppings.add("paper");
        return toppings;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    void prepare() {
        setToppings(toppings);
        System.out.println("Preparing " + getName());
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.print("Adding toppings... ");
        for (String topping : toppings) {
            System.out.print(topping + ", ");
        }
        System.out.println();
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
        StringBuilder string = new StringBuilder(".");

        for (int i = 0; i < 6; i++) {
            System.out.print(string);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("=(");
            }
        }
        System.out.println();
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices...");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void pizzaPrepared() {
        System.out.printf("Pizza %s is prepared! Please, %.2f eur\n", getName(), getPrice());
    }

    public void startCook(){
        prepare();
        bake();
        cut();
        box();
        pizzaPrepared();
    }
}
