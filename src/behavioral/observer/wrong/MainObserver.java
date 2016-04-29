package behavioral.observer.wrong;

/**
 * Created by Base on 28.04.2016.
 */
public class MainObserver {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        SubscriberOne listener1 = new SubscriberOne("Ivan" ,"Russia");
        SubscriberOne listenerONE = new SubscriberOne("Driton", "Albania");
        SubscriberTwo listener2 = new SubscriberTwo("Marko", "Serbia");
        SubscriberTwo listenerTWO = new SubscriberTwo("Pichka", "Macedonia");

        publisher.addListener(listener1);
        publisher.addListener(listener2);
        publisher.addListener(listenerONE);
        publisher.addListener(listenerTWO);

        ConsoleHelper.printSubscribers(publisher.getListeners());

        publisher.createMassage("oh, its impassably! I dont know what I can do... =( its so terrible");

        publisher.removeListener(listenerTWO);
        ConsoleHelper.printSubscribers(publisher.getListeners());

        publisher.createMassage(ConsoleHelper.askNews());
    }

}
