import java.util.Scanner;

class Car {
    // Data members
    private String carID;
    private String model;
    private String type; // Car type like sedan, SUV
    private boolean isRented; // Rental status
    private double rentalRatePerDay;

    // Method to set car details
    public void setCarDetails(String carID, String model, String type, boolean isRented, double rentalRatePerDay) {
        this.carID = carID;
        this.model = model;
        this.type = type;
        this.isRented = isRented;
        this.rentalRatePerDay = rentalRatePerDay;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car ID: " + carID);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Rental Status: " + (isRented ? "Rented" : "Available"));
        System.out.println("Rental Rate per Day: $" + rentalRatePerDay);
    }

    // Method to check availability
    public boolean isAvailable() {
        return !isRented;
    }

    // Method to rent a car
    public void rentCar(int days) {
        if (isAvailable()) {
            double totalCharge = calculateRentalCharges(days);
            System.out.println("Car rented successfully for " + days + " day(s).");
            System.out.println("Total Rental Charges: $" + totalCharge);
            isRented = true; // Mark car as rented
        } else {
            System.out.println("Car is not available for rental.");
        }
    }

    // Method to calculate rental charges based on number of days
    public double calculateRentalCharges(int days) {
        return rentalRatePerDay * days;
    }

    // Method to return a rented car
    public void returnCar() {
        if (isRented) {
            System.out.println("Car returned successfully.");
            isRented = false;
        } else {
            System.out.println("This car is not rented.");
        }
    }
}

public class CarRentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Car object
        Car car = new Car();

        // Input car details
        System.out.print("Enter Car ID: ");
        String carID = scanner.nextLine();
        System.out.print("Enter Car Model: ");
        String model = scanner.nextLine();
        System.out.print("Enter Car Type (e.g., sedan, SUV): ");
        String type = scanner.nextLine();
        System.out.print("Is the car rented (true/false): ");
        boolean isRented = scanner.nextBoolean();
        System.out.print("Enter Rental Rate per Day: ");
        double rentalRatePerDay = scanner.nextDouble();

        // Set car details
        car.setCarDetails(carID, model, type, isRented, rentalRatePerDay);

        // Display car details
        System.out.println("\n--- Car Details ---");
        car.displayCarDetails();

        // Rent the car if available
        if (car.isAvailable()) {
            System.out.print("\nEnter number of days to rent: ");
            int days = scanner.nextInt();
            car.rentCar(days);
        } else {
            System.out.println("\nCar is already rented.");
        }

        // Return the car after rental
        System.out.print("\nDo you want to return the car? (yes/no): ");
        scanner.nextLine(); // Clear buffer
        String returnCar = scanner.nextLine();
        if (returnCar.equalsIgnoreCase("yes")) {
            car.returnCar();
        }

        scanner.close();
    }
}
