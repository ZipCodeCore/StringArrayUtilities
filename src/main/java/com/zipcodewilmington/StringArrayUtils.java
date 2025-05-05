package com.zipcodewilmington;


import java.lang.reflect.Array;
import java.util.*;

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
        String lastElement = array[array.length - 1];
        return lastElement;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String secondToLastElement = array[array.length - 2];
        return secondToLastElement;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public   static boolean contains(String[] array, String value) {
        for (int i = 0; i < value.length(); i++){
        if(array[i] == value);
        }
        return true;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        List<String> list = Arrays.asList(array);
        Collections.reverse(list);
        String[] reverseList = list.toArray(array);
        return reverseList;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO

    //identify midpoint of an array
    //identify last index
    //for loop

    public static boolean isPalindromic(String[] array) {
        List<String> list = Arrays.asList(array.clone());
        Collections.reverse(list);
        String[] reverseArray = list.toArray(new String[array.length]);
        for (int i = 0; i < reverseArray.length; i++) {
            String thisString = reverseArray[i];
            String thisOtherString = array[i];
            if (!thisString.equals(thisOtherString)) {
                return false;
            }
        }
        return true;
    }


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        /* convert array of string to one string
        nested for loop with original string on outside and alphabet on inside
        every time they match copy that to a new array
        remove duplicates
        if that array matches array of the alphabet
        return true
         */
        ArrayList<String> stringOfArrays = new ArrayList<String>(Arrays.asList(array));
        String newString = stringOfArrays.toString().toLowerCase();
      String aBCS = "abcdefghijklmnopqrstuvwxyz";
      for (int i = 0; i < aBCS.length(); i++){
               if (newString.indexOf(aBCS.charAt(i)) == -1 ){
                   return false;
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
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
         if (value.equals(array[i]))
             counter++;
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> list = new ArrayList<String>(Arrays.asList(array));
        list.remove(valueToRemove);
        array = list.toArray(new String[0]);
        return array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

      ArrayList<String> newArrayList = new ArrayList<String>();
      newArrayList.add(array[0]);
        for (int i = 1; i < array.length; i++){
            if(array[i] != array[i - 1]){
                newArrayList.add(array[i]);
            }

        }


    return newArrayList.toArray(new String[newArrayList.size()]);

    }



    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate
     * occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
// iterate through array with for loop counter
// identify if character in string is the same as the next character
// if they are same, concatenate
//add concatenation to new string array

        /*   StringBuilder stringBuilder = new StringBuilder(arrayToString.charAt(i)).append(arrayToString.charAt(i+1));
                if(stringBuilder.lastIndexOf())
               String newString = stringBuilder.toString();
             String[] stringWithSpaces =  newString.split(" ");
             array = stringWithSpaces;*/
        ArrayList<String> list = new ArrayList<String>();
        list.add(array[0]);
        int counter = 0;
        for (int i = 1; i < array.length; i++) {
        if(list.get(counter).contains(array[i])){
            list.set(counter, list.get(counter) + array[i]);

        }else{
            counter++;
            list.add(array[i]);
        }
            }
        return list.toArray(new String[0]);
    }
}
