package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Base on 29.04.2016.
 */
public class Subscriber implements Observer {
    private String senderName;
    private String subscriberName = "Man";
    private String massage;

    @Override
    public void update(Observable o, Object arg) {
        this.senderName = ((Publisher) o).getName();
        this.massage = (String) arg;
        display();
    }

    private void display() {
        System.out.printf("info: %s; from: %s; subscriber: %s.", massage, senderName, subscriberName);
    }
}
