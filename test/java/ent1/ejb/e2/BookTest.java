package ent1.ejb.e2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Author author1;
    private Author author2;
    private Author[] authors;
    private Book book;

    @BeforeEach
    void setUp() {
        author1 = new Author("Jane Doe", "jane.doe@example.com", 'f');
        author2 = new Author("John Smith", "john.smith@example.com", 'm');
        authors = new Author[]{author1, author2};
        book = new Book("Java Programming", authors, 39.99, 10);
    }

    @Test
    void testConstructorWithQty() {
        assertEquals("Java Programming", book.getName());
        assertArrayEquals(authors, book.getAuthor());
        assertEquals(39.99, book.getPrice());
        assertEquals(10, book.getQty());
    }

    @Test
    void testConstructorWithoutQty() {
        Book bookNoQty = new Book("Python Basics", authors, 29.99);
        assertEquals("Python Basics", bookNoQty.getName());
        assertArrayEquals(authors, bookNoQty.getAuthor());
        assertEquals(29.99, bookNoQty.getPrice());
        assertEquals(0, bookNoQty.getQty());
    }

    @Test
    void testSetPriceValid() {
        book.setPrice(49.99);
        assertEquals(49.99, book.getPrice());
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
    void testGetAuthorNames() {
        assertEquals("Jane Doe,John Smith,", book.getAuthorNames());
    }

    @Test
    void testToString() {
        String expected = "Book[name=Java Programming,authors={[Author[name=Jane Doe,email=jane.doe@example.com,gender=f], " +
                "Author[name=John Smith,email=john.smith@example.com,gender=m]]},price=39.99,qty=10]";
        assertEquals(expected, book.toString());
    }
}