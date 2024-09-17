package com.zipcodewilmington;
import java.util.Arrays;



/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        boolean compare = false;

        for(int i=0; i < array.length; i++) {
            if(array[i].equals(value)) {
                compare = true;
            }
        }
        return compare;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] reversed = new String[array.length];
        for (int i=0; i < array.length; i++) {
            reversed[array.length-1-i] = array[i];
        }
        return reversed;

    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        String[] characters = new String[array.length];

        for ( int i = 0; i < array.length; i++ ) {
            characters[array.length - 1 - i] = array[i];
        }

        if (Arrays.toString(characters).equals(Arrays.toString(array))) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String lowCase = "";

        for ( int i = 0; i < array.length; i++ ) {
            lowCase = lowCase + array[i].toLowerCase();
        }
        
        int totalLetters = 0;
        
        for ( char j = 'a'; j <= 'z'; j++ ) {
            if ( lowCase.indexOf(j) >= 0 )
                totalLetters++;
        }

        if ( totalLetters == 26 ) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int numOfOcc = 0;

        for ( int i = 0; i < array.length; i++ ) {

            if ( array[i].equals(value) ) {
                numOfOcc++;
            }
        }
        return numOfOcc;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        int totalChars = 0;
        int totalRemovals = 0;

        for ( int i = 0; i < array.length; i++ ) {
            if ( array[i].equals(valueToRemove) ) {
                totalChars++;
            }
        }

        String[] array2 = new String[array.length - totalChars];

        for ( int j = 0; j < array.length; j++ ) {
            if ( !array[j].equals(valueToRemove) ) {
                array2[totalRemovals] = array[j];
                totalRemovals++;
            }
        }

        System.out.println(Arrays.toString(array2));

        return array2;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        String beginning = array[0] + " ";

        for ( int i = 1; i < array.length; i++ ) {

            if ( !array[i].equals(array[i - 1])) {
                beginning = beginning + array[i] + " ";
            }
        }

        String[] end = beginning.split(" ");

        return end;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        String beginning = array[0];

        for ( int i = 1; i < array.length; i++ ) {
            if ( array[i].equals(array[i - 1]) ) {
                beginning = beginning + array[i];
            } else {
                beginning = beginning + " " + array[i];
            }
        }

        String[] pack = beginning.split(" ");

        return pack;
    }


}
