package io.javabrains.javabasics;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        int age = 28;
        double doubleNum = 3.14;

        // Step 2: Perform arithmetic operations
        double arityNumb = age * doubleNum;

        // Step 3: Print the results of the arithmetic operations
        System.out.println(arityNumb);

        // Step 4: Perform increment and decrement operations
        age++;
        doubleNum--;


        // Step 5: Print the results of the increment and decrement operations
        System.out.println("doubleNum = " + doubleNum);
        System.out.println("age = " + age);


        // Step 6: Perform comparison operations
        boolean isBigger = doubleNum > age;

        // Step 7: Print the results of the comparison operations
        System.out.println("isBigger = " + isBigger);


        // Step 8: Perform logical operations
        boolean isAGreater = arityNumb > doubleNum;
        boolean isEqual = isAGreater && isBigger;
        System.out.println("isEql: " + isEqual);


        // Step 9: Print the results of the logical operations


    }
}
