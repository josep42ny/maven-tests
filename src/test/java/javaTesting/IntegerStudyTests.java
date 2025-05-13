package javaTesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerStudyTests {

    @Test
    public void integerStudy() {
        Integer vuit = new Integer(8);
        Integer u = new Integer(1);

        assertEquals(1, u.intValue(), "U val 1");
        assertEquals(8, vuit.intValue(), "Vuit val 8");
    }

    @Test
    public void integerComparationStudy() {
        Integer one = new Integer(1);
        Integer u = new Integer(1);

        assertEquals(1, one.intValue(), "One val 1");
        assertEquals(1, u.intValue(), "U val 1");

        //assertTrue(one == u);
        assertTrue(one.equals(u));
    }

    @Test
    public void integerStudyTres() {
        Integer dos = new Integer(2);
        Integer u = new Integer(1);

        String tipus = "Hi ha " + Integer.toBinaryString(dos) + " acudits dolents";

        assertEquals(1, u.intValue(), "U val 1");
        assertEquals(2, dos.intValue(), "Dos val 2");
    }

}
