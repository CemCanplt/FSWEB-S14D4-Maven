package org.example.model;

public class Store {
    public static void main(String[] args) {

        //listProducts();

        ProductForSale[] products = new ProductForSale[]{
                new Chocolate("Chocolate", 5.99, "Dark chocolate with hazelnut."),
                new Coke("Coke", 1.99, "Refreshing soda drink."),
                new Bread("Bread", 2.49, "Whole grain bread.")
        };

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println();
        }
    }
}