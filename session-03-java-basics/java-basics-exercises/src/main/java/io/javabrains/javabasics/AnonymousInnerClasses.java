package io.javabrains.javabasics;

/*
Create a class `Animal2` with an abstract method `makeSound`.
Create an anonymous inner class implementation of `Animal2` and then call the `makeSound` method
 */

public class AnonymousInnerClasses {

    abstract class Animals2 {
        public abstract void makeSound();
    }

    public static void main(String[] args) {

        Animals2 animal = new AnonymousInnerClasses().new Animals2() {
            @Override
            public void makeSound() {
                System.out.println("making sound");
            }
        };

        // Call the makeSound method
        animal.makeSound();
    }
}


