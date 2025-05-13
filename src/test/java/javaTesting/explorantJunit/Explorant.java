package javaTesting.explorantJunit;

import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Explorant {

    @BeforeAll
    public static void executaUnCopPerClasseAbansDeQualsevolTest() {
        System.out.println("Abans d'executar qualsevol test, un cop per classe");
    }

    @AfterAll
    public static void executaUnCopDespresDeQualsevolTest() {
        System.out.println("Despres d'executar qualsevol test, un cop per classe");
    }

    @BeforeEach
    public void executaAbansDeCadaTest() {
        System.out.println("Abans d'executar qualsevol test, per a cada test 11");
    }

    @AfterEach
    public void executaDespresDeCadaTest() {
        System.out.println("Despres d'executar qualsevol test, un cop per test!!!");
    }

    @Test
    public void assercionsDeJUnit() {
        assertEquals(5, 2 + 3);
        assertFalse(false, "fals es fals");
        assertFalse(3 > 5);
        assertTrue(5 > 3);
        int[] finsA10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] primers10 = {2, 1, 3, 5, 4, 6, 8, 7, 9, 10};
        Arrays.sort(primers10);
        assertArrayEquals(finsA10, primers10);
        assertNotNull("", "U String buit NO es null");
        assertNotNull("");
        assertNotSame("", null, "Un String buit NO es null");
        assertNotSame("", null);
        assertNull(null, "Nomes null es considerat null");
        Object obj = null;
        assertSame(obj, null);
    }
/*
    @Test
    public void assertThatAmbHamcrest() {
        assertThat("testet jant que 4+5 son 9", 4 + 5, is(9));
        assertThat("fals es fals", false, equalTo(false));
        assertThat(false, is(false));
        assertThat("true es true", true, equalTo(true));
        assertThat(true, is(true));
        assertThat("Un String buit no es null", is(not(nullValue())));
        assert That("Aixo es un text", containsString("un"));
        assertThat("Aixo es un text", endsWith("xt"));
        assertThat("Aixo es un text", startsWith("A1"));
    }*/
}
