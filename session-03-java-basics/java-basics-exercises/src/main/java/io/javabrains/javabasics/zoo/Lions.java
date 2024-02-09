package io.javabrains.javabasics.zoo;

 class Lions extends Animal {
     public Lions(String name, double weight, int age) {
         super(name, weight, age);
     }

     @Override
    public void feed() {
        System.out.println(getName() + " eat chicken");
    }
}
