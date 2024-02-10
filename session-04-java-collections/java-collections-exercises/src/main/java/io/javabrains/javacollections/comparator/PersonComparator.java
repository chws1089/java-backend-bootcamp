package io.javabrains.javacollections.comparator;

// Assuming Person class is in a different package, based on your import statement.
// If not, adjust accordingly.
import io.javabrains.javacollections.equal.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class PersonComparator {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Elice", 62));
        persons.add(new Person("Rob", 38));
        persons.add(new Person("Lharlie", 48));
        persons.add(new Person("Wave", 35));

        // Assuming Person class implements Comparable for this to work
         Collections.sort(persons);
        for (Person person : persons) {
            System.out.println(person.getName() + ": " + person.getAge());
        }
        System.out.println();

        // Sorting the list of persons by name using the PersonNameComparator
        PersonNameComparator nameComparator = new PersonNameComparator();
        Collections.sort(persons, nameComparator); // Corrected the use of nameComparator

        for (Person person : persons) {
            System.out.println(person.getName() + ": " + person.getAge());
        }
    }
}

