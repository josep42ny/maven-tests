package javaTesting;

import DomainEntities.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTests {

    @Test
    public void constructUserTest() {
        User user = new User("Tomeu", "secretisssim1234");

        assertNotNull(user);
        assertTrue(user.verifyPassword("secretisssim1234"));
    }

}
