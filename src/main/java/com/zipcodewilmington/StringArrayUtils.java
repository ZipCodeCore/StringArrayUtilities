package com.zipcodewilmington;

import com.sun.tools.javac.util.ArrayUtils;

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
        for(int i=0;i< array.length;i++){
            if(array[i]==value){
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
        String[] strArray=new String[array.length];
        for(int i=array.length-1,j=0;i>=0;i--,j++){
                strArray[j]=array[i];
        }
    return strArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] strArray=new String[array.length];
        strArray=array.clone();
        for(int i= array.length-1,j=0;i>=0;i--,j++){
            if(array[i].equals(strArray[j])){
                continue;
            }
            else return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        Boolean[] flag=new Boolean[26];
        Arrays.fill(flag, false);
        String str=Arrays.toString(array).toUpperCase();
        if (str == null) {
            return false;
        }
        System.out.println(str);
        int alphabetIndex=0;
        for(int i=0;i<str.length();i++){
            if('A'<=str.charAt(i) && str.charAt(i)<='Z'){
                alphabetIndex=str.charAt(i)-'A';
                //System.out.println(alphabetIndex);
                flag[alphabetIndex]=true;
            }
        }
        for(boolean index: flag){
            if(!index)
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
        int occurences=0;
        for(int i=0;i< array.length;i++){
            if(array[i].equals(value)){
                occurences++;
            }
        }
        return occurences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] anotherArray=new String[array.length-1];
        for(int i=0,k=0;i< array.length;i++){
            if(array[i].equals(valueToRemove)){
                continue;
            }
        anotherArray[k++]=array[i];
        }
        return anotherArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> newList = new ArrayList<String>();
        newList.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            // Compare current value to previous
            if (array[i - 1] != array[i]) {
                newList.add(array[i]);
            }
        }
        //to convert list to string array
        String[] strArray = newList.toArray(new String[0]);
        return  strArray;
    }
    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence
     * concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> newList = new ArrayList<String>();
        int count=0;
        newList.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            // Compare current value to previous
            String str=newList.get(count);
            if (str.contains((array[i]))) {
                newList.set(count,str+array[i]);
                //count++;
            }
            else{
                count++;
                newList.add(array[i]);
            }
        }
        //to convert list to string array
        return  newList.toArray(new String[0]);
    }
}
