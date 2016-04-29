package behavioral.observer.wrong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Base on 28.04.2016.
 */
public class ConsoleHelper {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static String askNews() {
        System.out.println("Are you have a fresh news? Tell us or EXIT to quit");
        String userMassage;
        try {
            if (!(userMassage = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                ConsoleHelper.printDivider();
                return userMassage;
            } else {
                System.out.println("ok, next time");
            }
        } catch (IOException e) {
            System.out.println("some problem with input data");
        }
        return null;
    }

    private ConsoleHelper() {
    }

    public static void printSubscribers(ArrayList<Subscriber> subscribers) {
        System.out.printf("We Have %d subscribers!!! Look at them:\n", subscribers.size());
        for (Subscriber listener : subscribers) {
            System.out.println(listener.getNameSubscriber() + " from " + listener.getCountryFrom());
        }
        System.out.println("Yes, that is our popular app! =)");
        printDivider();
    }

    public static void printDivider() {
        for (int i = 0; i < 100; i++) {
            System.out.print((char)126);
        }
        System.out.println();
    }
}
