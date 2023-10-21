package Task3;

import java.util.ArrayList;
import java.util.List;

public class OwnerOfAirport {
    private String id;

    List<Airport> airports;

    public OwnerOfAirport(String id) {
        this.id = id;
        airports = new ArrayList<>();
    }

    public void addAirport(Airport airport) {
        airports.add(airport);
    }

    public List<Airport> getAirports() {
        return airports;
    }
    public void deleteAirport(Airport airport) {
        airports.remove(airport);
    }

    public String getId() {
        return id;
    }
}
