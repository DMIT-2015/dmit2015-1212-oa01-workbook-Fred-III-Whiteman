package ca.nait.dmit.domain;

/**
 * A simple class to model a circle
 *
 * @author Fred Whiteman
 * @version 2022.01.10
 */
public class Circle {
    /** The radius of the circle */
    private double radius =1;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Construct a circle with a radius of one (default constructor) */
    public Circle() {
        radius = 1;
    }

    /** Construct a circle with a specified radius (overload constructor) */
    public Circle(double radius) {
        this.radius = radius;
    }

    /** Calculate and return the area of the circle using the formula:
     *   area = PI * radius * radius
     *
     * @return The area of the circle
     */
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     *  Calculate and return the circumference of the circle using the formula:
     *  circumference = 2 * PI * radius
     *
     * @return The circumference of the circle
     */
    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
