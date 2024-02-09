package io.javabrains.javabasics.Inheritance;

/*

1.  Create an `Animal` class with member variables for the name and age of the animal and a constructor method that initializes the member variables.
2.  Create a `Dog` class that extends the `Animal` class and has a member variable for the breed of the dog and a constructor method that initializes the member variables.
3.  Override the `makeSound` method in the `Dog` class to print "The dog barks".
4.  Create a `Cat` class that extends the `Animal` class and has a member variable for the number of lives of the cat and a constructor method that initializes the member variables.
5.  Override the `makeSound` method in the `Cat` class to print "The cat meows".
6.  In the `main` method of this class, create an array of `Animal` objects and initialize it with a `Lion`, a `Dog`, a `Cat`, and another `Animal` of your choice.
7.  Loop through the array of `Animal` objects and print the name, age, and sound of each animal.
 */


public class InheritanceChallenge {

        public static void main(String[] args) {
            // Create an array of Animal objects
            Animal[] animals = new Animal[4];
            animals[0] = new Animal("Lion", 5);
            animals[1] = new Dog("Buddy", 3, "Golden Retriever");
            animals[2] = new Cat("Whiskers", 2, 9);
            animals[3] = new Animal("Elephant", 10);

            // Loop through the array and print details of each animal
            for (Animal animal : animals) {
                System.out.println("Name: " + animal.getName());
                System.out.println("Age: " + animal.getAge());
                animal.makeSound(); // Polymorphic method invocation
                System.out.println();
            }
        }
    }

