package io.javabrains.javacollections.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student> {
    private String name;
    private int grade;

    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    // Implementing the compareTo method
    @Override
    public int compareTo(Student other) {
        // Ascending order
        return Integer.compare(this.grade, other.grade);

        // For descending order
//         return Integer.compare(other.grade, this.grade);
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 92));
        students.add(new Student("Bob", 88));
        students.add(new Student("Charlie", 88));
        students.add(new Student("Dave", 75));

        // Sorting the list of students
        Collections.sort(students);



        // Printing the sorted list of names
        for (Student student : students) {
            System.out.println(student.getName() + " : " + student.getGrade());
        }
    }
}
