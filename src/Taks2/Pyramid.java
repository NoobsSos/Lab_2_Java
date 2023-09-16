package Taks2;

public class Pyramid extends FiguresInSpace {
    private Triangle base;
    private double height;

    public Pyramid(double sideA, double sideB, double sideC, double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }

        this.base = new Triangle(sideA, sideB, sideC);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return (height * base.getArea()) / 3;
    }
}
