package com.learning.java.projects.liquorstore;

public class CashRegister {

    private float subtotal;

    public CashRegister() {
        subtotal = 0f;
    }

    public void addToOrder(int quantity, float unitPrice) {
        subtotal += quantity * unitPrice;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public float calculateTotalWithTax() {
        // Calculate total
        float total = subtotal * 1.075f;

        // Reset subtotal for next order
        subtotal = 0f;

        return total;
    }

}
