package ent1.ejb.e9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyPointTest {

    @Test
    void testConstructorDefault() {
        MyPoint point = new MyPoint();
        assertEquals(0.0, point.getX());
        assertEquals(0.0, point.getY());
    }

    @Test
    void testConstructorWithParameters() {
        MyPoint point = new MyPoint(3.5, 4.5);
        assertEquals(3.5, point.getX());
        assertEquals(4.5, point.getY());
    }

    @Test
    void testSettersAndGetters() {
        MyPoint point = new MyPoint();
        point.setX(5.0);
        point.setY(6.0);
        assertEquals(5.0, point.getX());
        assertEquals(6.0, point.getY());
    }
    @Test
    void testGetXY(){
        MyPoint point = new MyPoint();
        point.setX(5.0);
        point.setY(6.0);
        assertArrayEquals(point.getXY(), new double[]{5.0,6.0});
    }

    @Test
    void testSetXY() {
        MyPoint point = new MyPoint();
        point.setXY(7.0, 8.0);
        assertEquals(7.0, point.getX());
        assertEquals(8.0, point.getY());
    }

    @Test
    void testDistanceWithCoordinates() {
        MyPoint point1 = new MyPoint(1.0, 2.0);
        double distance = point1.distance(4.0, 6.0);
        assertEquals(5.0, distance, 0.0001); // Expected distance is 5 (Pythagorean theorem)
    }

    @Test
    void testDistanceWithMyPoint() {
        MyPoint point1 = new MyPoint(1.0, 2.0);
        MyPoint point2 = new MyPoint(4.0, 6.0);
        double distance = point1.distance(point2);
        assertEquals(5.0, distance, 0.0001); // Expected distance is 5 (Pythagorean theorem)
    }

    @Test
    void testDistanceToOrigin() {
        MyPoint point = new MyPoint(3.0, 4.0);
        double distance = point.distance();
        assertEquals(5.0, distance, 0.0001); // Expected distance to origin is 5
    }

    @Test
    void testToString() {
        MyPoint point = new MyPoint(2.0, 3.0);
        assertEquals("(2.0,3.0)", point.toString());
    }
}