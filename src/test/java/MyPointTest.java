import ent1.ejb.e6.MyPoint;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyPointTest {

    private MyPoint point;

    @BeforeEach
    void setUp() {
        point = new MyPoint(3, 4);
    }

    @Test
    void testDefaultConstructor() {
        MyPoint defaultPoint = new MyPoint();
        assertEquals(0, defaultPoint.getX());
        assertEquals(0, defaultPoint.getY());
    }

    @Test
    void testConstructorWithCoordinates() {
        assertEquals(3, point.getX());
        assertEquals(4, point.getY());
    }

    @Test
    void testGetXY() {
        int[] expected = {3, 4};
        assertArrayEquals(expected, point.getXY());
    }

    @Test
    void testSetX() {
        point.setX(5);
        assertEquals(5, point.getX());
    }

    @Test
    void testSetY() {
        point.setY(6);
        assertEquals(6, point.getY());
    }

    @Test
    void testSetXY() {
        point.setXY(7, 8);
        assertEquals(7, point.getX());
        assertEquals(8, point.getY());
    }

    @Test
    void testToString() {
        assertEquals("(3,4)", point.toString());
    }

    @Test
    void testDistanceWithCoordinates() {
        double result = point.distance(0, 0);
        assertEquals(5.0, result, 0.0001); // Distance from (3,4) to (0,0)
    }

    @Test
    void testDistanceWithAnotherPoint() {
        MyPoint anotherPoint = new MyPoint(0, 0);
        double result = point.distance(anotherPoint);
        assertEquals(5.0, result, 0.0001); // Distance from (3,4) to (0,0)
    }

    @Test
    void testDistanceToOrigin() {
        double result = point.distance();
        assertEquals(5.0, result, 0.0001); // Distance from (3,4) to (0,0)
    }
}
