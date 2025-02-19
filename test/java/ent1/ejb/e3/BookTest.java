package ent1.ejb.e3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BookTest {

    private Author author;
    private Book book;

    @BeforeEach
    void setUp() {
        author = new Author("Jane Doe", "jane.doe@example.com");
        book = new Book("978-3-16-148410-0", "Java Basics", author, 29.99, 5);
    }

    @Test
    void testConstructorWithQty() {
        assertEquals("978-3-16-148410-0", book.getIsbn());
        assertEquals("Java Basics", book.getName());
        assertEquals(author, book.getAuthor());
        assertEquals(29.99, book.getPrice());
        assertEquals(5, book.getQty());
    }

    @Test
    void testConstructorWithoutQty() {
        Book bookNoQty = new Book("978-3-16-148410-1", "Python Basics", author, 19.99);
        assertEquals("978-3-16-148410-1", bookNoQty.getIsbn());
        assertEquals("Python Basics", bookNoQty.getName());
        assertEquals(author, bookNoQty.getAuthor());
        assertEquals(19.99, bookNoQty.getPrice());
        assertEquals(0, bookNoQty.getQty());
    }

    @Test
    void testSetPriceValid() {
        book.setPrice(39.99);
        assertEquals(39.99, book.getPrice());
    }

    @Test
    void testSetPriceInvalid() {
        book.setPrice(-10);
        assertEquals(0, book.getPrice());
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
        assertEquals("Jane Doe", book.getAuthorName());
    }

    @Test
    void testToString() {
        String expected = "Book[isbn=978-3-16-148410-0,name=Java BasicsAuthor[name=Jane Doe,email=jane.doe@example.com,gender=f],price=29.99,qty=5]";
        assertEquals(expected, book.toString());
    }
}