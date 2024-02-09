package io.javabrains.javabasics.ParentAndChildClass;

import org.w3c.dom.ls.LSOutput;

public class ChildClass extends ParentClass {
   @Override
    public int add(int a, int b) {
        return a * b;
    }

    public void multiply() {
        System.out.println("test" );
    }

    static class NestClass {
       public double add(double a, double b) {
           return a * b;
       }
    }

    class NestClass2 {
        public double add(double a, double b) {
            return a / b;
        }
    }

}
