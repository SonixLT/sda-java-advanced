package lt.sdacademy.advanced.encapsulation;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import org.junit.Test;

public class DogTest {

    @Test
    public void verifyConstructor() {
        Dog d = new Dog("Name", 20, true, "WHITE", new BigDecimal(60));

        assertEquals(20, d.getAge());
        assertEquals(new BigDecimal(60), d.getWeight());
    }

    @Test
    public void verifyWeightSetter() {
        Dog d = new Dog("Name", 20, true, "WHITE", new BigDecimal(60));

        assertEquals(20, d.getAge());
        assertEquals(new BigDecimal(60), d.getWeight());

        d.setWeight(new BigDecimal(15));
        assertEquals(new BigDecimal(15), d.getWeight());

        d.setWeight(new BigDecimal(0));
        assertEquals(new BigDecimal(15), d.getWeight());

        d.setWeight(new BigDecimal(-5));
        assertEquals(new BigDecimal(15), d.getWeight());

        d.setWeight(null);
        assertEquals(new BigDecimal(15), d.getWeight());
    }
}
