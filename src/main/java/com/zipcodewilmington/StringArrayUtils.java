package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
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
        boolean result = false;

        for (String i : array) {
            if (i == value) {
                result = true;
                break;
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
        int lastIndex = array.length - 1;
        for (int currentIndex = lastIndex; currentIndex >= 0; currentIndex--) {
            result[lastIndex - currentIndex] = array[currentIndex];
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String stringRepresentationOfArray = Arrays.toString(array);
        String stringRepresentationOfReversedArray = Arrays.toString(reverse(array));
        return stringRepresentationOfArray.equals(stringRepresentationOfReversedArray);
    }


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String result = "";
        for (String str : array)
            result += str.toUpperCase();
        for (int i = 'A'; i <= 'Z'; i++) {
            for (int j = 0; j < result.length(); j++) {
                if (i == result.charAt(j)) {
                    break;
                } else if (j == result.length() - 1) {
                    return false;
                }
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
        for (int i = 0; i < array.length; i++) {
            if (value == array[i])
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
        int counter = 0;
        String[] output = new String[array.length - 1];
        for (String removeString : array) {
            if (!removeString.equals(valueToRemove)) {
                output[counter++] = removeString;
            }
        }
        return output;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> removeString = new ArrayList<String>();
        removeString.add(array[0]);
        for (int i = 1; i < array.length; i++){
            if (array[i] != array[i - 1]) {
                removeString.add(array[i]);
            }
        }
        return removeString.toArray(new String[removeString.size()]);
}

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String arrayTwo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == array[i]) {
                arrayTwo += array[i];
            } else arrayTwo += " " + array[i];
        }
        String[] result = arrayTwo.split(" ");
        System.out.println(arrayTwo);
        return result;
    }
}

