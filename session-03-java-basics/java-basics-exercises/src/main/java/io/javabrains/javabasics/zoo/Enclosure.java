package io.javabrains.javabasics.zoo;

public class Enclosure {
    private Animal herbivore;
    private Animal carnivore;

    // Method to add an animal to the enclosure
    public void addAnimal(Animal animal) {
        if (animal instanceof Lions || animal instanceof Tigers || animal instanceof Bears) {
            if (herbivore == null && animal instanceof Bears) {
                herbivore = animal;
                System.out.println(animal.getName() + " added to the enclosure");
            } else if (carnivore == null && (animal instanceof Lions || animal instanceof Tigers)) {
                carnivore = animal;
                System.out.println(animal.getName() + " added to the enclosure");
            } else {
                System.out.println("Cannot add " + animal.getName() + " to the enclosure");
            }
        } else {
            System.out.println("Invalid animal type");
        }
    }

}
