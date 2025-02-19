package ent1.ejb.e5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    private Customer customer;
    private Account account;
    private Account account2;
    @BeforeEach
    void setUp() {
        customer = new Customer(1, "John Doe", 'm');
        account = new Account(1, customer, 100.0);
        account2 = new Account(2, customer);
    }

    @Test
    void testAccountConstructorAndGetId() {
        assertEquals(1, account.getId());
    }

    @Test
    void testAccountConstructorAndGetCustomer() {
        assertEquals(customer, account.getCustomer());
    }

    @Test
    void testAccountConstructorAndGetBalance() {
        assertEquals(100.0, account.getBalance());
    }

    @Test
    void testSetBalance() {
        account.setBalance(200.0);
        assertEquals(200.0, account.getBalance());

        account.setBalance(-50.0);
        assertEquals(0.0, account.getBalance());
    }

    @Test
    void testDeposit() {
        account.deposit(50.0);
        assertEquals(150.0, account.getBalance());
    }

    @Test
    void testWithdraw() {
        account.withdraw(30.0);
        assertEquals(70.0, account.getBalance());

        account.withdraw(100.0);
        assertEquals(70.0, account.getBalance());
    }

    @Test
    void testToString() {
        assertEquals("John Doe(1) balance=$100.0", account.toString());
    }
}
