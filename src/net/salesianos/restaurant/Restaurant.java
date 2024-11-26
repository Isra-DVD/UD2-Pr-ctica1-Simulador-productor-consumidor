package net.salesianos.restaurant;

import java.util.LinkedList;
import java.util.Queue;

import net.salesianos.productions.Vegetable;

public class Restaurant {
    private int capacity;
    private Queue<Vegetable> store = new LinkedList<>();

    public Restaurant(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void add(Vegetable vegetable) throws InterruptedException {
        while (store.size() == this.capacity) {
            wait();
        }
        store.add(vegetable);
        System.out.println("+ Producto agregado: " + vegetable);
        notifyAll();
    }

    public synchronized void remove(String clientName) throws InterruptedException {
        while (store.isEmpty()) {
            wait();
        }
        Vegetable vegetable = store.poll();
        System.out.println("- Cliente " + clientName + " consumió: " + vegetable);
        notifyAll();
    }
}