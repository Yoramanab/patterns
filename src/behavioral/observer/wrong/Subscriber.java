package behavioral.observer.wrong;

/**
 * Created by Base on 28.04.2016.
 */
public abstract class Subscriber {

    private String nameSubscriber;
    private String countryFrom;

    public Subscriber(String nameSubscriber, String countryFrom) {
        this.nameSubscriber = nameSubscriber;
        this.countryFrom = countryFrom;
    }

    public String getCountryFrom() {
        return countryFrom;
    }

    public String getNameSubscriber() {
        return nameSubscriber;
    }

    void doAction(String massage) {

    }
}
