package io.javabrains.javacollections.iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Obtain an iterator for the list
        Iterator<Integer> iterator = numbers.iterator();

        // Loop through the list using the iterator
        System.out.println("List elements:");
        while (iterator.hasNext()) {
            // Get the next element from the iterator
            Integer number = iterator.next();

            // Print the current element
            System.out.println(number);

            // Example condition to remove an element
            // Let's remove the number 3 from the list
            if (number.equals(3)) {
                // Remove the current element from the list
                iterator.remove();
            }
        }

        // Print the list after removal to see the result
        System.out.println("\nList after removing 3:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

    }
}
