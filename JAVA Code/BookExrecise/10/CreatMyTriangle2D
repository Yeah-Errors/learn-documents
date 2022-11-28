package com.book.text;

public class CreatMyTriangle2D {
    public static void main(String[] args) {
        Triangle2D x = new Triangle2D(new MyPoint(2, 3), new MyPoint(2, 6), new MyPoint(6, 6));
        System.out.println(x.getPerimeter());
        System.out.println(x.getArea());
        System.out.println(Triangle2D.contains(x, new MyPoint(2, 3)));
    }
}

class MyPoint {
    private final double x;
    private final double y;

    public MyPoint() {
        x = y = 0.0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double getDistance(MyPoint a, MyPoint b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public String toString() {
        return String.format("(%.2f,%.2f)", x, y);
    }
}

class Triangle2D {
    private final MyPoint a;
    private final MyPoint b;
    private final MyPoint c;

    public Triangle2D() {
        a = new MyPoint(0, 0);
        b = new MyPoint(1, 1);
        c = new MyPoint(2, 5);
    }

    public Triangle2D(MyPoint a, MyPoint b, MyPoint c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        return MyPoint.getDistance(a, b) + MyPoint.getDistance(a, c) + MyPoint.getDistance(b, c);
    }

    public static double getPerimeter(MyPoint a, MyPoint b, MyPoint c) {
        return MyPoint.getDistance(a, b) + MyPoint.getDistance(a, c) + MyPoint.getDistance(b, c);
    }

    public double getArea() {
        double p = getPerimeter() / 2.0;
        return Math.sqrt(p * (p - MyPoint.getDistance(a, b)) * (p - MyPoint.getDistance(a, c)) * (p - MyPoint.getDistance(b, c)));
    }

    public static double getArea(MyPoint a, MyPoint b, MyPoint c) {
        double p = getPerimeter(a, b, c) / 2.0;
        return Math.sqrt(p * (p - MyPoint.getDistance(a, b)) * (p - MyPoint.getDistance(a, c)) * (p - MyPoint.getDistance(b, c)));
    }

    public boolean contains(MyPoint a) {
        double s1 = getArea(this.a, this.b, a);
        double s2 = getArea(this.a, this.c, a);
        double s3 = getArea(this.b, this.c, a);
        return s1 + s2 + s3 == getArea();
    }

    public static boolean contains(Triangle2D a, MyPoint b) {
        double s1 = getArea(a.a, a.b, b);
        double s2 = getArea(a.a, a.c, b);
        double s3 = getArea(a.b, a.c, b);
        return s1 + s2 + s3 == a.getArea();
    }

}
