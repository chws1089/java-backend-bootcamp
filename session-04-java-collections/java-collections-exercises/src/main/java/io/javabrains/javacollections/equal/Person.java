package io.javabrains.javacollections.equal;

import java.util.Date;
import java.util.Objects;

public class Person implements  Comparable<Person> {


    private String name;
    private int age;
    private Date lastModifiedDate;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        Person other = (Person) o;
//        return  Objects.equals(name, other.name);
        return this.age == other.age
                &&  Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }

    @Override
    public int compareTo(Person other) {
        // Ascending order
        return Integer.compare(this.age, other.getAge());
    }

}
