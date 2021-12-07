package com.zipcodewilmington;

import com.sun.tools.javac.util.ArrayUtils;
import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        // using index 0 to access first element
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        // using index 1 to access second element
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        // get length of array
        int lengthOfArray = array.length;

        // index is length of array - 1
        int lastIndex = lengthOfArray - 1;
        // return array at index
        return array[lastIndex];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        // get length of array
        int lengthOfArray = array.length;
        // correct index is lengthOfArray - 2
        int index = lengthOfArray - 2;
        // return array at index
        return array[index];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        // done using streams

        boolean contains = Arrays.stream(array).anyMatch(value::equals);

        return contains;











        ////        int count = 0;  // this counter IS NOT necessary. needs to return boolean value, not a count of something
//
//        // go through each word in array
//        for (String word : array) {
//            // check if word is the same as value
//            // if word == value
//            if (word == value) {
////                return true;    // this is unnecessary as well
//            }
//
//        }
//        return true;    // placing the return outside the loop
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {


        // declaring new String[] "result" and setting length
        String[] result = new String[array.length]; // with empty slots

        for (int i = 0; i < array.length; i++) {     // loop through array
            // we want to add to result, the current character at i. so, this is using index.
            // result.length is the length of the array. -i will correspond to i.
            // for example, if array is at index 2, then -i will be -2
            // this means that it will be the length of the array -2 (2 elements in from end)
            // so the first element goes to last spot in result, second to second to last spot, third to third to last, etc
            result[result.length - 1 - i] = array[i];

        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversed = reverse(array);       // just using above method to reverse String[] array
                                                  // creates a new reversed array
        if (Arrays.equals(reversed, array)) {     // arrays.equals is an array util to compare arrays (pass in arrays)
                                                  // if statement comparing both arrays using Arrays.equals
            return true;                          // return true if theyre equal
        }
        return false;                             // return false if not true.
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        // needs to return a boolean T/F statement

        String newString = Arrays.toString(array);  // converted array to string
                                                    // Arrays.toString util to make array into string

        if (newString.length() < 26) {              // if this string is less than 26, has to be false
                                                    // this is the obvious, if its less than 26 letters, its clearly false
            return false;                           // sometimes its best to knock out the obvious things first
        }                                           // this is placed above the loop, not a part of the below operation

        // created a new array with whole alphabet, so we can use it to compare
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < array.length; i++) {       // for loop to iterate through array
            if (!newString.contains(alphabet[i])) {    // if newString DOES NOT contain alphabet at element i
                                                       // this is basically the opposite if if it contains the letter return true
                                                       // doing it this way continues to rule out more cases
                return false;                          // return false
            }
        }
        return true;                                   // otherwise, return true
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        // declare variables we'll use, counter and i
        // wants us to return an int, so thats why we have counter variable
        Integer counter = 0;
        int i;                 // we could also simply declare and initializa the variable i in the first part of the for loop

        // set up for loop to start at i, end at the end of array, and i increases by one each time
        for (i = 0; i < array.length; i++) {
            // set up if statement to compare if value equals the element each time
            if (value.equals(array[i])) {
                // increase counter by one if value and array[i] are the same
                counter = counter + 1;
            }

        }
        // return the final count -- this is returned OUTSIDE the loop
        // returning this inside the loop will not work because as soon as it returns the loop stops
        // ie it would stop looping after the first loop
        return counter;


    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {   //////

        // with lists you dont have to declare a size, they can grow and shrink as needed
        // https://www.dummies.com/programming/java/use-array-lists-in-java/
        // List<type of elements> nameOfList = new ArrayList<>(); is the general syntax for creation

        List<String> stringList = new ArrayList<String>();

        for (int i = 0; i < array.length; i++) {                 // for loop to loop through array
            if (!array[i].equals(valueToRemove)) {               // if array at i is NOT the same as the valueToRemove
                stringList.add(array[i]);                        // if so, then add array of i to our stringList
            }

        }
        return stringList.toArray(new String[0]);               // return our stringList, (new String[0]) is signifying...
                                                                // that it will be a String array
                                                                // we want to return a String[]


    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
       List<String> result = new ArrayList<String>();                        // created new list named result --  its always...
                                                                        // easier to use a list

        for (int i = 0; i < array.length - 1; i++) {                    // for loop set up
            if (!array[i].equals(array[i + 1])) {                       // if theyre do not equal, throw that element into...
                                                                        // our result list that we created
                result.add(array[i]);                                   // list.add(value); is the general syntax to add value to list
            }
        }

                 // https://www.geeksforgeeks.org/list-get-method-in-java-with-examples/
                 // this link is for the .get method seen below
        if (!array[array.length - 1].equals(result.get(result.size() - 1))) {   // if array at last index is the same as the last...
                                                                                // element in the list
            result.add(array[array.length - 1]);                                // add to our result list the last element
        }
        return result.toArray(new String[0]);                            // https://www.javatpoint.com/java-list-toarray-method


    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {



        // string to hold the position at 1
        String duplicates = array[0];

        for (int i = 1; i < array.length; i++) {
            // if we are going through the array and we encounter a letter that is the same to letter before
            if (array[i].equals(array[i - 1])) {
                duplicates = duplicates + array[i];
            } else {
                duplicates = duplicates + " " + array[i];
            }
            System.out.println("duplicate " + duplicates);
        }
        return duplicates.split(" ");



        // made a String placeholder
        // loop through array
        // if array[i] equals array[i-1]
        // append array[i] to duplicates placeholder String
        // otherwise if not equal add to duplicates String but with a space between
        // so all duplicates will be listed 'aaa' or 'bb' with no spaces
        // take duplicates String and .split on those spaces to create an array
    }


}
