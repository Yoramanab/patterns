package behavioral.observer;

import java.util.ArrayList;

/**
 * Created by Base on 28.04.2016.
 */
public interface InterfacePublisher {
    ArrayList<Subscriber> getListeners();

    void addListener(Subscriber listener);

    void removeListener(Subscriber listener);

    void removeAllListeners();

    void notifySubscribers();
}
