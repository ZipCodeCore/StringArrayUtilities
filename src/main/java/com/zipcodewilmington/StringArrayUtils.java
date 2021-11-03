package com.zipcodewilmington;

import com.sun.tools.javac.util.ArrayUtils;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
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
        for(String val: array){
            if (val.equals(value)){
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
        ArrayList<String> arrayL = new ArrayList<String>();
        Collections.addAll(arrayL,array);
        Collections.reverse(arrayL);
        String[] arr = new String[array.length];
        return arrayL.toArray(arr);
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        return Arrays.equals(array,StringArrayUtils.reverse(array));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        //an algo which goes thru the string[] and takes out stuff as it sees it
        String abc = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<String> atLarge =  new ArrayList<String>();
        Collections.addAll(atLarge,abc.split(""));
        ArrayList<String> found  = new ArrayList<String>();
        int count = 0;
        boolean wasFound = false;
        for(int i = 0; i < array.length; i++){
            String[] cur = array[i].split("");
            for(int j = 0; j < array[i].length(); j++){
                wasFound = false;
                //& ignores stuff already found
                if(! found.isEmpty()) {
                    for(int l = 0; l < found.size(); l++) {
                        if(found.get(l).equals(cur[j])){
                            l = found.size();
                            wasFound = true;
                        }
                    }
                }
                if(j < cur.length && !wasFound) {
                    for (int k = 0; k < atLarge.size(); k++) {
                        if(atLarge.isEmpty()){
                            return true;
                        }
                        if (atLarge.get(k).equalsIgnoreCase(cur[j])) {
                            found.add(atLarge.get(k));
                            atLarge.remove(k);
                            k = atLarge.size();
                        }

                    }
                }
            }
        }
        return atLarge.isEmpty();
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occs = 0;
        boolean different = false;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length(); j++){
                if(array[i].charAt(j) == value.charAt(0)){
                    for(int k = 1; k < value.length() ; k++){
                        j++;
                        if(value.charAt(k) != array[i].charAt(j)){
                            k = value.length();
                            different = true;
                        }
                    }
                    if(!different){
                        occs++;
                    }
                }
            }
        }
        return occs;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
