package io.javabrains.javacollections.comparator;

import io.javabrains.javacollections.equal.Person;

import java.util.Comparator;

// Comparator to compare Person objects by their name
public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}