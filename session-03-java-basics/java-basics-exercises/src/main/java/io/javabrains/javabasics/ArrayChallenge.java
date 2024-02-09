package io.javabrains.javabasics;

import java.util.Arrays;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int[] numbers = {10,20,304,5006, 30, 35};

        int sum=0;
        double average;
        int largest = numbers[0];



        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        for (int i =0; i< numbers.length;i++) {
            sum += numbers[i];

            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }

        average = (double) sum/numbers.length;
        System.out.println("largest = " + largest);
        System.out.println("average = " + average);
        System.out.println("sum = " + sum);
        
        int[] myArray = new int[100];
        for (int i = 0; i<myArray.length;i++)
             myArray[i] = (i+1) ;

        System.out.println("myArray = " + Arrays.stream(myArray).sum());
        
        int[] myArray2 = new int[5];
        System.arraycopy(myArray, 10, myArray2, 0, 3); // copy 3 elements from loc 10
        for (int element: myArray2)
            System.out.println("element = " + element);

        Arrays.sort(myArray2);
        for (int element: myArray2)
            System.out.println("element = " + element);



    }
}
