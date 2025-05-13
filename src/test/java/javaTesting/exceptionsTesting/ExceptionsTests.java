package javaTesting.exceptionsTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionsTests {

    @Test
    public void NullPointerTest() {
        assertThrows(NullPointerException.class, () -> {
            Integer edat = null;
            String edatEnLletres = edat.toString();
            assertEquals("" + 18, edatEnLletres);
        });
    }

    @Test
    public void catchNullPointerTest() {
        Integer edat = null;
        String edatEnLletres;
        try {
            edatEnLletres = edat.toString();
        } catch (NullPointerException npe) {
            edat = 18;
            edatEnLletres = edat.toString();
        }
        assertEquals("" + 18, edatEnLletres);
    }

    @Test
    public void tryCatchNullPointerTest() {
        Integer edat = null;
        String edatEnLletres = "";
        String text;
        try {
            edatEnLletres = edat.toString();
        } catch (NullPointerException npe) {
            edat = 18;
            edatEnLletres = edat.toString();
        } finally {
            text = "Edat + edatEnLletres";
        }
        assertEquals("Edat 18", text);
    }

    @Test
    public void throwingIllegalArgumentExceptiontryCatchNullPointerTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            Integer edat = null;
            String edatEnLletres = "";
            String text;
            try {
                System.out.println(" Passa 1 generam NullPointerException");
                edatEnLletres = edat.toString();
            } catch (NullPointerException npe) {
                System.out.println(" Passa 2 - capturam la NullPointerException");
                System.out.println(" Passa 3 Anam a llançar una exepcio");
                throw new IllegalArgumentException("excepcio creada i llançada per mi");
            } finally {
                System.out.println(" Passa final codi de tancament");
            }
        });
    }

    @Test
    public void jugantAmbObjecteExcepcioTest() {
        Integer edat = null;
        String edatEnLletres;
        try {
            edatEnLletres = edat.toString();
        } catch (NullPointerException npe) {
            edat = 18;
            edatEnLletres = edat.toString();
            System.out.println("Anem a jugar amb l'obejcte excepcio 1111");

            System.out.println(npe.getMessage());
            System.out.println(npe.getStackTrace());
            npe.printStackTrace();
        }

        assertEquals("" + 18, edatEnLletres);
    }

}
