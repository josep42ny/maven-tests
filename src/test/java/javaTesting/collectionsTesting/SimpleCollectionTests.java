package javaTesting.collectionsTesting;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleCollectionTests {

    @Test
    public void firstColTest() {
        String[] nombres = {"zero", "un", "dos", "tres"};
        List<String> numerals = new ArrayList<>();

        for (String s : nombres) {
            numerals.add(s);
        }
        numerals.add("quatre");
        assertEquals(5, numerals.size());

        List<String> llistaNumeros = Arrays.asList(nombres);
        //llistaNumeros.add("quatre");
        assertEquals(4, llistaNumeros.size());
    }

    @Test
    public void diesSetmana(){
        List<String> diesSetmana = new ArrayList<>();
        List<String> diesFeiners = new ArrayList<>();
        List<String> diesCapDeSetmana = new ArrayList<>();

        initDiesFeiners (diesFeiners);

        assertEquals(5, diesFeiners.size());
        assertFalse(diesSetmana.containsAll(diesFeiners));

        diesSetmana.addAll(diesFeiners);

        assertEquals(5, diesSetmana.size());
        assertTrue(diesSetmana.containsAll(diesFeiners));
    }

    public void initDiesFeiners(List<String> dies) {
        dies.add("dilluns");
        dies.add("dimarts");
        dies.add("dimecres");
        dies.add("diious");
        dies.add("divendres");
    }

    @Test
    public void provesAmbMaps() {
        Map<String,String> map = new HashMap<>();

        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        assertEquals(3, map.size());

        map.remove("2");
        assertEquals(2, map.size());

        assertFalse(map.containsKey("2"));
    }
}
