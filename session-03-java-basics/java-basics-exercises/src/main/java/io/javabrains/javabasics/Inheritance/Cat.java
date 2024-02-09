package io.javabrains.javabasics.Inheritance;

class Cat extends Animal {
    // Member variable for number of lives
    private int lives;

    // Constructor
    public Cat(String name, int age, int lives) {
        super(name, age);
        this.lives = lives;
    }

    // Override makeSound method
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}
