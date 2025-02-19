package ent1.ejb.e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    private Author author;
    private Book book;
    private Book book1;

    @BeforeEach
    void setUp() {
        author = new Author("John Doe", "john@example.com", 'M');
        book = new Book("Java Programming", author, 49.99, 10);
        book1 = new Book("Java Programming", author, 49.99);
    }

    @Test
    void testGetName() {
        assertEquals("Java Programming", book.getName());
    }


    @Test
    void testGetAuthor() {
        assertEquals(author, book.getAuthor());
    }

    @Test
    void testGetPrice() {
        assertEquals(49.99, book.getPrice());
    }

    @Test
    void testSetPriceValid() {
        book.setPrice(59.99);
        assertEquals(59.99, book.getPrice());
    }

    @Test
    void testSetPriceInvalid() {
        book.setPrice(-10.0);
        assertEquals(0.0, book.getPrice());
    }

    @Test
    void testGetQty() {
        assertEquals(10, book.getQty());
    }

    @Test
    void testSetQtyValid() {
        book.setQty(20);
        assertEquals(20, book.getQty());
    }

    @Test
    void testSetQtyInvalid() {
        book.setQty(-5);
        assertEquals(0, book.getQty());
    }

    @Test
    void testGetAuthorName() {
        assertEquals("John Doe", book.getAuthorName());
    }

    @Test
    void testGetAuthorEmail() {
        assertEquals("john@example.com", book.getAuthorEmail());
    }

    @Test
    void testGetAuthorGender() {
        assertEquals('M', book.getAuthorGender());
    }

    @Test
    void testToString() {
        String expected = "Book[name=Java Programming," + author + ",price=49.99,qty=10]";
        assertEquals(expected, book.toString());
    }
}
