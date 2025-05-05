package com.zipcodewilmington;

import com.sun.tools.javac.util.ArrayUtils;
import com.sun.xml.internal.fastinfoset.util.StringArray;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

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
        String lastElement = array[array.length - 1];

        return lastElement;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String secondLastElement = array[array.length - 2];

        return secondLastElement;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int x = 0; x < array.length; x++) {
            if (array[x] == value) {
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
        String[] array2 = new String[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            array2[array.length - 1 - i] = array[i];
        }
        return array2;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int i1 = 0;
        int i2 = array.length - 1;
        while (i2 > i1) {
            if (array[i1] != array[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        // empty array list
        ArrayList<Character> charList = new ArrayList();
        // input array changed to a string
        String input = Arrays.toString(array).toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                if (charList.contains(input.charAt(i)) == false) {
                    charList.add(input.charAt(i));
                }
            }
        }
        System.out.println(charList.toString());
        if (charList.size() == 26) {
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(value)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int outputIndex = 0;
        String[] output = new String[array.length - 1];
        for (String value1 : array) {
            if (!value1.equals(valueToRemove)) {
                output[outputIndex] = value1;
                outputIndex++;
            }
        }
        return output;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        //Made an array list
        ArrayList<String> outputArrayL = new ArrayList<String>();
        // added the 'previous' 1st element of the input
        outputArrayL.add(array[0]);
        // starting at index 1; index going til end of the array; increment by 1;
        for (int x = 1; x < array.length; x++) {
            // if array of index is not equal to array of index 'previous'(-1), than add it to the array list.
            if (array[x] != array[x - 1]) {
                outputArrayL.add(array[x]);
            }

        }
        // Initializing new string[] to the size of outputArrayL
        String[] output = new String[outputArrayL.size()];
        // Converting outputArrayL to normal array of type String
        return outputArrayL.toArray(output);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        //Made an array list
        ArrayList<String> outputArrayL = new ArrayList<String>();
        // added the 'previous' 1st element of the input
        outputArrayL.add(array[0]);
        // starting at index 1; index going til end of the array; increment by 1;
        for (int x = 1; x < array.length; x++) {
            // if array of index is not equal to array of index 'previous'(-1), than add it to the array list.
            if (array[x] != array[x - 1]) {
                outputArrayL.add(array[x]);
            }
            else {
                String value2 = outputArrayL.get(outputArrayL.size()-1) + array[x];
                outputArrayL.set(outputArrayL.size()-1, value2);
            }
        }
            String[] output = new String[outputArrayL.size()];

            return outputArrayL.toArray(output);
        }

    }