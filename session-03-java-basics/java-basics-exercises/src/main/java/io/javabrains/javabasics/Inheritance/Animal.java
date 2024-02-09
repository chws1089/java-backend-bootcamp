package io.javabrains.javabasics.Inheritance;

class Animal {
    // Member variables
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void makeSound() {
        System.out.println("The animal makes a sound");
    }

}
