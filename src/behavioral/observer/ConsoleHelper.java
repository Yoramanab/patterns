package behavioral.observer;

import java.util.ArrayList;

/**
 * Created by Base on 28.04.2016.
 */
public class ConsoleHelper {
    public void printSubscribers(ArrayList<InterfaceSubscriber> subscribers) {
        System.out.printf("We Have %d subscribers!!! Look at them:", subscribers.size());
        for (InterfaceSubscriber listener : subscribers) {
            System.out.println(listener.);
        }
    }
}
