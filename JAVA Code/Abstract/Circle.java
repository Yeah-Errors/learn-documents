package com.learn.java.abstractclass;

public class Circle extends Geometry {
    private double radius;
    private final double PI = 3.1415;

    public Circle() {
        super();
        radius = 10;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }
}
