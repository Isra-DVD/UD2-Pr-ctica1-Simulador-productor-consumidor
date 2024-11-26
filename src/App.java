import net.salesianos.restaurant.Restaurant;
import net.salesianos.threads.Client;
import net.salesianos.threads.Farmer;

public class App {
    public static void main(String[] args) throws Exception {
        Restaurant restaurant = new Restaurant(10);

        Farmer farmer1 = new Farmer("Paco", 5, restaurant);

        Client consumer1 = new Client("Faustino", 5, restaurant);

        farmer1.start();

        consumer1.start();
    }
}
