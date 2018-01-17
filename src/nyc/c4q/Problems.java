package nyc.c4q;

import java.lang.reflect.Array;
import java.util.*;

public class Problems {

    public static void main(String[] args) {

    }


    /**
     * Create a function `selectEvenNumbers` that will take in an array of numbers and return an array of only even numbers.
     * If there are no even numbers, return the empty array.
     */
    public static int[] selectEvenNumbers(int[] numbers) {
        int count = 0;
        if (numbers == null){
            return new int[]{};
        }
        for (int i : numbers) {
            if (i%2 == 0 && i >= 0){
                count++;
            }
        }
        int[] evenNumbers = new int[count];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0){
                continue;
            }
            if (numbers[i]%2 == 0){
                evenNumbers[i] = numbers[i];
            }
        }

        return evenNumbers;
    }

//    public static int[] selectEvenNumbers(int[] numbers){
//        if (numbers == null) return new int[]{};
//        return Arrays.stream(numbers).filter(n -> n >= 0 && n%2 == 0).toArray();
//    }





    /**
     Given an array of integers, write a method called int[] removeDupes(int[] input) that returns a new array of just the unique values.

     You may use additional data structures in your solution.

     ```
     removeDupes(new int[]{1, 2, 3, 4, 5, 1, 2, 3});

     // returns {4, 5}

     removeDupes(new int[]{7, 7, 7, 7, 7}}

     // returns {}
     ```
     */
    public static int[] removeDupes(int[] numbers) {
        Map<Integer,Integer> numCount = new HashMap<>();
        for(int n:numbers){
            if(!numCount.containsKey(n)){
                numCount.put(n,0);
            }else{
                numCount.put(n,numCount.get(n)+1);
            }
        }
        List<Integer> noDupes = new ArrayList<>();
        for(int y:numCount.keySet()){
            if(numCount.get(y)==0){
                noDupes.add(y);
            }
        }
        int[] result = new int[noDupes.size()];
        for(int j=0;j<noDupes.size();j++){
            result[j] = noDupes.get(j);
        }

        return result;
    }


    /**
    Alternative form of removeDupes is getDistinct() that returns the distinct elements in the array.
     */



    /**
     Given a string, write a method called countTheLetters takes a string input and returns a map containing a count for each of the letters in the string.

     ```
     countTheLetters("dog");
     // returns a map containing the pairs {d: 1, o: 1, g: 1}

     countTheLetters("elephant");
     // returns a map containing the pairs {e: 2, l: 1, p: 1, h: 1, a: 1, n: 1, t: 1}

     countTheLetters("llama");
     // returns a map containing the pairs {l: 2, a: 2, m: 1}
     ```
     */
    public static HashMap<String, Integer> countTheLetters(String input) {
        /**
         * Map<Integer,Integer> numCount = new HashMap<>();
         for(int n:numbers){
         if(!numCount.containsKey(n)){
         numCount.put(n,0);
         }else{
         numCount.put(n,numCount.get(n)+1);
         }
         }
         List<Integer> noDupes = new ArrayList<>();
         for(int y:numCount.keySet()){
         if(numCount.get(y)==0){
         noDupes.add(y);
         }
         }
         int[] result = new int[noDupes.size()];
         for(int j=0;j<noDupes.size();j++){
         result[j] = noDupes.get(j);
         }

         return result;
         */

        if (input == null){
            return new HashMap<>();
        }
        HashMap<String,Integer> stringCount = new HashMap<>();
        for (Character c : input.toCharArray()) {
            if (!stringCount.containsKey(c.toString())){
                stringCount.put(c.toString(),0);
            } else {
                stringCount.put(c.toString(),stringCount.get(c.toString())+1);
            }
        }

        return stringCount;
    }
}
