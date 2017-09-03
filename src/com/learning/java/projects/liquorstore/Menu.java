package com.learning.java.projects.liquorstore;


public class Menu {

    private Product[] products;

    public Menu(int numberOfProducts) {
        products = new Product[numberOfProducts];
    }

    public void setMenuOptionToProduct(int menuOption, Product product) {
        products[menuOption - 1] = product;
    }

    public Product getProductForMenuOption(int menuOption) {
        return products[menuOption - 1];
    }

    public void printMenu() {
        for (int menuOption = 1; menuOption <= products.length; menuOption++) {
            Product product = products[menuOption - 1];
            System.out.println("\t" + menuOption + ". " + product.getTitle() + " - $" + product.getPrice());
        }
    }

}
