package Taks2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FiguresInSpace> figuresInSpace = new ArrayList<>();
        figuresInSpace.add(new Sphere(5));
        figuresInSpace.add(new Cube(5));
        figuresInSpace.add(new Pyramid(2, 7, 6, 13));

        System.out.println("Figures in space:");

        for (FiguresInSpace figure : figuresInSpace) {
            System.out.println(figure.getVolume());
            System.out.println();
        }

        List<FiguresOnAPlane> figuresOnAPlane = new ArrayList<>();
        figuresOnAPlane.add(new Circle(5));
        figuresOnAPlane.add(new Rectangle(5, 7));
        figuresOnAPlane.add(new Triangle(5, 7, 6));
        figuresOnAPlane.add(new Square(5));

        System.out.println("Figures on a plane:");

        for (FiguresOnAPlane figure : figuresOnAPlane) {
            System.out.println(figure.getArea());
            System.out.println(figure.getPerimeter());
            System.out.println();
        }
    }
}
