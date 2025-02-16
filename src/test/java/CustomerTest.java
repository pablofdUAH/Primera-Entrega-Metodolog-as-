import ent1.ejb.e4.Customer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer(1, "Alice", 20);
    }

    @Test
    void testGetId() {
        assertEquals(1, customer.getId());
    }

    @Test
    void testGetName() {
        assertEquals("Alice", customer.getName());
    }

    @Test
    void testGetDiscount() {
        assertEquals(20, customer.getDiscount());
    }

    @Test
    void testSetDiscountValid() {
        customer.setDiscount(30);
        assertEquals(30, customer.getDiscount());
    }

    @Test
    void testSetDiscountInvalid() {
        customer.setDiscount(-10);
        assertEquals(0, customer.getDiscount());
    }

    @Test
    void testToString() {
        assertEquals("Alice(1)(20%)", customer.toString());
    }
}
