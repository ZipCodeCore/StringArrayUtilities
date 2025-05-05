package com.zipcodewilmington;

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
        int last = array.length - 1;
        return array[last];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int secondToLast = array.length-2;
        return array[secondToLast];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < array.length; i++){
            if(array[i]==value){return true;}
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] ans = new String[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--){
        ans[j] = array[i];
        j++;
        }
        return ans;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int i = 0;
        int j = array.length - 1;

        for(i = 0; i < j; i++){
           if(array[i] == array[j]) {j--;}
           else return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String sentence = String.join("",array).toLowerCase();

        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for (int i = 0; i <26; i++){
            if (sentence.contains(alphabet[i])){}
            else {return false;}
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int ans = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] == value){ans++;}
        }
        return ans;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> arrayListed = new ArrayList<String>(Arrays.asList(array));
        arrayListed.remove(valueToRemove);
        String[] ans = arrayListed.toArray(new String[0]);
        return ans;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> arrayListed = new ArrayList<String>(Arrays.asList(array));
        //System.out.println(array);
        //System.out.println(arrayListed);
        for (int i = 0; i < arrayListed.size()-1; i++) {
            if (arrayListed.get(i) == arrayListed.get(i + 1)) {
                arrayListed.remove(i + 1);
                i--;
            }
        }
       // System.out.println(arrayListed);
        String[] ans = arrayListed.toArray(new String[0]);
        //System.out.println(ans);
        return ans;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String joinerLucas = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i]==array[i-1]){
                joinerLucas += array[i];
            } else {
                joinerLucas = joinerLucas + "%%%" + array[i];
            }
        }
        String[] ans = joinerLucas.split("%%%");
        return ans;
    }


}
