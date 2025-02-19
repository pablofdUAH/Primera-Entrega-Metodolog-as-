package ent1.ejb.e4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvoiceTest {

    private Customer customer;
    private Invoice invoice;

    @BeforeEach
    void setUp() {
        customer = new Customer(1, "Alice", 20);
        invoice = new Invoice(101, customer, 200.0);
    }

    @Test
    void testGetId() {
        assertEquals(101, invoice.getId());
    }

    @Test
    void testGetCustomer() {
        assertEquals(customer, invoice.getCustomer());
    }

    @Test
    void testGetAmount() {
        assertEquals(200.0, invoice.getAmount());
    }

    @Test
    void testGetCustomerId() {
        assertEquals(1, invoice.getCustomerId());
    }

    @Test
    void testGetCustomerName() {
        assertEquals("Alice", invoice.getCustomerName());
    }

    @Test
    void testGetCustomerDiscount() {
        assertEquals(20, invoice.getCustomerDiscount());
    }

    @Test
    void testGetAmountAfterDiscount() {
        assertEquals(160.0, invoice.getAmountAfterDiscount(), 0.01);
    }

    @Test
    void testSetAmountValid() {
        invoice.setAmount(300.0);
        assertEquals(300.0, invoice.getAmount());
    }

    @Test
    void testSetAmountInvalid() {
        invoice.setAmount(-50.0);
        assertEquals(0.0, invoice.getAmount());
    }

    @Test
    void testToString() {
        assertEquals("Invoice[id=101,customer=" + customer + ",amount=200.0]", invoice.toString());
    }
}
