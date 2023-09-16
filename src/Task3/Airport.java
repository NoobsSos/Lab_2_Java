package Task3;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private String id;
    List<Plane> planeList = new ArrayList<>();

    public Airport(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addPlane(Plane plane) {
        planeList.add(plane);
    }
}
