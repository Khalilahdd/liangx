package com.lianxi;

import java.util.Scanner;

public class Triangle {

        private String color;
        private boolean filed;
        private double side1;
        private double side2;
        private double side3;

        Triangle() {

        }

    public Triangle(String color, boolean filed, double side1, double side2, double side3) {
        this.color = color;
        this.filed = filed;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
            return side1;
        }

        public double getSide2() {
            return side2;
        }

        public double getSide3() {
            return side3;
        }

        double getArea() {
            double p = (side1 + side2 + side3) / 2;
            return Math.sqrt(p * (p-side1)*(p-side2)*(p-side3));
        }

        double getPerimeter() {
            return side1 + side2 + side3;
        }

        @Override
        public String toString() {
            return "Triangle: \nside1 = " + side1 + "\nside2 = " + side2 + "\nside3 = " + side3 + "\narea: " + getArea() + "\nperimeter: " + getPerimeter();
        }


    public static void main(String[] args) {
        Triangle triangle = new Triangle("红色", true, 10, 20, 30);
        System.out.println("三角形的面积 = " + triangle.getArea());
        System.out.println("三角形的周长 = " + triangle.getPerimeter());

    }
}
