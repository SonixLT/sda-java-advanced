package lt.sdacademy.advanced;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {

    @Test
    public void testUpperCase() {
        String message = "tekstas";
        Main main = new Main();

        String result = main.getMessage(message);

        assertEquals("TEKSTAS", result);
    }

    @Test
    public void testNull() {
        Main main = new Main();

        String result = main.getMessage(null);

        assertEquals("", result);
    }
}