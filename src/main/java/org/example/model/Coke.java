package org.example.model;

public class Coke extends ProductForSale{
    private double volume;

    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.volume = 1.00;
    }

    public double getVolume() {
        return volume;
    }

    public void showDetails() {
        System.out.println("Type: " + this.getType() + " price: "
                + this.getPrice() + " description: " + this.getDescription() + " volume: " + this.getVolume());
    }
}
