package org.example.model;

import org.jetbrains.annotations.NotNull;

public class Store {

    public static void listProducts(ProductForSale @NotNull [] x)
    {
        for (ProductForSale productForSale : x) {
            productForSale.showDetails();
        }
    }
    public static void main(String[] args) {
        ProductForSale[] arr = new ProductForSale[3];
        ProductForSale chocolate = new Chocolate("Chocolate", 10000, "A good Chocolate");
        ProductForSale coke = new Coke("Coke", 2000, "Coca Cola");
        ProductForSale bread = new Bread("Bread", 15000, "Vakfıkebir");
        arr[0] = chocolate;
        arr[1] = coke;
        arr[2] = bread;
        Store.listProducts(arr);


        //listProducts();
    }



}