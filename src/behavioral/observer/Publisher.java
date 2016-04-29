package behavioral.observer;

import java.util.ArrayList;

/**
 * Created by Base on 28.04.2016.
 */
public class Publisher implements InterfacePublisher {

    private ArrayList<Subscriber> listenersList = new ArrayList<>();

    @Override
    public ArrayList<Subscriber> getListeners() {
        return listenersList;
    }

    @Override
    public void addListener(Subscriber listener) {
        listenersList.add(listener);
    }

    @Override
    public void removeListener(Subscriber listener) {
        listenersList.remove(listener);
        System.out.println(listener.getNameSubscriber() + " Unsubscribed =(");
        ConsoleHelper.printDivider();
    }

    @Override
    public void removeAllListeners() {
        listenersList = new ArrayList<>();
    }

    @Override
    public void notifySubscribers(String massage) {
        for (Subscriber subscriber : listenersList) {
            subscriber.doAction(massage);
        }
    }

    public void createMassage(String massage) {
        if (massage != null) {
            System.out.println("HOT! new massage from Publisher: " + massage);
            notifySubscribers(massage);
        }
    }
}
