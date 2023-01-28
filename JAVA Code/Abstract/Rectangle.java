package com.learn.java.abstractclass;

public class Rectangle extends Geometry {
    private double width;
    private double height;

    public Rectangle() {
        width = 10;
        height = 10;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
