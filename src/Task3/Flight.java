package Task3;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

public class Flight {
    private String id;
    private Plane plane;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private Calendar departureTime;
    private Calendar arrivalTime;
    private int flightTime;
    private int ticketPrice;
    public final List<Ticket> tickets;
    public final List<Passager> passengers;


    public Flight(String id, Airport departureAirport, Airport arrivalAirport, Calendar departureTime, Calendar arrivalTime, int flightTime, int ticketPrice, List<Ticket> tickets, List<Passager> passengers) {
        this.id = id;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.flightTime = flightTime;
        this.ticketPrice = ticketPrice;
        this.tickets = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public Calendar getDepartureTime() {
        return departureTime;
    }

    public Calendar getArrivalTime() {
        return arrivalTime;
    }

    public int getFlightTime() {
        return flightTime;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public void setDepartureTime(Calendar departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(Calendar arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setFlightTime(int flightTime) {
        this.flightTime = flightTime;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    public void editPlane(String model, int capacity) {
        plane.setModel(model);
        plane.setNumberOfPassengers(capacity);
    }

    public void cancelTicket(int number) {
        UUID passengerId = tickets.get(number).getPassengerId();
        passengers.removeIf(p -> p.getPassengerId() == passengerId);
    }

}
