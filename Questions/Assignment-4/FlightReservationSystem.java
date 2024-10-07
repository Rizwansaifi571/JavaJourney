import java.util.Scanner;

class Flight {
    // Data members
    private String flightNumber;
    private String destination;
    private String departureTime;
    private int seatAvailability;

    // Method to set flight details
    public void setFlightDetails(String flightNumber, String destination, String departureTime, int seatAvailability) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.seatAvailability = seatAvailability;
    }

    // Method to display flight details
    public void displayFlightDetails() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Seats Available: " + seatAvailability);
    }

    // Method to book seats if available
    public void bookSeats(int seatsToBook) {
        if (seatsToBook <= seatAvailability) {
            seatAvailability -= seatsToBook;
            System.out.println(seatsToBook + " seat(s) booked successfully.");
            System.out.println("Remaining Seats: " + seatAvailability);
        } else {
            System.out.println("Not enough seats available. Only " + seatAvailability + " seat(s) left.");
        }
    }

    // Method to check seat availability
    public int checkSeatAvailability() {
        return seatAvailability;
    }
}

public class FlightReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Flight object
        Flight flight = new Flight();

        // Input flight details
        System.out.print("Enter Flight Number: ");
        String flightNumber = scanner.nextLine();
        System.out.print("Enter Destination: ");
        String destination = scanner.nextLine();
        System.out.print("Enter Departure Time: ");
        String departureTime = scanner.nextLine();
        System.out.print("Enter Seat Availability: ");
        int seatAvailability = scanner.nextInt();

        // Set flight details
        flight.setFlightDetails(flightNumber, destination, departureTime, seatAvailability);

        // Display flight details
        System.out.println("\n--- Flight Details ---");
        flight.displayFlightDetails();

        // Booking seats
        System.out.print("\nEnter the number of seats to book: ");
        int seatsToBook = scanner.nextInt();
        flight.bookSeats(seatsToBook);

        // Check remaining seats
        System.out.println("\nRemaining Seats after booking: " + flight.checkSeatAvailability());

        scanner.close();
    }
}
