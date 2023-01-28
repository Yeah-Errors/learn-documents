package com.learn.java.abstractclass;

public class AbstractClassMain {
    public static void main(String[] args) throws Exception {
        // Geometry geometry = new Geometry() ;
//        抽象类不能被用于直接创建对象
        Geometry circle1 = new Circle("blue", false, 5);
        Geometry circle2 = new Circle();
        Geometry rectangle1 = new Rectangle(6, 6);
        Geometry rectangle2 = new Rectangle(6, 6);
        rectangle1.setColor("red");
        rectangle2.setColor("black");
        Geometry[] geometries = {circle1, rectangle2, circle2, rectangle1};
        java.util.Arrays.sort(geometries);
        for (Geometry i : geometries) System.out.println(i);
        System.out.println(rectangle2.equals(rectangle1));
        System.out.println(rectangle2.compareTo(rectangle1));
        final int a;
        a = 10;
        System.out.println(a);

        //测试Rational类
        Rational r1 = new Rational(2, -6);
        Rational r2 = new Rational();
        System.out.println(r1);
        System.out.println(r1.multiply(r2));
    }
}