import nyc.c4q.Problems;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertArrayEquals;

public class ProblemsTest {

    /////////// selectEvenNumber tests

    @Test
    public void selectEvenNumber_empty_array_returns_empty() {
        int[] input = new int[]{};
        assertArrayEquals(new int[]{}, Problems.selectEvenNumbers(input));
    }

    @Test
    public void selectEvenNumber_single_even_number_returns_all() {
        int[] input = {2};
        assertArrayEquals(input, Problems.selectEvenNumbers(input));
    }

    @Test
    public void selectEvenNumber_single_odd_number_returns_nothing() {
        int[] input = {1};
        assertArrayEquals(new int[]{}, Problems.selectEvenNumbers(input));

    }

    @Test
    public void selectEvenNumber_all_even_numbers_returns_all() {

        int[] input = {2,4,6};
        assertArrayEquals(input, Problems.selectEvenNumbers(input));
    }

    @Test
    public void selectEvenNumber_duplicate_even_numbers_returns_all() {

        int[] input = {2,2,2};
        assertArrayEquals(input, Problems.selectEvenNumbers(input));
    }

    @Test
    public void selectEvenNumber_zero_is_returned() {

        int[] input = {0};
        assertArrayEquals(input, Problems.selectEvenNumbers(input));
    }

    @Test
    public void selectEvenNumber_negative_is_not_returned() {

        int[] input = {-2};
        assertArrayEquals(new int[]{}, Problems.selectEvenNumbers(input));
    }

    @Test
    public void selectEvenNumber_null_input_returns_empty() {

        int[] input = null;
        assertArrayEquals(new int[]{}, Problems.selectEvenNumbers(input));
    }


    ///////// removeDupes test

    @Test
    public void removeDupes_empty_returns_empty() {

        int[] input = new int[]{};
        assertArrayEquals(new int[]{}, Problems.removeDupes(input));
    }

    @Test
    public void removeDupes_all_dupes_returns_empty() {

        int[] input = {7,7,7};
        assertArrayEquals(new int[]{}, Problems.removeDupes(input));
    }

    @Test
    public void removeDupes_no_dupes_returns_all() {

        int[] input = {1,2,3,4};
        assertArrayEquals(input, Problems.removeDupes(input));
    }

    @Test
    public void removeDupes_4ples_returns_empty() {

    }

    @Test
    public void removeDupes_works_on_negative_nums() {

        int[] input = {-1,-2,-3};
        assertArrayEquals(input, Problems.removeDupes(input));
    }

    @Test
    public void removeDupes_works_on_zero() {

        int[] input = {0,1,2,3};
        assertArrayEquals(input, Problems.removeDupes(input));


        int[] input1 = {0,0,0};
        assertArrayEquals(new int[]{}, Problems.removeDupes(input1));
    }

    // countTheLetters


    @Test
    public void countTheLetters_works_on_empty_input() {
        HashMap<String, Integer> testMap = new HashMap<>();
        Assert.assertEquals(testMap,Problems.countTheLetters(""));
    }

    @Test
    public void countTheLetters_works_on_null_input() {
        HashMap<String, Integer> testMap = new HashMap<>();
        Assert.assertEquals(testMap,Problems.countTheLetters(null));

    }

    @Test
    public void countTheLetters_works_on_single_char() {

        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("c", 0);
        Assert.assertEquals(testMap,Problems.countTheLetters("c"));
    }

    @Test
    public void countTheLetters_works_on_duplicate_char_word() {

        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("c",1);
        Assert.assertEquals(testMap,Problems.countTheLetters("cc"));
    }

    @Test
    public void countTheLetters_works_on_multi_char_word() {

        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("k",1);
        testMap.put("i",0);
        testMap.put("d",1);
        Assert.assertEquals(testMap,Problems.countTheLetters("kkidd"));
    }

    @Test
    public void countTheLetters_works_on_symbols() {

        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("%",0);
        testMap.put("&",0);
        Assert.assertEquals(testMap,Problems.countTheLetters("%&"));
    }

}
