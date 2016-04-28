package behavioral.observer;

import java.util.ArrayList;

/**
 * Created by Base on 28.04.2016.
 */
public class Publisher implements InterfacePublisher {

    private ArrayList<InterfaceSubscriber> listenersList = new ArrayList<>();

    @Override
    public ArrayList<InterfaceSubscriber> getListeners() {
        return listenersList;
    }

    @Override
    public void addListener(InterfaceSubscriber listener) {
        listenersList.add(listener);
    }

    @Override
    public void removeListener(InterfaceSubscriber listener) {
        listenersList.remove(listener);
    }

    @Override
    public void removeAllListeners() {
        listenersList = new ArrayList<>();
    }

    @Override
    public void notifySubscribers(String massage) {

    }

    public void createMassage(String massage) {
        System.out.println("HOT! new massage from Publisher: " + massage);
    }
}
