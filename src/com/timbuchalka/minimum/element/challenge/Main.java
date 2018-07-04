package com.timbuchalka.minimum.element.challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        // Write a method called readIntegers() with parameter called count that represents how many integers the user needs to enter.
        // The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
        // Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array
        // in the main() method read the count from the console and call the method readIntegers() with the count parameter
        // Then call the findMin() method passing the array returned from the call to the readIntegers() method

        Integer[] array = readIntegers(5);
        System.out.println("Minimum value is " + findMin(array));

    }

    public static Integer[] readIntegers(Integer count){
        Integer[] array = new Integer[count];
        System.out.println("Enter " + count + " integer values.\r");

        for(int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();

        }
        return array;
    }

    public static Integer findMin(Integer[] array){
        Integer[] sortedArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        // Sorting int Array in descending order
        Arrays.sort(sortedArray);
        return sortedArray[0];
    }
}
