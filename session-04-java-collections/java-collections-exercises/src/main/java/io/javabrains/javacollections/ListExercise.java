package io.javabrains.javacollections;

/*
Initialize an ArrayList, set the value to a few integers
Then write code to find the sum of all integers
 */

import java.util.*;

public class ListExercise {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i< 11; i++)
            numbers.add(i);

        System.out.println("numbers = " + numbers);

        Collections.reverse(numbers);

        List<Integer> numbers2 = new ArrayList<>(numbers);
//        numbers2.add(30);
        System.out.println(numbers2);
        System.out.println(numbers==numbers2);
//        numbers2.addAll(10, numbers);
//        System.out.println(numbers);
        int sum = 0;
        for (int i=0;i<numbers2.size();i++)
            sum += numbers2.get(i);
        System.out.println(numbers2);
        System.out.println(sum);
        List<Integer> subNum = numbers2.subList(5,10);
        numbers2.subList(5,10).clear();
        System.out.println(numbers2);

//        Set<Integer> persons = new HashSet<>();
        Collection<Integer> persons = new HashSet<>();

        persons.add(1);
        persons.add(2);
        persons.add(1);
        System.out.println(persons);


    }

}
