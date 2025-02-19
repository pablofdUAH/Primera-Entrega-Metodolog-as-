package ent1.ejb.e3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class AuthorTest {

    private Author author;

    @BeforeEach
    void setUp() {
        author = new Author("Jane Doe", "jane.doe@example.com");
    }

    @Test
    void testConstructor() {
        assertEquals("Jane Doe", author.getName());
        assertEquals("jane.doe@example.com", author.getEmail());
    }

    @Test
    void testGetName() {
        assertEquals("Jane Doe", author.getName());
    }

    @Test
    void testGetEmail() {
        assertEquals("jane.doe@example.com", author.getEmail());
    }

    @Test
    void testSetEmail() {
        author.setEmail("new.email@example.com");
        assertEquals("new.email@example.com", author.getEmail());
    }

    @Test
    void testToString() {
        String expected = "Author[name=Jane Doe,email=jane.doe@example.com]";
        assertEquals(expected, author.toString());
    }
}