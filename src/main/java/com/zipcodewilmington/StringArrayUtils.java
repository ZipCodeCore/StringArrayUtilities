package com.zipcodewilmington;

import com.sun.deploy.util.ArrayUtil;

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

        return array[array.length -1];
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
        boolean flag = false;
        for(int i =0; i < array.length; i++){
            if (value.equals(array[i])){
                flag =true;
            }
        }
        return flag;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
       String [] reverseArray = new String[array.length];
       int count =array.length -1;
       for (int i = 0; i< array.length; i++){
           reverseArray[count] = array[i];
           count--;
       }
       return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int count = array.length -1;
        for(int i =0; i < array.length /2;i++){
            if(array[i] != array[count]){
            return false;
            }
            count--;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String inputArrayString = Arrays.toString(array);
        String correctedInputArrayString = inputArrayString.toUpperCase();

        boolean []letterCheck = new boolean[26];
        Arrays.fill(letterCheck,false);

        int indexAlph = 0;
        for(int i =0 ; i < correctedInputArrayString.length(); i++){
            if ('A' <= correctedInputArrayString.charAt(i) && correctedInputArrayString.charAt(i) <= 'Z') {
                indexAlph = correctedInputArrayString.charAt(i) - 'A';
                letterCheck[indexAlph] = true;
            }
        }
        for(int i =0; i < letterCheck.length;i++){
            if(!letterCheck[i]){
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
        int count =0;
        for(int i =0; i<array.length;i++){
            if (value.equals(array[i])){
                count++;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        ArrayList<String> cleanedArrayList = new ArrayList<String>();
        for(int i =0; i < array.length; i++){
            if(array[i]!= valueToRemove){
                cleanedArrayList.add(array[i]);
            }
        }
        String [] cleanedArray = new String[cleanedArrayList.size()];
        for(int i = 0; i < cleanedArray.length;i++){
            cleanedArray[i] = cleanedArrayList.get(i);
            System.out.println(cleanedArray[i]);
        }
      return cleanedArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> list = new ArrayList<String>();
        list.add(array[0]);
        for (int i =1; i<array.length;i++){
            if(!array[i].equals(array[i-1])){
                list.add(array[i]);
            }
        }
        String[] returnArr = new String[list.size()];
        for(int i =0; i<list.size();i++){
            returnArr[i] = list.get(i);
        }
        return returnArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        //Why did I do this?????????
        String newString = Arrays.toString(array);
        String commaRemovedString = Arrays.toString(ArrayUtil.arrayToString(array).split(","));
        String commaSpaceRemovedString = commaRemovedString.replace(" ","");
        String newCommaSpaceRemovedString = commaSpaceRemovedString.substring(1,commaSpaceRemovedString.length()-1);
        StringBuffer sb = new StringBuffer(newCommaSpaceRemovedString);
        String space = " ";

        for(int i =0; i < sb.length()-1;i++){
            if (sb.charAt(i) != sb.charAt(i+1)){
                if(!(sb.charAt(i) == ' ')){
                    sb.insert(i+1,space);
                }
                System.out.println("Current char " +sb.charAt(i));
                System.out.println(sb.toString());
                System.out.println("i equals : " +i);
                System.out.println();
            }
        }
        String returnString = sb.toString();
        String[] returnArray = returnString.split(" ");
        return returnArray;
    }


}
