import java.util.ArrayList;

// Class to represent a Flight
class Flight {
    private String flightNumber, destination, departureTime, arrivalTime;

    // Constructor to initialize flight details
    public Flight(String flightNumber, String destination, String departureTime, String arrivalTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    // Method to update the departure time of the flight
    public void updateDepartureTime(String newTime) { 
        this.departureTime = newTime; 
    }

    // Getter method for flight number
    public String getFlightNumber() { 
        return flightNumber; 
    }

    // Method to check if the flight is upcoming based on current time
    public boolean isUpcoming() { 
        return departureTime.compareTo(java.time.LocalTime.now().toString()) > 0; 
    }

    // Method to display flight details
    public void display() {
        System.out.println("Flight: " + flightNumber + ", To: " + destination +
                ", Departure: " + departureTime + ", Arrival: " + arrivalTime);
    }
}

// Class to represent an Airport
class Airport {
    private ArrayList<Flight> flights = new ArrayList<>(); // List to store flights

    // Method to add a flight to the airport
    public void addFlight(Flight flight) { 
        flights.add(flight); 
    }

    // Method to remove a flight from the airport by flight number
    public void removeFlight(String flightNumber) { 
        flights.removeIf(f -> f.getFlightNumber().equals(flightNumber)); 
    }

    // Method to display flights based on their status (upcoming or completed)
    public void displayFlights(boolean upcoming) {
        flights.stream()
               .filter(f -> f.isUpcoming() == upcoming) // Filter based on flight status
               .forEach(Flight::display); // Display each filtered flight
    }

    // Method to display all flights at the airport
    public void displayAllFlights() { 
        flights.forEach(Flight::display); 
    }
}

// Main class to run the Airport Management System
public class AirportManagement {
    public static void main(String[] args) {
        Airport airport = new Airport(); // Create an Airport instance

        // Add flights to the airport
        airport.addFlight(new Flight("D961", "LOS ANGELES", "03:00", "14:00"));
        airport.addFlight(new Flight("B246", "RUSSIA", "19:00", "04:00"));

        // Display all flights
        System.out.println("All Flights:");
        airport.displayAllFlights();

        // Display upcoming flights
        System.out.println("\nUpcoming Flights:");
        airport.displayFlights(true);

        // Remove a specific flight
        airport.removeFlight("A123");
        System.out.println("\nAfter removing flight A123:");
        airport.displayAllFlights(); // Display all flights after removal
    }
}
