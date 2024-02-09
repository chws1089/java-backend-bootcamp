package io.javabrains.javabasics.zoo;

public class Bears extends Animal {
    public Bears(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public void feed() {
        System.out.println(getName() + " eat honey");
    }
}
