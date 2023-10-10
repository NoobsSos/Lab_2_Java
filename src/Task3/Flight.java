package Task3;

import java.time.LocalDateTime;
import java.util.UUID;

public class Flight {
    private String id;
    private Plane plane;
    private Airport departureAirport;
    private Airport arrivalAirport;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private int flightTime;
    private int ticketPrice;


    public Flight(String id, Airport departureAirport, Airport arrivalAirport, LocalDateTime departureTime, LocalDateTime arrivalTime, int ticketPrice, Plane plane) {
        this.id = id;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.ticketPrice = ticketPrice;
        this.plane = plane;
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

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public int getFlightTime() {
        return flightTime;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public int getTotalTicketPrice() {
        return ticketPrice * this.plane.tickets.size();
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

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
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

    public void addTicket(Ticket ticket) {
        if (ticket.flight != this) {
            System.out.println("Wrong flight, you should choose " + ticket.flight.id + " flight, but not " + this.getId() + " flight");
            return;
        }

        if (this.plane.tickets.size() < this.plane.getNumberOfPassengers()) {
            this.plane.tickets.add(ticket);
        } else {
            System.out.println("No free seats");
        }
    }

    public void cancelTicket(UUID passengerId) {
        this.plane.tickets.removeIf(p -> p.getPassengerId() == passengerId);
    }

    public void removePlane() {
        this.plane = null;
    }

    public void changePlane(Plane plane) {
        this.plane = plane;
    }
}
