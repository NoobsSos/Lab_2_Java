package Task3;

import java.util.List;
import java.util.UUID;

public class Passager {
    public final List<Ticket> tickets;
    private UUID passengerId;
    private String name;
    private String surname;
    private int age;

    public Passager(String name, String surname, int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
        this.passengerId = UUID.randomUUID();
        this.name = name;
        this.surname = surname;
        this.age = age;
        tickets = null;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be greater than 0");
        }
        this.age = age;
    }

    public UUID getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(UUID passengerId) {
        this.passengerId = passengerId;
    }

    public void addTicket(Ticket ticket) {
        assert tickets != null;
        tickets.add(ticket);
    }
}
