package lt.sdacademy.advanced.inheritance;

import org.junit.Test;

public class PersonTest {

    @Test
    public void testInheritance() {
        Being b = new Being();
        Human h = new Human();
        Person p = new Person(null , null);

        Being b2 = b;
        b2 = h;
        b2 = p;

        Human h2 = p;
        h2 = h;
        //h2 = b;

        Person p2 = p;
        //p2 = h;
        //p2 = b;
    }

    @Test
    public void testToString() {
        Person p = new Person("Rutenis", "Turcinas");
        System.out.println(p);
    }

    @Test
    public void testRace() {
        Person p = new Person("Rutenis", "Turcinas");
        p.printRace();
    }

    @Test
    public void testPrintInfo() {
        Being p = new Person("Rutenis", "Turcinas");
        p.printInfo();
        p.callOverridedMethod();
    }
}