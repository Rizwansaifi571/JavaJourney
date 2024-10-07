import java.util.Scanner;

class MenuItem {
    // Data members
    private String itemID;
    private String name;
    private double price;
    private String description;

    // Method to set item details
    public void setItemDetails(String itemID, String name, double price, String description) {
        this.itemID = itemID;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item ID: " + itemID);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Description: " + description);
    }

    // Method to update price
    public void updatePrice(double newPrice) {
        this.price = newPrice;
        System.out.println("Price of " + name + " updated to $" + price);
    }
}

public class RestaurantOrderingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create multiple menu items
        MenuItem item1 = new MenuItem();
        MenuItem item2 = new MenuItem();

        // Set details for first menu item
        System.out.print("Enter Item 1 ID: ");
        String itemID1 = scanner.nextLine();
        System.out.print("Enter Item 1 Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter Item 1 Price: ");
        double price1 = scanner.nextDouble();
        scanner.nextLine();  // Clear the buffer
        System.out.print("Enter Item 1 Description: ");
        String description1 = scanner.nextLine();
        item1.setItemDetails(itemID1, name1, price1, description1);

        // Set details for second menu item
        System.out.print("\nEnter Item 2 ID: ");
        String itemID2 = scanner.nextLine();
        System.out.print("Enter Item 2 Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter Item 2 Price: ");
        double price2 = scanner.nextDouble();
        scanner.nextLine();  // Clear the buffer
        System.out.print("Enter Item 2 Description: ");
        String description2 = scanner.nextLine();
        item2.setItemDetails(itemID2, name2, price2, description2);

        // Display menu items
        System.out.println("\n--- Restaurant Menu ---");
        item1.displayItemDetails();
        System.out.println();
        item2.displayItemDetails();

        // Option to update prices
        System.out.print("\nDo you want to update the price of any item? (yes/no): ");
        String updateOption = scanner.nextLine();
        if (updateOption.equalsIgnoreCase("yes")) {
            System.out.print("Enter the Item ID to update the price: ");
            String updateItemID = scanner.nextLine();
            if (updateItemID.equals(itemID1)) {
                System.out.print("Enter new price for " + name1 + ": ");
                double newPrice1 = scanner.nextDouble();
                item1.updatePrice(newPrice1);
            } else if (updateItemID.equals(itemID2)) {
                System.out.print("Enter new price for " + name2 + ": ");
                double newPrice2 = scanner.nextDouble();
                item2.updatePrice(newPrice2);
            } else {
                System.out.println("Invalid Item ID.");
            }
        }

        scanner.close();
    }
}
