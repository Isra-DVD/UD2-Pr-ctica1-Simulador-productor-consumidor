package net.salesianos.productions;

public class Vegetable {

    private String type;

    public Vegetable(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Verdura de tipo " + type;
    }
}
