import java.time.LocalDateTime;
import java.time.Duration;

public class Airplane {
    
    private String flightNumber;
    private String destination;
    private LocalDateTime departureTime;

   
    public Airplane(String flightNumber, String destination, LocalDateTime departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

   
    public String getFlightNumber() {
        return flightNumber;
    }

    
    public String getDestination() {
        return destination;
    }

    
    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    
    public String checkFlightStatus() {
        LocalDateTime now = LocalDateTime.now();
        if (now.isBefore(departureTime)) {
            Duration duration = Duration.between(now, departureTime);
            return "Flight " + flightNumber + " to " + destination + " is scheduled to depart in " + 
                   duration.toMinutes() + " minutes.";
        } else {
            return "Flight " + flightNumber + " to " + destination + " has already departed.";
        }
    }

    
    public String checkDelay() {
        LocalDateTime now = LocalDateTime.now();
        if (now.isAfter(departureTime)) {
            Duration delay = Duration.between(departureTime, now);
            return "Flight " + flightNumber + " to " + destination + " is delayed by " +
                   delay.toMinutes() + " minutes.";
        } else {
            return "Flight " + flightNumber + " to " + destination + " is not delayed.";
        }
    }

    
    public static void main(String[] args) {
       
        Airplane airplane1 = new Airplane("AA123", "New York", LocalDateTime.of(2024, 8, 5, 15, 0));
        
        Airplane airplane2 = new Airplane("BB456", "Los Angeles", LocalDateTime.of(2024, 8, 5, 18, 0));

        System.out.println(airplane1.checkFlightStatus());
        System.out.println(airplane1.checkDelay());

        System.out.println(airplane2.checkFlightStatus());
        System.out.println(airplane2.checkDelay());
    }
}
