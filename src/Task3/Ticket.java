package Task3;

import java.util.UUID;

public class Ticket {
    private UUID passengerId;
    Flight flight;
    public Ticket(UUID passengerId, Flight flight) {
        this.passengerId = passengerId;
        this.flight = flight;
    }

    public UUID getPassengerId() {
        return passengerId;
    }

}
