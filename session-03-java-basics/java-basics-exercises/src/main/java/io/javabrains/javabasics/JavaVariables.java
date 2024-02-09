package io.javabrains.javabasics;


public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
        int age =30;

        // long variable to store a long value
        long num = 3000099999L;
        // float variable to store a floating-point value
         float numFloat= 3.124F;

        // double variable to store a double value
        double doubleNum = 3.14;

        // char variable to store a single character
        char letter ='a';


        // boolean variable to store a boolean value
        boolean  isTrue = true;

        // String variable to store a string of characters
        String strName = "Hello William";


        // Step 2: Print the values of the variables to the console
        System.out.println("strName = " + strName);
        System.out.println("isTrue = " + isTrue);
        System.out.println("letter = " + letter);
        System.out.println("age = " + age);
        System.out.println("num = " + num);
        System.out.println("doubleNum = " + doubleNum);
        System.out.println("floatNum = " + numFloat);


        // Step 3: Modify the values of the variables and print the updated values
        age = age + 10;
        System.out.println("new age = " + age);
        double area = Math.pow(doubleNum, 2) * 3.14;
        System.out.println("area = " + area);


    }
}
