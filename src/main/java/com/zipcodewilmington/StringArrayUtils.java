package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     */ // TODO
    public static String getFirstElement(String[] array) {
        String result = null;
        if (array != null && array.length >= 1) {
            result = array[0];
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        String result = null;
        if (array != null && array.length >= 2) {
            result = array[1];
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String result = null;
        if (array != null && array.length > 0) {
            result = array[array.length - 1];
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String result = null;
        if (array != null && array.length >= 2) {
            result = array[array.length - 2];
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(int i = 0; i< array.length; i++){
            String s = array[i];
            if(array[i].contains(value)){
                return true;
            }
        }

        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        StringBuilder reverse = new StringBuilder();
        int len = array.length;
        for(int i = len ; i>0 ; i--){
           reverse.append(array[i-1]).append(" ");
        }
        String[] reversed  = reverse.toString().split(" ");
        return reversed;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int len = array.length;
        for(int i =0; i< (len/2);i++){
            if(array[i] != array[len-i-1]){
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        boolean[] used = new boolean[26];
        for(int i = 0; i < array.length; i++){
            String word = array[i].toUpperCase();
            for (int j = 0; j < word.length(); j++) {

                if (word.charAt(j) >= 'A' && word.charAt(j) <= 'Z') {
                    int foundLetterIndex = word.charAt(j) - 'A';
                    used[foundLetterIndex] = true;
                }
            }
        }

        for (int k = 0; k < used.length; k++) {
            if (!used[k]) {
                return false;
            }
        }
        return true;
    }



    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] result = new String[array.length-1];
        int resultIndex = 0;
        for(int i = 0; i < array.length; i++){
            if(!array[i].equals(valueToRemove)){
                result[resultIndex++] = array[i];
            }
        }
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < array.length - 1; i++) {
            if (!array[i].equals(array[i + 1])) {
                s.append(array[i]).append(" ");
            }
        }
        s.append(array[array.length-1]);
        return s.toString().split(" ");
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        StringBuilder s= new StringBuilder();
        for(int i = 0; i< array.length-1; i++){

            if(array[i].equals(array[i+1])){
                s.append(array[i]);
            }else
            {
                s.append(array[i]);
                s.append(" ");
            }
        }
        s.append(array[array.length-1]);
        return s.toString().split(" ");
    }


}
