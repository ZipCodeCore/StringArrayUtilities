package com.zipcodewilmington;

/**
 * Created by leon on 1/29/18.
 */
import java.util.Arrays;
import java.util.ArrayList;
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
    public static String getLastElement(String[] array)
    {
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
        boolean doesContain = false;
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(value)){
                doesContain = true;
                break;
            }

        }
        return doesContain;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] revArr = new String[array.length];

        for(int i = 0; i < array.length; i++){
            revArr[array.length - 1 - i] = array[i];
        }
        return revArr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean palindromic = true;
        for(int i = 0; i < (array.length - (array.length%2) )/2; i++){
            if(!array[i].equals(array[array.length - 1 - i])){
                palindromic = false;
                break;
            }
        }
        return palindromic;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean[] lettersPresent = new boolean[26];
        Arrays.fill(lettersPresent,false);

        for(int i = 0; i < array.length; i++){
            String str = array[i].toLowerCase();
            for(String word : str.split("[^a-z]")){
                for(int j = 0; j < word.length(); j++){
                    int letter = ((int)word.charAt(j))%97;
                    lettersPresent[letter] = true;
                }
            }
        }

        boolean allPresent = true;
        for(int i = 0; i < lettersPresent.length; i++){
            if(!lettersPresent[i]){
                allPresent = false;
                break;
            }
        }
        return allPresent;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            if(value.equals(array[i])){
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
        ArrayList<String> arrList = new ArrayList<String>(array.length);
        for(int i = 0; i < array.length; i++){
            if(!valueToRemove.equals(array[i])){
                arrList.add(array[i]);
            }
        }
        String[] primitiveArray = new String[arrList.size()];
        return arrList.toArray(primitiveArray);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> arrList = new ArrayList<String>(array.length);
        arrList.add(array[0]);
        String prevStr = array[0];
        for(int i = 1; i < array.length; i++){
            if(!prevStr.equals(array[i])){
                arrList.add(array[i]);
                prevStr = array[i];
            }
        }
        String[] primitiveArray = new String[arrList.size()];
        return arrList.toArray(primitiveArray);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        StringBuilder sbuild = new StringBuilder(array.length);
        ArrayList<String> arrList = new ArrayList<String>(array.length);
        sbuild.append(array[0]);
        String prevStr = array[0];
        for(int i = 1; i < array.length; i++){
            if(!prevStr.equals(array[i])){
                arrList.add(sbuild.toString());
                prevStr = array[i];
                sbuild.delete(0, sbuild.length());
                sbuild.append(array[i]);
            }
            else {
                sbuild.append(array[i]);
            }
        }
        arrList.add(sbuild.toString());

        String[] primitiveArray = new String[arrList.size()];
        return arrList.toArray(primitiveArray);
    }


}
