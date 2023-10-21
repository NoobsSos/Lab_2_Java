package Task3;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private String location;

    public Airport(String location) {
        this.location = location;
    }

    public String getId() {
        return location;
    }

    public void setId(String location) {
        this.location = location;
    }
}
