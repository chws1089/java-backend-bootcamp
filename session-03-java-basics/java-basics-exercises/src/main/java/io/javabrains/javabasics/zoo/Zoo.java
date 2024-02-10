package io.javabrains.javabasics.zoo;

import java.util.*;

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

        Map<Integer, String> map = new HashMap();
        map.put(1,"hello");
        map.put(2,"world");
        System.out.println(map.get(1));
        System.out.println("map.size() = " + map.size());
        map.remove(1);
        System.out.println(map);

        List<String> strings = new ArrayList<>();
        strings.add("wello");
        strings.add("horld");
        System.out.println(strings.get(1));
        String[] myArray = strings.toArray(new String[strings.size()]);
        System.out.println(myArray[0]);
        System.out.println(strings.equals(myArray));

        Set<Integer> sets = new HashSet<>();
        sets.add(1);
        sets.add(2);
        sets.add(1);

        System.out.println(sets.contains(2));
        strings.stream().sorted();
        System.out.println(strings);

//        Collection<String>



    }
}
