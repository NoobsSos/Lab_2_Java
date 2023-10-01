package Task3;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Airport airport = new Airport("Borispol");
        Plane plane = new Plane("Boeing", 100);
        airport.addPlane(plane);
        Passager passager = new Passager("Ivan", "Ivanov", 25);
        Ticket ticket = new Ticket(passager.getPassengerId());
        Calendar departureTime = Calendar.getInstance();
        departureTime.set(2021, Calendar.JANUARY, 1);
        Calendar arrivalTime = Calendar.getInstance();
        arrivalTime.set(2021, Calendar.JANUARY, 2);
        Calendar nextTime = Calendar.getInstance();
        nextTime.set(2021, Calendar.JANUARY, 3);
        Flight flight = new Flight("1", airport, airport, departureTime, arrivalTime, 100, null, null);
        ticket = ticket.addTicket(passager, flight);
        ScheduleOfFlights scheduleOfFlights = new ScheduleOfFlights();
        scheduleOfFlights.addFlight(flight);
        scheduleOfFlights.profitPerDateFromTo(airport, departureTime, nextTime);

        System.out.println("Passenger " + passager.getName() + " " + passager.getSurname() + " with id " + passager.getPassengerId() + " bought ticket with id " + ticket.getPassengerId() + " on plane " + plane.getModel() + " with " + plane.getNumberOfPassengers() + " seats");
    }
}
