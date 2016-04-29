package behavioral.observer;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Base on 29.04.2016.
 */

public class Publisher extends Observable {
    public String getName() {
        return name;
    }
    private String name = "Pablo";

    @Override
    public void notifyObservers(Object arg) {
        System.out.println("start sending massage...");

        super.setChanged();
        super.notifyObservers(arg);
    }
}
