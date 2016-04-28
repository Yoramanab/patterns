package behavioral.observer;

/**
 * Created by Base on 28.04.2016.
 */
public class Subscriber1 implements InterfaceSubscriber {
    private String nameSubscriber;
    private String countryFrom;

    public Subscriber1(String nameSubscriber, String countryFrom) {
        this.nameSubscriber = nameSubscriber;
        this.countryFrom = countryFrom;
    }

    public String getCountryFrom() {
        return countryFrom;
    }

    public String getNameSubscriber() {
        return nameSubscriber;
    }

    @Override
    public void doAction(String massage) {
        System.out.println("\tIm subONE, a have new HOT news for you: ");
        System.out.println("\t\t" + massage);
    }
}
