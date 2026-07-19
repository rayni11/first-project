/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION02;

/**
 *
 * @author Raini
 */
public class ProductBill {
    
    private String priceText;
    private String quantityText;

    public ProductBill(String priceText, String quantityText) {
        this.priceText = priceText;
        this.quantityText = quantityText;
    }

    public double calculateTotal() {
        // no exception handling here - this is done in the test class
        double price = Double.parseDouble(priceText);
        int quantity = Integer.parseInt(quantityText);
        return price * quantity;
    }
}
    

