package com.zipcodewilmington;

import javax.print.DocFlavor;
import java.util.ArrayList;
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
        for (String s : array) {
            if (s.equals(value))
                return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] newArray = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            newArray[j] = array[i];
        }
        return newArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversed = reverse(array);
        boolean isPalindrome = true;
        for (int i = 0; i < array.length; i++) {
            if(!array[i].equals(reversed[i])) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean[] letters = new boolean[26];
        for (String s : array) {
            for (char c : s.toCharArray()) {
                if (c >= 'A' && c <= 'Z') letters[c - 'A'] = true;
                else if (c >= 'a' && c <= 'z') letters[c - 'a'] = true;
            }
        }
        for (boolean b : letters) {
            if(b == false) return false;
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
        for(String s : array) {
            if(s.equals(value)) count++;
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(array));
        list.remove(valueToRemove);
        return list.toArray(new String[list.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> list = new ArrayList();

        for (String s : array) {
            if(list.size() == 0) list.add(s);
            else if(!list.get(list.size() - 1).equals(s)) {
                list.add(s);
                System.out.println(s);
            }
        }

        return list.toArray(new String[list.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> list = new ArrayList();
        String currentWord = "";

        for (String s : array) {
            if(list.size() == 0) {
                list.add(s);
                currentWord = s;
            }
            else if(currentWord.equals(s)) {
                list.set(list.size() - 1, list.get(list.size() - 1) + s);
            }
            else {
                list.add(s);
                currentWord = s;
            }
        }
        return list.toArray(new String[list.size()]);
    }


}
