package behavioral.observer.wrong;

/**
 * Created by Base on 28.04.2016.
 */
public class SubscriberOne extends Subscriber {

    public SubscriberOne(String nameSubscriber, String countryFrom) {
        super(nameSubscriber, countryFrom);
    }

    @Override
    public void doAction(String massage) {
        System.out.printf("\tIm %s, a have new HOT news for you: \n", getNameSubscriber());
        System.out.println("\t\t" + massage);
        ConsoleHelper.printDivider();
    }
}
