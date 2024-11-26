package net.salesianos.threads;

import java.util.Random;
import net.salesianos.restaurant.Restaurant;

public class Client extends Thread {

    private String name;
    private int amount;
    private Restaurant restaurant;

    public Client(String id, int amount, Restaurant restaurant) {
        this.name = id;
        this.amount = amount;
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            for (int i = 0; i < amount; i++) {
                restaurant.remove(this.name);
                Thread.sleep(random.nextInt(1500) + 500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
