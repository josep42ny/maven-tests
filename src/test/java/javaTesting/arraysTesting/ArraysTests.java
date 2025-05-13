package javaTesting.arraysTesting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysTests {

    @Test
    public void arraySenzill() {
        String[] numerals = {"zero", "un", "dos", "tres"};

        assertEquals("zero", numerals[0]);

        String nombres = "";
        for (String n : numerals) {
            nombres += n + "|";
        }

        assertEquals("zero|un|dos|tres", nombres);
    }

    @Test
    public void ordenacio() {
        String[] numerals = {"zero", "un", "dos", "tres"};
        Arrays.sort(numerals);

        for (int i = 0; i < numerals.length - 1; i++) {
            assertTrue(numerals[i].compareTo(numerals[i + i]) < 0);
        }
    }

    @Test
    public void omplirArrayParcial() {
        int[] nums = {0,1,2,3,4,5,6,7,8,9};
        Arrays.fill(nums,5,10,-1);

        for (int i = 0; i < nums.length; i++) {
            assertEquals(-1, nums[i]);
        }
    }

    @Test
    public void copiaRang() {
        String[] dies = {"a","b","c","d","e"};
        String[] workdays = Arrays.copyOfRange(dies,0,5);

        assertEquals(5, workdays.length);
        assertEquals("b", workdays[1]);
    }

    @Test
    public void arraysIrregularsTest(){
        int[][] arrayIrregular = {
            {0,1,2,3,4,5},
            {8,1,2,3,4},
            {6,1,2,3},
            {0,1,2},
            {0,1},
            {6}
        };
            assertEquals(6, arrayIrregular.length);
            assertEquals(6, arrayIrregular[0].length);
            assertEquals(1, arrayIrregular [5].length);
        }

}