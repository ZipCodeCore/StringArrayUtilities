package com.zipcodewilmington;

import com.sun.media.jfxmedia.logging.Logger;
import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        String response = "";

        if (array != null && array.length > 0){
            response = String.valueOf(array[0]);
        } else {
            response = "Not a valid array!";
        }
        return response;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        String response = "";

        if (array != null && array.length > 0){
            response = String.valueOf(array[1]);
        } else {
            response = "Not a valid array!";
        }
        return response;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        String response = "";

        if (array != null && array.length > 0){
            response = String.valueOf(array[array.length - 1]);
        } else {
            response = "Not a valid array!";
        }
        return response;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String response = "";

        if (array != null && array.length > 1){
            response = String.valueOf(array[array.length - 2]);
        } else {
            response = "Not a valid array!";
        }
        return response;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean answer = false;

        for (String sName : array) {
            answer = sName.equals(value);
            if (answer = true) break;
        }

        return answer;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String [] newArray = new String[array.length];
        int arrayCounter = 0;

        for (int i = array.length; i>=1; i--){
            newArray[arrayCounter] = array[i-1];
            arrayCounter ++ ;
        }
        return newArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean isPali = true;
        int counter = array.length-1;

        String [] newArray = new String[array.length];

        // store the reversed array in a new array and compare
        for (String sValue : array){
            newArray[counter] = sValue;
            counter--;
        }

        for (int i = 0; i < newArray.length; i++){
            if (newArray[i] != array[i]) isPali = false;
        }
        // Arrays.toString(newArray).equals(Arrays.toString(array));
        return isPali;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        int counter = 0;
        String strPhrase = "";
        boolean result = true;
        boolean [] foundValues = new boolean[26];

        // store passed array in a string (lower case)
        for (String sValue : array){
            strPhrase += sValue.toLowerCase();
        }

        // compare with each character between a and z and add to a specific place in array
        for (int i = 0; i < strPhrase.length(); i++) {
            if ('a' <= strPhrase.charAt(i) && strPhrase.charAt(i) <= 'z') {
                foundValues[strPhrase.charAt(i) - 'a'] = true;
            }
        }

        // check all values are true (found all letters in expression)
        for (boolean bValue : foundValues){
            if (bValue != true) result = false;
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences (String[] array, String value) {
        int nrOccurances = 0;

        for (String sName : array) {
            if (sName.equals(value)) nrOccurances++;
        }
        return nrOccurances;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> strValues = new ArrayList<String>(0);
        String [] result = new String[array.length - 1];

        for (String sValue : array){
            strValues.add(sValue);
        }

        for (int i = 0; i < strValues.size(); i++){
            if (valueToRemove.equals(strValues.get(i))){
                strValues.remove(i);
            }
        }

        for (int i = 0; i < strValues.size(); i++){
            result[i] = strValues.get(i);
        }


        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> alistArray = new ArrayList<String>(0);
        String [] result;
        String strTemp = "";
        int [] intToRemove = new int [array.length];
        Iterator<String> intIterator = alistArray.iterator();

        // add array elements to a list
        for (String sValue : array){
            alistArray.add(sValue);
        }

        // store the indexes of the duplicates
        for (int i = 0; i < alistArray.size(); i++){
            strTemp = alistArray.get(i);
            if (i != alistArray.size() - 1) {
                for (int x = 0; x < alistArray.size(); x++) {
                    if (strTemp.equals(alistArray.get(x)) && (x > i && x == i+1)) {
                        intToRemove[x] = x;
                    }
                }
            }
        }

       for (int i = intToRemove.length -1; i > 0; i--){
            if (intToRemove[i] != 0){
                alistArray.remove(intToRemove[i]);
            }
        }

        // add remaining values to the array
        result = new String[alistArray.size()];
        result = alistArray.toArray(result);

        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> slistArray = new ArrayList<String>(0);
        String [] result;
        String sTemp = "";
        int counter = 0;
        int i = 0;
        boolean bTrigger = false;

        while (i < array.length){
            if (i != (array.length - 1) && array[i].equals(array[i+1])){
                sTemp += array[i];
                counter ++;
                bTrigger = true;
            } else if (counter !=0){
                if (bTrigger && counter >= 1){
                    sTemp += array[i-1];
                }
                slistArray.add(sTemp);
                sTemp = "";
                counter = 0;
                bTrigger = false;
            } else {
                slistArray.add(array[i]);
            }
            i++;
        }

        result = new String[slistArray.size()];
        result = slistArray.toArray(result);

        return result;
    }


}

