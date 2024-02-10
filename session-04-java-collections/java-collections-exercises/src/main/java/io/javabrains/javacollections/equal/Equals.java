package io.javabrains.javacollections.equal;

public class Equals {
    public static void main(String[] args) {
    Person person1 = new Person("name1", 28);
    Person person2 = new Person("name1", 28);
    boolean isTheSame =person1.equals(person2);
        System.out.println(isTheSame);

        boolean isHashSame = person1.hashCode() == person2.hashCode();
        System.out.println(isHashSame);
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }

}
