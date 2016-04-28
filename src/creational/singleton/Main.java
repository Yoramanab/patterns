package creational.singleton;

/**
 * Created by Base on 28.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.print();
        Singleton.getInstance().print();

        if (singleton.equals(Singleton.getInstance())) {
            System.out.println("true");
        } else System.out.println("false");
    }
}
