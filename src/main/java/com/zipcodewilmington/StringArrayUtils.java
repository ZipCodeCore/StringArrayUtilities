package com.zipcodewilmington;

import com.sun.tools.javac.util.ArrayUtils;
import com.sun.xml.internal.xsom.util.DeferedCollection;

import java.util.*;

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
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean hasString = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                hasString = true;

            }

        }
        return hasString;
    }


    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(array));
        Collections.reverse(arrList);


        array = arrList.toArray(new String[arrList.size()]);
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean isPal = true;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] == array[array.length - (i + 1)]) {
            } else {
                isPal = false;
            }
        }
        return isPal;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String str = Arrays.toString(array);
        boolean[] alphabetList = new boolean[26];


        int index = 0;
        int verifier = 1;
        String str2 = str.toUpperCase();
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z') {
                index = str2.charAt(i) - 'A';
            }
            alphabetList[index] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (alphabetList[i] == false) {
                verifier = 0;}
            }
            return verifier == 1;
        }





    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (String s : array) {
            if (s.equals(value))
                count++;
        }
        return count;
    }


    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(array));
        for (int i = 0; i < arrList.size(); i++)
            if (arrList.get(i).equals(valueToRemove)) {
                arrList.remove(arrList.get(i));
            }
        return arrList.toArray(new String[arrList.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {


        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add(array[0]);

        for (int i = 1; i < array.length; i++)
            if (array[i] != array[i-1]) {
                arrList.add(array[i]);
            }
        return arrList.toArray(new String[arrList.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String catt = "";
        String temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (temp == array[i]) {
                catt += array[i];
            } else {
                temp = array[i];
                catt += " " + temp;
            }
        }
        String[] arr = catt.split(" ");

        return arr;

    }
}


