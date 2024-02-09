package io.javabrains.javabasics.Static;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */

public class StaticChallenge {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5.0, 4.0);
        Rectangle rectangle2 = new Rectangle(3.0, 6.0);
        Rectangle rectangle3 = new Rectangle(7.0, 2.0);
        Rectangle rectangle4 = new Rectangle(3.0, 6.0);
        Rectangle rectangle5 = new Rectangle(7.0, 2.0);

        double area = rectangle1.getArea();
        int nums = Rectangle.getNumOfRectangles();
        double perimeter = rectangle1.getPerimeter();
        System.out.println("perimeter = " + perimeter);
        System.out.println("nums = " + nums);
        System.out.println("area = " + area);

        Rectangle rectangle6 = new Rectangle(3.0, 6.0);
        Rectangle rectangle7 = new Rectangle(7.0, 2.0);

        // Retrieve the updated number of rectangles
        nums = Rectangle.getNumOfRectangles();
        System.out.println("nums = " + nums);


    }
}
