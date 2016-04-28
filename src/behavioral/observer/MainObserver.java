package behavioral.observer;

import java.util.ArrayList;

/**
 * Created by Base on 28.04.2016.
 */
public class MainObserver {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Subscriber1 listener1 = new Subscriber1("Russia");
        Subscriber1 listenerONE = new Subscriber1("Albania");
        Subscriber2 listener2 = new Subscriber2("Serbia");
        Subscriber2 listenerTWO = new Subscriber2("Macedonia");

        publisher.addListener(listener1);
        publisher.addListener(listener2);
        publisher.addListener(listenerONE);
        publisher.addListener(listenerTWO);

        ConsoleHelper consoleHelper = new ConsoleHelper();

        consoleHelper.printSubscribers(publisher.getListeners());



        publisher.createMassage("oh, its impassably! I dont know what I can do... =( its so terrible");
    }

}
