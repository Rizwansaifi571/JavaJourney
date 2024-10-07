import java.util.Scanner;

class CartItem {
    // Data members
    private String productID;
    private String productName;
    private double price;
    private int quantity;

    // Method to set item details
    public void setItemDetails(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate the subtotal for the item
    public double calculateSubtotal() {
        return price * quantity;
    }

    // Method to apply a discount if subtotal exceeds a certain amount
    public double applyDiscount(double discountPercentage) {
        double subtotal = calculateSubtotal();
        if (subtotal > 100) { // Example: Apply discount for purchases over $100
            subtotal = subtotal - (subtotal * discountPercentage / 100);
        }
        return subtotal;
    }

    // Method to display the item details
    public void displayItemDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: $" + calculateSubtotal());
    }
}

public class OnlineShoppingCartSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create CartItem object
        CartItem item = new CartItem();

        // Input item details
        System.out.print("Enter Product ID: ");
        String productID = scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        // Set item details
        item.setItemDetails(productID, productName, price, quantity);

        // Display the item details
        item.displayItemDetails();

        // Apply discount if applicable
        System.out.print("\nEnter discount percentage (if any): ");
        double discountPercentage = scanner.nextDouble();
        double finalTotal = item.applyDiscount(discountPercentage);

        System.out.println("\nFinal Total after discount: $" + finalTotal);

        scanner.close();
    }
}
