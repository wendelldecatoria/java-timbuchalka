package com.timbuchalka.reversed.array.challenge;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args){
        // Di ko ma gets ang challenge
        // Write a method called reverse() with an int array as parameter
        // the method should not return any value. In other words, the method is allowed to modify the array parameter
        // in main() test the reverse() method and print the array both reversed and non-reversed.
        // to reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on
        // For example, if the array is {1,2,3,4,5}, then the reversed array is {5,4,3,2,1}.


    }

    public static void reverse(Integer[] array){

        Integer[] sortedArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        // Sorting int Array in descending order
        Arrays.sort(sortedArray, Collections.reverseOrder());

    }
}
