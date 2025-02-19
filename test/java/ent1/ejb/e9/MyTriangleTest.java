package ent1.ejb.e9;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MyTriangleTest {

    private MyTriangle triangle;

    @BeforeEach
    void setUp() {
        triangle = new MyTriangle(0.0, 0.0, 3.0, 0.0, 3.0, 4.0);
    }

    @Test
    void testConstructorWithCoordinates() {
        assertEquals(0.0, triangle.getV1().getX());
        assertEquals(0.0, triangle.getV1().getY());
        assertEquals(3.0, triangle.getV2().getX());
        assertEquals(0.0, triangle.getV2().getY());
        assertEquals(3.0, triangle.getV3().getX());
        assertEquals(4.0, triangle.getV3().getY());
    }

    @Test
    void testConstructorWithPoints() {
        MyPoint p1 = new MyPoint(1.0, 1.0);
        MyPoint p2 = new MyPoint(4.0, 1.0);
        MyPoint p3 = new MyPoint(4.0, 5.0);
        MyTriangle triangleWithPoints = new MyTriangle(p1, p2, p3);

        assertEquals(p1, triangleWithPoints.getV1());
        assertEquals(p2, triangleWithPoints.getV2());
        assertEquals(p3, triangleWithPoints.getV3());
    }

    @Test
    void testToString() {
        assertEquals("MyTriangle[v1=(0.0,0.0),v2=(3.0,0.0),v3=(3.0,4.0)]", triangle.toString());
    }

    @Test
    void testGetPerimeter() {
        // Perimeter = 3.0 + 4.0 + 5.0 = 12.0
        assertEquals(12.0, triangle.getPerimeter(), 0.0001);
    }

    @Test
    void testGetTypeEquilateral() {
        MyTriangle equilateralTriangle = new MyTriangle(0.0, 0.0, 1.0, 0.0, 0.5, 0.86602540378);
        assertEquals("Equilateral", equilateralTriangle.getType());
    }

    @Test
    void testGetTypeIsosceles() {
        MyTriangle isoscelesTriangle = new MyTriangle(0.0, 0.0, 4.0, 0.0, 2.0, 2.0);
        assertEquals("Isosceles", isoscelesTriangle.getType());
    }

    @Test
    void testGetTypeScalene() {
        MyTriangle scaleneTriangle = new MyTriangle(0.0, 0.0, 4.0, 0.0, 0.0, 8.0);
        assertEquals("Scalene", scaleneTriangle.getType());
    }
}
