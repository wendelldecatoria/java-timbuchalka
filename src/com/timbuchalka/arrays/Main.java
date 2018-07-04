package com.timbuchalka.arrays;

import java.util.Arrays;

import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[]  args){

        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        Integer[] myIntegers = getInteger(5);

//        for(int i=0; i<myIntegers.length; i++) {
//            System.out.println("Element " + i + ", typed value  was " + myIntegers[i]);
//        }

        Integer[] sorted = sortInteger(myIntegers);
        printArray(sorted);
    }

    public static Integer[] getInteger(int capacity){

        Integer[] array = new Integer[capacity];
        System.out.println("Enter " + capacity + " integer values.\r");

        for(int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();

        }

        return array;
    }

    public static void printArray(Integer[] array){
        for(int i=0; i<array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static Integer[] sortInteger(Integer[] array) {

        Integer[] sortedArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        // Tim Buchalka's solution
//        boolean flag = true;
//        int temp;
//        while (flag) {
//            flag = false;
//            for (int i = 0; i < sortedArray.length - 1; i++) {
//                if (sortedArray[i] < sortedArray[i + 1]) {
//                    temp = sortedArray[i];
//                    sortedArray[i] = sortedArray[i + 1];
//                    sortedArray[i + 1] = temp;
//                    flag = true;
//                }
//            }
//        }

//        return sortedArray;

        // Sorting int Array in descending order
        Arrays.sort(sortedArray, Collections.reverseOrder());

        return sortedArray;

    }

}


