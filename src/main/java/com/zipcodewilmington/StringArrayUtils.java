package com.zipcodewilmington;

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
        return array[array.length - 1]; //return value of array at end of arrays length minus 1
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
        for (int i = 0; i < array.length; i++) { //itar through array using .contains() searching for given value
            String s = array[i];
            if (array[i].contains(value)) {
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
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, array);
        Collections.reverse(list);
        return list.toArray(new String[0]);
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversedArr = reverse(array);
        return Arrays.equals(reversedArr, array);


    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String x = Arrays.toString(array);
        x = x.toLowerCase();
        if (x.length() < 26) {
            return false;
        } else
            for (char i = 'a'; i <= 'z'; i++) {
                if (x.indexOf(i) == -1)
                    return false;
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
            if (array[i] == value) {
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
       /* int j = 0;

        String[] x = new String[array.length-1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != valueToRemove){
                x[j] = array[i];
                j++;
            }
        }
            return x; */

        ArrayList<String> arrayList = new ArrayList(Arrays.asList(array));
        while (arrayList.contains(valueToRemove)) {
            arrayList.remove(valueToRemove);
        }
        return arrayList.toArray(new String[0]); //set array to 0 to populate with new arraylist

    }


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        //ArrayList<String> arrayList = new ArrayList(Arrays.asList(array));
        String finalString = "";
        String lastString = "";
        int count = 0;
        for (String currentString : array) {
            if (currentString == lastString) {
                lastString = currentString;
            } else if (currentString != lastString) {
                finalString += currentString + " ";
                lastString = currentString;
                count++;
            }
        }
        String[] x = new String[count];
        x = finalString.split(" ");
        return x;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     * String[] array = {"t", "t", "q", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e"};
     * String[] expected = {"tt", "q", "aaa", "b", "cc", "aa", "d", "eee"};
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int length = array.length;
        int lastIndex = 0;
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(array[0]);
        for (int i = 1; i < length; i++) {
            if (arrayList.get(lastIndex).contains(array[i])) {            // "aa" != "a" use contains
                arrayList.set(lastIndex, (arrayList.get(lastIndex) + array[i]));
            } else {
                lastIndex++;
                arrayList.add(array[i]);   //adds non dupes
            }
        }
     return arrayList.toArray(new String[0]);


    }
}





