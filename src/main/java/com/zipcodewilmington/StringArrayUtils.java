package com.zipcodewilmington;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

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
        return Arrays.asList(array).contains(value);
    }


    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reversedArray = new String[array.length];
        int counter = 0;
        for (int i = array.length-1; i >= 0; i--) {
            reversedArray[counter] = array[i];
            counter ++;
        }
        return reversedArray;
    }

        /**
         * @param array array of String objects
         * @return true if the order of the array is the same backwards and forwards
         */ // TODO
        public static boolean isPalindromic (String[]array){
            String[] reversedArray = new String[array.length];
            int counter = 0;
            for (int i = array.length-1; i >= 0; i--) {
                reversedArray[counter] = array[i];
                counter++;
            }
            return Arrays.equals(array, reversedArray);
        }

        /**
         * @param array array of String objects
         * @return true if each letter in the alphabet has been used in the array
         */ // TODO
        public static boolean isPangramic (String[]array){
           String str = "";
           boolean[] alphabetList = new boolean[26];
           int index = 0;
           int counter = 0;
           for(int i = 0; i < array.length; i++){
               str+= array[i];
           }
           str = str.replace(" ", "");

           for (int i = 0; i < str.length(); i++){
               if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                   index = str.charAt(i) - 'A';
               else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                   index = str.charAt(i) - 'a';

               alphabetList[index] = true;

        }
           for (int i = 0; i<= 25; i++){
               if (!alphabetList[i])
                   return false;
               }
           return true;
           }
        /**
         * @param array array of String objects
         * @param value value to check array for
         * @return number of occurrences the specified `value` has occurred
         */ // TODO
        public static int getNumberOfOccurrences (String[]array, String value){
            int counter = 0;
            for (int i = 0; i < array.length; i++){
                if (array[i].equals(value)) {
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
        public static String[] removeValue (String[]array, String valueToRemove){
            ArrayList<String> arrayNoRepeats = new ArrayList<String>();
            for (int i = 0; i < array.length; i++) {
                if (!array[i].equals(valueToRemove)) {
                    arrayNoRepeats.add(array[i]);
                }
            }
            return arrayNoRepeats.toArray(new String[arrayNoRepeats.size()]);
        }

        /**
         * @param array array of chars
         * @return array of Strings with consecutive duplicates removes
         */ // TODO
        public static String[] removeConsecutiveDuplicates (String[]array){
            ArrayList<String> arrayNoRepeats = new ArrayList<String>();
            for (int i = 0; i < array.length; i++) {
                if (array.length - 1 == i) {
                    arrayNoRepeats.add(array[i]);
                }
                else if (!array[i].equals(array[i + 1])) {
                    arrayNoRepeats.add(array[i]);
                }

            }
            return arrayNoRepeats.toArray(new String[arrayNoRepeats.size()]);
        }

        /**
         * @param array array of chars
         * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
         */ // TODO
        public static String[] packConsecutiveDuplicates (String[]array){
            ArrayList<String> arrayPack = new ArrayList<String>();
            arrayPack.add(array[0]);
            int j = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i].equals(Character.toString(arrayPack.get(j).charAt(0)))) {
                String concated = arrayPack.get(j)+array[i];
                arrayPack.set(j, concated);
                }
                else{
                    arrayPack.add(array[i]);
                    j++;
                }
            }
            return arrayPack.toArray(new String[arrayPack.size()]);
        }


    }
