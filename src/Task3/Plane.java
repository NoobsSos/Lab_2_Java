package Task3;

public class Plane {
    private int numberOfPassengers;
    private String model;

    public Plane(String model, int numberOfPassengers) {
        this.model = model;
        this.numberOfPassengers = numberOfPassengers;
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
}
