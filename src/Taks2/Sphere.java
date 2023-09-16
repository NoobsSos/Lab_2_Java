package Taks2;

public class Sphere extends FiguresInSpace {
    private double radius;

    public Sphere(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }

        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return 4. / 3 * Math.PI * Math.pow(radius, 3);
    }
}
