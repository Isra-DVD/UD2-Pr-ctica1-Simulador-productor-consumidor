import net.salesianos.restaurant.Restaurant;
import net.salesianos.threads.Client;
import net.salesianos.threads.Farmer;

public class App {
    public static void main(String[] args) throws Exception {
        Restaurant restaurant = new Restaurant(10);

        Farmer farmer1 = new Farmer("Paco", 10, restaurant);
        Farmer farmer2 = new Farmer("Ramón", 10, restaurant);

        Client consumer1 = new Client("Faustino", 5, restaurant);
        Client consumer2 = new Client("Mr. Gentleman", 10, restaurant);
        Client consumer3 = new Client("Loquendo", 5, restaurant);

        farmer1.setPriority(Thread.MAX_PRIORITY);
        farmer2.setPriority(Thread.MAX_PRIORITY);

        farmer1.start();
        farmer2.start();

        consumer1.start();
        consumer2.start();
        consumer3.start();
    }
}
