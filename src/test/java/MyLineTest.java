import ent1.ejb.e7.MyLine;
import ent1.ejb.e7.MyPoint;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyLineTest {

    private MyPoint begin;
    private MyPoint end;
    private MyLine line;

    @BeforeEach
    void setUp() {
        begin = new MyPoint(1, 2);
        end = new MyPoint(4, 6);
        line = new MyLine(begin, end);
    }

    @Test
    void testConstructorWithPoints() {
        assertEquals(begin, line.getBegin());
        assertEquals(end, line.getEnd());
    }

    @Test
    void testConstructorWithCoordinates() {
        MyLine lineWithCoordinates = new MyLine(1, 2, 4, 6);
        assertEquals(1, lineWithCoordinates.getBeginX());
        assertEquals(2, lineWithCoordinates.getBeginY());
        assertEquals(4, lineWithCoordinates.getEndX());
        assertEquals(6, lineWithCoordinates.getEndY());
    }
    @Test
    void setBeginXY() {
        line.setBeginXY(5, 6);
        assertEquals(5, line.getBeginX());
        assertEquals(6, line.getBeginY());
    }
    @Test
    void setEndXY() {
        line.setEndXY(5, 6);
        assertEquals(5, line.getEndX());
        assertEquals(6, line.getEndY());
    }

    @Test
    void testGetBeginXY() {
        int[] expected = {1, 2};
        assertArrayEquals(expected, line.getBeginXY());
    }

    @Test
    void testGetEndXY() {
        int[] expected = {4, 6};
        assertArrayEquals(expected, line.getEndXY());
    }

    @Test
    void testSetBegin() {
        MyPoint newBegin = new MyPoint(0, 0);
        line.setBegin(newBegin);
        assertEquals(newBegin, line.getBegin());
    }

    @Test
    void testSetEnd() {
        MyPoint newEnd = new MyPoint(5, 5);
        line.setEnd(newEnd);
        assertEquals(newEnd, line.getEnd());
    }

    @Test
    void testSetBeginX() {
        line.setBeginX(0);
        assertEquals(0, line.getBeginX());
    }

    @Test
    void testSetBeginY() {
        line.setBeginY(0);
        assertEquals(0, line.getBeginY());
    }

    @Test
    void testSetEndX() {
        line.setEndX(5);
        assertEquals(5, line.getEndX());
    }

    @Test
    void testSetEndY() {
        line.setEndY(5);
        assertEquals(5, line.getEndY());
    }

    @Test
    void testGetLength() {
        assertEquals(5.0, line.getLength(), 0.0001);  // Distance between (1,2) and (4,6)
    }

    @Test
    void testGetGradient() {
        assertEquals(Math.atan2(4, 3), line.getGradient(), 0.0001);  // Gradient calculation
    }

    @Test
    void testToString() {
        assertEquals("MyLine [begin=(1,2), end=(4,6)]", line.toString());
    }
}
