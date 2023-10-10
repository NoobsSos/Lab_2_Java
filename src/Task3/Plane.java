package Task3;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private int numberOfPassengers;
    private String model;
    List<Ticket> tickets;

    public Plane(String model, int numberOfPassengers) {
        this.model = model;
        this.numberOfPassengers = numberOfPassengers;
        this.tickets = new ArrayList<>();
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public String getModel() {
        return model;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

//    public void addTicket(Ticket ticket) {
//        tickets.add(ticket);
//    }
}
