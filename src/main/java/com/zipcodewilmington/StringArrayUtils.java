package com.zipcodewilmington;

import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        Boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(value)) {
                result = true;
            }
        }
        return result;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO

    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];
        int decrement = array.length - 1;
        for (int i = 0; i < result.length; i++) {
            result[decrement] = array[i];
                decrement--;
        }
            return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int decrement = array.length - 1;
        for (int i = 0; i < decrement - 1; i++) {
            if (array[i].equals(array[decrement--])) {
                return true;
            }
            if (!array[i].equals(array[decrement--])) {
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
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int numberOfTimes = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                numberOfTimes += 1;
            }
        }

        return numberOfTimes;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        // Generate a Constructor with a new Object
        // Add all elements(or indexes) to the newly generated 'arrList'
        // call to remove the specific value from the new arrList
        // return the arrList casted to a new String Array starting at the 0'th index
        ArrayList<String> arrList = new ArrayList<String>();
        Collections.addAll(arrList, array);
        arrList.remove(valueToRemove);
        return arrList.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        // this returns out of bounds exception for 2/3 (2/3 are 10 indexes (11 places)
        // test 1 returns array lengths differ/ (9 indexes (10 places)
        ArrayList<String> arrList = new ArrayList<String>();
        Collections.addAll(arrList, array);
        for (int i = 1; i < arrList.size() - 1; i++) {
            if (arrList.equals(i) == arrList.equals(i + 1)) {
                arrList.remove(i);
            }
        }
        return arrList.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        // 

        int amountOfChars = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                amountOfChars++;
            }
        }
        String[] newArr = new String[amountOfChars];
        Integer index = 0;
        String stringToBeAdded = "";
        stringToBeAdded += array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                stringToBeAdded += array[i - 1];
            } else if (array[i] != array[i - 1]) {
                newArr[index] = stringToBeAdded;
                stringToBeAdded = array[i];
                index++;
            }
        }
        newArr[index] = stringToBeAdded;
        return newArr;
    }
}
