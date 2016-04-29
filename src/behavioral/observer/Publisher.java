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
    public String name = "Pablo";

    private ArrayList<Observer> observers = new ArrayList<>();

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    @Override
    public synchronized void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers(Object arg) {
        for (Observer observer : observers) {
            observer.update(this, arg);
        }
    }
}
