package ent1.ejb.e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthorTest {
    private Author author;
    @BeforeEach
    void setUp() {
        author = new Author("Juan","Juan@gmail.com",'y');
    }
    @Test
    void testGetName() {
        assertEquals("Juan",author.getName());
    }
    @Test
    void setEmail(){
        author.setEmail("juan@gmail.com");
        assertEquals("juan@gmail.com",author.getEmail());
    }
}
