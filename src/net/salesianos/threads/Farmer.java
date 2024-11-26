package net.salesianos.threads;

import java.util.Random;

import net.salesianos.productions.Vegetable;
import net.salesianos.restaurant.Restaurant;

public class Farmer extends Thread {

    private String name;
    private int amount;
    private Restaurant restaurant;
    private String[] vegetableType = {
            "lettuce", "cabbage", "onion", "spinach", "potato", "tomato", "asparagus", "radish", "broccoli",
            "artichoke", "tomato", "cucumber", "eggplant", "carrot", "green bean"
    };

    public Farmer(String name, int amount, Restaurant restaurant) {
        this.name = name;
        this.amount = amount;
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            for (int i = 0; i < amount; i++) {
                String type = vegetableType[random.nextInt(vegetableType.length)];
                Vegetable vegetable = new Vegetable(type);
                Thread.sleep(random.nextInt(500) + 500);
                System.out.println(vegetable + " producida por el grajero " + name);
                restaurant.add(vegetable);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
