import java.util.Scanner;

class Product {
    // Data members
    private String productID;
    private String name;
    private int quantity;
    private double unitPrice;

    // Method to set product details
    public void setProductDetails(String productID, String name, int quantity, double unitPrice) {
        this.productID = productID;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    // Method to update the quantity
    public void updateQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    // Method to calculate total value of the product (quantity * unit price)
    public double calculateTotalValue() {
        return quantity * unitPrice;
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Total Value: $" + calculateTotalValue());
    }
}

public class InventoryTrackingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Product object
        Product product = new Product();

        // Input product details
        System.out.print("Enter Product ID: ");
        String productID = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter Unit Price: ");
        double unitPrice = scanner.nextDouble();

        // Set product details
        product.setProductDetails(productID, name, quantity, unitPrice);

        // Display product details and total value
        System.out.println("\n--- Product Details ---");
        product.displayProductDetails();

        // Update quantity
        System.out.print("\nEnter new quantity to update: ");
        int newQuantity = scanner.nextInt();
        product.updateQuantity(newQuantity);

        // Display updated product details and total value
        System.out.println("\n--- Updated Product Details ---");
        product.displayProductDetails();

        scanner.close();
    }
}
