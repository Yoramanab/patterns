package behavioral.observer.wrong;

/**
 * Created by Base on 28.04.2016.
 */
public class SubscriberTwo extends Subscriber {

    public SubscriberTwo(String nameSubscriber, String countryFrom) {
        super(nameSubscriber, countryFrom);
    }

    @Override
    public void doAction(String massage) {
        System.out.printf("\tIm %s, look at some interesting what happened in our world: \n", getNameSubscriber());
        System.out.println("\t\t" + massage);
        ConsoleHelper.printDivider();
    }
}
