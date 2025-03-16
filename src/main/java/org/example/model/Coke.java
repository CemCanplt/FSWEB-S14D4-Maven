package org.example.model;

public class Coke extends ProductForSale {

    private boolean isZeroSugar;

    public Coke(String type, double price, String description) {
        super(type, price, description);

    }

    @Override
    public void showDetails() {
        System.out.println("Zero Sugar mı? " + isZeroSugar);
        System.out.println("Tip: " + getType());
        System.out.println("Açıklama " + getDescription());
        System.out.println("Fiyat " + getPrice());
    }


}
