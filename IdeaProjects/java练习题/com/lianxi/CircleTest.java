package com.lianxi;

import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入半径:");
        double r1 = scanner.nextDouble();

        Circle circle = new Circle(r1);

        System.out.println("半径 = " + circle.getRadius());
        System.out.println("面积 =" + circle.getArea());
        System.out.println("周长 = " + circle.getPerimeter());
    }
}
