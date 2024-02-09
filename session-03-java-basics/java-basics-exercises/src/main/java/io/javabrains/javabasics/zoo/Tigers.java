package io.javabrains.javabasics.zoo;

public class Tigers extends Animal {
    public Tigers(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void feed() {
        System.out.println(getName() + " eat deer");
    }

}
