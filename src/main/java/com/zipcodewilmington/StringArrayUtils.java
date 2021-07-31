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
        String lastone = array[array.length-1];
        return lastone;


    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        String secLast = array[array.length - 2];
        return secLast;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for (int i = 0; i < array.length; i++) {
          if (array[i] == value) {
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


        List<String> list = Arrays.asList(array);
        Collections.reverse(list);
        String[] reversedList = list.toArray(array);
        return reversedList;


    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - (i + 1)]) {
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

        String[] abc = "abcdefghijklmnopqrstuvwxyz ,".split("");
        String arrString = Arrays.toString(array).toLowerCase();

        for (String letra : abc){
            if (!arrString.contains(letra))
                return false;
        }
        return true;

    }

//        ArrayList<String> StringOfArrays = new ArrayList<String>(Arrays.asList(array));
//        String newString = StringOfArrays.toString().toLowerCase();
//        String abc = "abcdefghigklmnopqrstuvwxyz";
//        for (int i = 0; i < abc.length(); i++) {
//
//            if (newString.indexOf(abc.charAt(i)) == -1) {
//                return false;
//            }
//        }
//        return true;



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
            //return 0;
        }
        return count;


    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        String[] newArray = new String[array.length - 1];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                newArray[count] = array[i];
                count++;
            }
        }

        return newArray;
    }


//-----------------------THIS ALSO WORKS BUT ITS WITH LIST------------------------------------------

//        List<String> listArr = new ArrayList<String>(Arrays.asList(array));
//        listArr.remove(valueToRemove);
//
//        String[] newArray = new String[listArr.size()]; //passing content to array
//        newArray = listArr.toArray(newArray);
//
//        return newArray;




    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

     ArrayList<String> newList = new ArrayList<String>();
      newList.add(array[0]);

  for (int i = 1; i < array.length; i ++ ){
   if(array[i] != array[ i- 1]){

       newList.add(array[i]);
     }
   }
        return newList.toArray(new String[newList.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        //ArrayList<String> newList = new ArrayList<String>();
        int length = array.length;
        int current = 0; // THE LAST INDEX
        ArrayList<String> newList = new ArrayList<String>();
        newList.add(array[0]);

        for (int i = 1; i < array.length; i++) {
            if (newList.get(current).contains(array[i])) { // used .contains Insted of .charAt() cuz aa != a
                newList.set(current, (newList.get(current) + array[i]));
            } else {
                current++;
                newList.add(array[i]);
            }


        }
        return newList.toArray(new String[0]);

    }

    }

//  return newList.toArray(new String[0]);






