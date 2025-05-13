package javaTesting;

import javaTesting.Resources.AppParameters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppParametersTests {

    public static final String DOMAIN_EXPECTED = "127.0.0.1";
    public static final String PORT_EXPECTED = "80";
    public static final String URL_EXPECTED = "https://" + DOMAIN_EXPECTED + ":" + PORT_EXPECTED;
    @Test
    public void domainURLCorrect() {
        Assertions.assertEquals(DOMAIN_EXPECTED, AppParameters.DOMAIN, "Retorna la part FQDN");
    }

    @Test
    public void portURLCorrect() {
        Assertions.assertEquals(PORT_EXPECTED, AppParameters.PORT, "Retorna el port corrected");
    }

    @Test
    public void URLCorrect() {
        Assertions.assertEquals(URL_EXPECTED, AppParameters.getURL(), "Retorna la URL correcta");
    }

    @Test
    public void singletonCorrectness(){
        AppParameters inst1 = AppParameters.getInstance();
        AppParameters inst2 = AppParameters.getInstance();
        Assertions.assertTrue(inst1 == inst2,"Comprovacio unicitat instancia del singleton");
    }

}
