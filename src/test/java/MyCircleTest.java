import ent1.ejb.e8.MyCircle;
import ent1.ejb.e6.MyPoint;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyCircleTest {

    private MyCircle circle;

    @BeforeEach
    void setUp() {
        circle = new MyCircle(0, 0, 5);
    }

    @Test
    void testDefaultConstructor() {
        MyCircle defaultCircle = new MyCircle();
        assertEquals(1, defaultCircle.getRadius());
        assertEquals(0, defaultCircle.getCenterX());
        assertEquals(0, defaultCircle.getCenterY());
    }

    @Test
    void testConstructorWithCoordinatesAndRadius() {
        assertEquals(5, circle.getRadius());
        assertEquals(0, circle.getCenterX());
        assertEquals(0, circle.getCenterY());
    }

    @Test
    void testGetCenterXY() {
        int[] expected = {0, 0};
        assertArrayEquals(expected, circle.getCenterXY());
    }

    @Test
    void testSetRadius() {
        circle.setRadius(10);
        assertEquals(10, circle.getRadius());

        circle.setRadius(-5);
        assertEquals(0, circle.getRadius());
    }

    @Test
    void testSetCenter() {
        MyPoint newCenter = new MyPoint(3, 3);
        circle.setCenter(newCenter);
        assertEquals(newCenter, circle.getCenter());
    }

    @Test
    void testSetCenterX() {
        circle.setCenterX(5);
        assertEquals(5, circle.getCenterX());
    }

    @Test
    void testSetCenterY() {
        circle.setCenterY(5);
        assertEquals(5, circle.getCenterY());
    }

    @Test
    void testSetCenterXY() {
        circle.setCenterXY(6, 6);
        assertEquals(6, circle.getCenterX());
        assertEquals(6, circle.getCenterY());
    }

    @Test
    void testToString() {
        assertEquals("MyCircle[radius=5,center=(0,0)]", circle.toString());
    }

    @Test
    void testGetArea() {
        assertEquals(Math.PI * 25, circle.getArea(), 0.0001);
    }

    @Test
    void testGetCircumference() {
        assertEquals(2 * Math.PI * 5, circle.getCircumference(), 0.0001);
    }

    @Test
    void testDistance() {
        MyCircle anotherCircle = new MyCircle(3, 4, 5);
        assertEquals(5.0, circle.distance(anotherCircle), 0.0001);
    }
}
