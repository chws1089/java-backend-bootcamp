package io.javabrains.javabasics.Static;

public class Rectangle {
    private double width;
    private double height;

    private static int numOfRectangles =0;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        numOfRectangles++;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return (height + width)*2;
    }

    public static int getNumOfRectangles() {
        return numOfRectangles;
    }
}
