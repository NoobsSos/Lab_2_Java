package Task3;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Create airport
        Airport airport = new Airport("Lviv");
        Airport airport1 = new Airport("Kyiv");

        // Create plane
        Plane plane = new Plane("Boeing", 100);
        Plane plane1 = new Plane("Dream", 200);

        // Create passenger
        Passager passager = new Passager("Ivan", "Ivanov", 25);
        Passager passager1 = new Passager("Petr", "Petrov", 30);


        // Create dates
        LocalDateTime departureTime = LocalDateTime.of(2023, 1, 2, 12, 0);
        LocalDateTime arrivalTime = LocalDateTime.of(2023, 1, 3, 13, 0);
        LocalDateTime dayBefore = LocalDateTime.of(2023, 1, 1, 0, 0);
        LocalDateTime nextDay = LocalDateTime.of(2023, 1, 4, 0, 0);

        // Create flight
        Flight flight = new Flight("1", airport, airport1, departureTime, arrivalTime, 100, plane);
        Flight flight1 = new Flight("2", airport1, airport, departureTime, arrivalTime, 200, plane1);

        // Buy tickets
        Ticket ticket = new Ticket(passager.getPassengerId(), flight);
        Ticket ticket1 = new Ticket(passager1.getPassengerId(), flight1);


        // Boarding an airplane
        flight.addTicket(ticket); // 100
        flight.addTicket(ticket1); // 100
        flight1.addTicket(ticket); // 200
        flight1.addTicket(ticket1); // 200

        // Cancel ticket
        flight1.cancelTicket(passager1.getPassengerId());

        // Add flight to schedule
        ScheduleOfFlights scheduleOfFlights = new ScheduleOfFlights();
        scheduleOfFlights.addFlight(flight);
        scheduleOfFlights.addFlight(flight1);

        // Print schedule
        scheduleOfFlights.printSchedule();

        // Print profit
        scheduleOfFlights.profitPerDateFromTo(dayBefore, nextDay);


        System.out.println("Passenger " + passager.getName() + " " + passager.getSurname() + " with id " + passager.getPassengerId() + " bought ticket with id " + ticket.getPassengerId() + " on plane " + plane.getModel() + " with " + plane.getNumberOfPassengers() + " seats");
    }
}
