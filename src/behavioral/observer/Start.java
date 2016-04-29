package behavioral.observer;

/**
 * Created by Base on 29.04.2016.
 */
public class Start {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Subscriber subscriber = new Subscriber();

        publisher.addObserver(subscriber);

        publisher.notifyObservers("Hello World!");
    }
}
