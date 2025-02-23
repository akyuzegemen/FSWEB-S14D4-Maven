package org.example.model;

public class Bread extends ProductForSale{
    private String breadType;

    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.breadType = "Beyaz ekmek";

    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + this.getType() + " price: "
                + this.getPrice() + " description: " + this.getDescription() + " bread type: " + this.getBreadType());
    }

    public String getBreadType() {
        return breadType;
    }
}
