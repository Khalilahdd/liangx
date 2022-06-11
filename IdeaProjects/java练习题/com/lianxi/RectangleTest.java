package com.lianxi;

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("矩形的面积 = " + rectangle.getArea());
        System.out.println("矩形的周长 = " + rectangle.getPerimeter());
    }

}
