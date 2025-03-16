package org.example.model;

public class Bread extends ProductForSale {

    private int dilimSayisi;

    public Bread(String type, double price, String description) {
        super(type, price, description);

    }

    @Override
    public void showDetails() {
        System.out.println("Dilim Sayısı " + dilimSayisi);
        System.out.println("Tip: " + getType());
        System.out.println("Açıklama " + getDescription());
        System.out.println("Fiyat " + getPrice());
    }




}
