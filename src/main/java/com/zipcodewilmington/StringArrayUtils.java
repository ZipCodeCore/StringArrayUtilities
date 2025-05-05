package com.zipcodewilmington;

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
        int n=array.length;
        return array[n-1] ;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        int n=array.length;
        return array[n-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                break;

            }
        }
        return true;
    }


    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        //first way of reversing

        /*String [] reversedArray=new String[array.length];
        int count=0;
        for(int i= array.length-1; i >= 0 ; i--){
         reversedArray[count]=array[i];
                 count++;
        }*/
        //return reversedArray;
        // ArrayList<String> reversedArr = new ArrayList<String>();

        //second way of reversing
        ArrayList<String> easyArr= new ArrayList<String>(Arrays.asList(array));

         Collections.reverse(easyArr);
        String[] arr = new String[easyArr.size()];
        Integer[] m= new Integer[easyArr.size()];
        return  easyArr.toArray(arr);
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        /*ArrayList<String> easyArr = new ArrayList<String>(Arrays.asList(array));

        Collections.reverse(easyArr);
        String[] arr = new String[easyArr.size()];
        Integer[] m = new Integer[easyArr.size()];
        easyArr.toArray(arr);*/

        String[] arr = reverse(array);


        if(Arrays.equals(arr, array)) {
            return true;
        }

        if (arr.equals(array)){
            return true;
        }
        return false;
    }



    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        StringBuilder builder = new StringBuilder();
        for(String s : array) {
            builder.append(s);
        }
        String str = builder.toString();

        String letters="abcdefghijklmnopqrstuvwxyz";
        int c=0;
        for(int i=0;i<letters.length();i++){
            for(int j=0;j<str.length();j++){
              if(letters.charAt(i)==Character.toLowerCase(str.charAt(j)))
              {
                    c=c+1;
                    break;
               }
            }
        }
        if(c==26){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==value){
                counter=counter+1;
            }
        }
        System.out.println(counter);
        return counter;

    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int c=0;
        for(int i =0;i <array.length;i++){
            if(array[i]==valueToRemove){
                c=c+1;
            }
        }
        int m=array.length-c;

        String[]filteredArray=new String[m];
        int j=0;
        for(int i=0;i<array.length;i++){

            if(array[i]!=valueToRemove){
             filteredArray[j]=array[i];
             j++;
            }
        }

        return filteredArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        //counting consecutive duplicate elements
        int count=0;
        for(int i=0 ;i<array.length-1; i++){
            if (array[i]==array[i+1]){
                count++;
                System.out.println(count);
            }
        }
        //setting the length of unique array
        int m =(array.length)-count;

        String[]unique=new String[m];
        int j=0;
        unique[0]=array[0];
        System.out.println(unique[0]);
        for(int i=0;i<array.length-1;i++){

            if(array[i]!=array[i+1]) {
                unique[j+1]=array[i+1];
                System.out.println(unique[j]);
                j++;

            }

        }

        return unique;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        StringBuilder builder = new StringBuilder();
        for(String s : array) {
            builder.append(s);
        }
        String str = builder.toString();
        System.out.println(str);
        String packDup="";
        packDup=packDup+str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)==str.charAt(i)){
                packDup=packDup+str.charAt(i);
            }
            else{
                packDup=packDup+" "+str.charAt(i);
            }

        }
        String[] s=packDup.split(" ");



        return s;
    }


}
