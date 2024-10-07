import java.util.Scanner;

class Room {
    // Data members
    private int roomNumber;
    private String type; // Room type like single, double
    private boolean isAvailable;
    private double ratePerNight;

    // Method to set room details
    public void setRoomDetails(int roomNumber, String type, boolean isAvailable, double ratePerNight) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.isAvailable = isAvailable;
        this.ratePerNight = ratePerNight;
    }

    // Method to display room details
    public void displayRoomDetails() {
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Type: " + type);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
        System.out.println("Rate per Night: $" + ratePerNight);
    }

    // Method to check availability
    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to book a room
    public void bookRoom(int nights) {
        if (isAvailable) {
            double totalCharge = calculateCharges(nights);
            System.out.println("Room booked successfully for " + nights + " night(s).");
            System.out.println("Total Charges: $" + totalCharge);
            isAvailable = false; // Room is no longer available after booking
        } else {
            System.out.println("Room is not available for booking.");
        }
    }

    // Method to calculate charges based on the number of nights
    public double calculateCharges(int nights) {
        return ratePerNight * nights;
    }
}

public class HotelBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Room object
        Room room = new Room();

        // Input room details
        System.out.print("Enter Room Number: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Room Type (single/double): ");
        String type = scanner.nextLine();
        System.out.print("Is the room available (true/false): ");
        boolean isAvailable = scanner.nextBoolean();
        System.out.print("Enter Rate per Night: ");
        double ratePerNight = scanner.nextDouble();

        // Set room details
        room.setRoomDetails(roomNumber, type, isAvailable, ratePerNight);

        // Display room details
        System.out.println("\n--- Room Details ---");
        room.displayRoomDetails();

        // Booking room
        if (room.isAvailable()) {
            System.out.print("\nEnter number of nights to book: ");
            int nights = scanner.nextInt();
            room.bookRoom(nights);
        } else {
            System.out.println("Sorry, the room is not available for booking.");
        }

        scanner.close();
    }
}
