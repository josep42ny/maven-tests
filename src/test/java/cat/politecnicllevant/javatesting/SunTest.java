package cat.politecnicllevant.javatesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SunTest {

    @Test
    public void testSum() {
        int result = 1 + 1;
        assertEquals(2, result, "1 + 1 = 2");
    }

}
