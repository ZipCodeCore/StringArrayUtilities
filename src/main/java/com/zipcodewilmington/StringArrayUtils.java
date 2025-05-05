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
    public static String getFirstElement(String[] array)
    {
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

        return array[array.length -1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length -2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        boolean checkforValue = false;
        for (String str : array)
        {
            if (str.contains(value))
            {
                checkforValue = true;
                break;
            }

        }
    return checkforValue;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array)
    {
        int arraylength = array.length;
        String[] newArray = new String[arraylength];

        int j = 0;
        for ( int i= arraylength-1 ; i>=0 ; i--)
        {
            newArray[j] = array[i];
        j++;
        }

        return newArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        boolean isPalindrome = true;

        int arraylength = array.length;
        String[] newArray = new String[arraylength];
        newArray = reverse(array);

        //int j = 0;
        for ( int i= 0 ; i< arraylength ; i++)
        {
            if (! array[i].equalsIgnoreCase(newArray[i]) )
            {
                isPalindrome = false;
            }
        }

        return isPalindrome;


    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array)
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        boolean pan = true;

        String arrayString = "";
        for (String str : array)
        {
            arrayString += str ;
        }
        arrayString = arrayString.toLowerCase();
        for ( int i=0 ; i<26 ; i++)
        {
                if (!arrayString.contains(Character.toString(alphabet.charAt(i))))
                {
                    pan = false;
                }
        }
        return pan;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value)
    {
        int count = 0;
        for (String str : array)
        {
            if (str.equalsIgnoreCase(value)) count +=1;
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> newArrayList = new ArrayList<String>(); //arraylist

        int count =0;
        for (String str : array)
        {
            if (!str.equals(valueToRemove))
            {
                newArrayList.add(str);
                count += 1;
            }
        }
        String[] newArray =  newArrayList.toArray(new String[newArrayList.size()]); //arraylist to array

        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> newArrayList = new ArrayList<String>(); //arraylist

        int i = 0;
        int j = 0;
        for (String str : array)
        {
            if (j == array.length-1) // check for the last element in the array as it will give exception to access one item after the last
            {
                newArrayList.add(str);
            }
            else {
                if (str != array[j + 1])
                {
                    newArrayList.add(str);
                    i++;
                }
            }

        j+=1;
        }
        String[] newArray =  newArrayList.toArray(new String[newArrayList.size()]); //arraylist to array

        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array)
    {
        ArrayList<String> newArrayList = new ArrayList<String>(); //arraylist

        int j = 0;
        newArrayList.add(array[0]);
        String concatString;
        for(int i=1; i<array.length; i++)
        {

            if (array[i] == array[i-1])
            {
                concatString = newArrayList.get(j) + array[i];
                newArrayList.set(j,concatString );
            }
            else{
                j++;
                newArrayList.add(array[i]);
            }
        }

        String[] newArray =  newArrayList.toArray(new String[newArrayList.size()]); //arraylist to array

        return newArray;
    }



}

