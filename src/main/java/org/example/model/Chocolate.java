package org.example.model;

public class Chocolate extends ProductForSale {

    private double gramaj;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);

    }

    @Override
    public void showDetails() {
        System.out.println("Gramaj: " + gramaj);
        System.out.println("Tip: " + getType());
        System.out.println("Açıklama " + getDescription());
        System.out.println("Fiyat " + getPrice());
    }


}
