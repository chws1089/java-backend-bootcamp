package io.javabrains.javabasics.zoo;

public class Zoo {
    public static void main(String[] args) {
        // Creating animals
        Lions lion = new Lions("Simba", 150, 5);

        Tigers tiger = new Tigers("Shera", 180, 6);
        Bears bear = new Bears("Baloo", 200, 8);

        // Creating enclosure
        Enclosure enclosure = new Enclosure();

        // Adding animals to the enclosure
        enclosure.addAnimal(lion); // Adding lion (carnivore)
        enclosure.addAnimal(tiger); // Adding tiger (carnivore)
        enclosure.addAnimal(bear); // Adding bear (herbivore)

        lion.feed();
        tiger.feed();
        bear.feed();

    }
}
