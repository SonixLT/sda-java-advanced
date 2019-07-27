package lt.sdacademy.advanced.encapsulation;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExampleTest {

    @Test
    public void testAccess() {
        Example e = new Example();

        e.setTitle("Test");

        assertEquals("Test", e.getTitle());
    }

    @Test
    public void testNull() {
        Example e = new Example();

        String initialValue = e.getTitle();

        assertEquals("Default", e.getTitle());
        e.setTitle(null);

        assertEquals(initialValue, e.getTitle());
    }

    @Test
    public void testAccessLimit() {
        Example e = new Example();

        assertEquals("Default", e.getTitle());
        assertEquals("Default", e.getTitle());
        assertEquals("Default", e.getTitle());
        assertEquals(null, e.getTitle());
    }
}
