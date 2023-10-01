package Task3;

import java.util.UUID;

public class Ticket {
    private UUID passengerId;

    public Ticket(UUID passengerId) {
        this.passengerId = passengerId;
    }

    public UUID getPassengerId() {
        return passengerId;
    }

    public Ticket addTicket(Ticket ticket, Passager passager, Flight flight) {
        passager.addTicket(ticket);
        flight.addTicket(ticket);
        return ticket;
    }
}
