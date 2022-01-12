package ca.nait.dmit.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void area() throws Exception {
        // Create a Circle object with  a radius of 1
        Circle circle1 = new Circle();
        // The radius of the circle should be 1
        assertEquals(1, circle1.getRadius());
        // The area of the circle should be 3.14
        assertEquals(3.14, circle1.area(), 0.005);
        assertEquals(Math.PI, circle1.area());

        // Change the radius to 10
        circle1.setRadius(5);
        //The radius of the circle should now be 5
        assertEquals(5, circle1.getRadius());
        // The area of the circle with a radius of 5 should be 78.54
        assertEquals(78.54, circle1.area(), 0.005);
    }

    @Test
    void circumference() {
    }
}