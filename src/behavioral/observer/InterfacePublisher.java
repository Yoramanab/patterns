package behavioral.observer;

import java.util.ArrayList;

/**
 * Created by Base on 28.04.2016.
 */
public interface InterfacePublisher {
    ArrayList<InterfaceSubscriber> getListeners();

    void addListener(InterfaceSubscriber listener);

    void removeListener(InterfaceSubscriber listener);

    void removeAllListeners();

    void notifySubscribers(String massage);
}
