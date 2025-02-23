package org.example.model;

public class Chocolate extends ProductForSale {
    private String aroma;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.aroma = "bitter";
    }

    public String getAroma() {
        return aroma;
    }

    public void showDetails() {
        System.out.println("Type: " + this.getType() + " price: "
                + this.getPrice() + " description: " + this.getDescription() + " aroma: " + this.getAroma());
    }


}
