package ent1.ejb.e5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class CustomerTest {

    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer(1, "John Doe", 'm');
    }

    @Test
    void testConstructor() {
        assertEquals(1, customer.getId());
        assertEquals("John Doe", customer.getName());
        assertEquals('m', customer.getGender());
    }

    @Test
    void testSetGenderValidMale() {
        customer.setGender('m');
        assertEquals('m', customer.getGender());
    }

    @Test
    void testSetGenderValidFemale() {
        customer.setGender('f');
        assertEquals('f', customer.getGender());
    }

    @Test
    void testSetGenderInvalidValue() {
        customer.setGender('x');
        assertEquals('f', customer.getGender()); // Por el comportamiento del método
    }

    @Test
    void testToString() {
        assertEquals("John Doe(1)", customer.toString());
    }
}
