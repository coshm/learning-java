package com.learning.java.projects.liquorstore;

import java.util.Scanner;

public class Store {

    public static void main(String[] args) {
        Product vodka = new Product("Tito's Handmade Vokda", 19.99f);
        Product rum = new Product("Captain Morgan's Spiced Rum", 18.99f);
        Product whisky = new Product("Maker's Mark Bourbon Whisky", 23.99f);
        Product gin = new Product("Hendricks Gin", 24.99f);
        Product tequila = new Product("Patron Silver", 47.99f);

        int numProducts = 5;
        Menu menu = new Menu(numProducts);
        menu.setMenuOptionToProduct(1, vodka);
        menu.setMenuOptionToProduct(2, rum);
        menu.setMenuOptionToProduct(3, whisky);
        menu.setMenuOptionToProduct(4, gin);
        menu.setMenuOptionToProduct(5, tequila);

        CashRegister cashRegister = new CashRegister();

        System.out.println("Welcome to The Liquor Store! Take a look at the menu below...");
        menu.printMenu();;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a number [1- " + numProducts + "] to select a product, " +
                    "\"S\" to view subtotal, \"C\" to checkout, or \"M\" to see the menu again.");

            String input = scanner.nextLine();
            int option = convertOptionToInt(input);
            if (option > -1) {
                // Get the chosen product
                Product product = menu.getProductForMenuOption(option);

                System.out.println("How many bottles of " + product.getTitle() + " do you want?");

                // Add the cost of the bottles to the order
                int quantity = scanner.nextInt();

                // When entering input for scanner.nextInt(), the "enter" or "new line" character
                //   is not consumed meaning the following scanner.nextLine() call will automatically
                //   consume and return the leftover new line character without allowing the user to
                //   input anything else. Here we are calling scanner.nextLine() to clear out that
                //   new line character to avoid unexpected results the next time we ask for user input.
                scanner.nextLine();

                cashRegister.addToOrder(quantity, product.getPrice());
            } else if ("S".equals(input)) {
                System.out.println("Your current subtotal is $" + cashRegister.getSubtotal());
            } else if ("C".equals(input)) {
                float orderTotal = cashRegister.calculateTotalWithTax();

                System.out.println("Your order total is $" + orderTotal + ". How much will you be paying?");
                float payment = scanner.nextFloat();

                processCheckout(orderTotal, payment);
                break;
            } else if ("M".equals(input)) {
                menu.printMenu();
            } else {
                System.out.println("Invalid option \"" + input + "\"");
            }
        }
    }

    public static void processCheckout(float orderTotal, float payment) {
        if (payment >= orderTotal) {
            float change = payment - orderTotal;
            System.out.println("Your change is $" + change);
        } else {
            float amountShort = orderTotal - payment;
            System.out.println("You're short $" + amountShort + ". Get the fuck out.");
        }
    }

    public static int convertOptionToInt(String string) {
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException e) {
            // Since -1 is not a valid option, we'll use it
            //   here to signify the option could not be converted.
            return -1;
        }
    }

}
