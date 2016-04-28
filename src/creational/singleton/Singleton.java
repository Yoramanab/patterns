package creational.singleton;

/**
 * Created by Base on 28.04.2016.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    //для многопоточности: public static synchronized Singleton getInstance() {
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void print() {
        System.out.println(this);
    }
}
