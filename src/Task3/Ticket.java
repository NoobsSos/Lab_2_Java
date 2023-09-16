package Task3;

import java.util.UUID;

public class Ticket {
    private UUID passengerId;

    public Ticket() {
        this.passengerId = UUID.randomUUID();
    }

    public UUID getPassengerId() {
        return passengerId;
    }
}
