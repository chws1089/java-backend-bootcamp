package io.javabrains.javabasics.Inheritance;

class Dog extends Animal {
    // Member variable for breed
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Override makeSound method
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}
