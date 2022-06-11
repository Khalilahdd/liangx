package com.lianxi;

abstract class Shape {

    public abstract double getArea();

    public abstract double getPerimeter();
}


public class Geometric extends Shape{

    private String color;
    private String filed;
    private double radius;

    public Geometric() {

    }

    public void Circle(double radius) {
        this.radius = radius;
    }


    public Geometric(String color, String filed,double radius) {
        this.color = color;
        this.filed = filed;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public String getFiled() {
        return filed;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Geometric{" +
                "color='" + color + '\'' +
                ", filed='" + filed + '\'' +
                ", radius=" + radius +
                '}';
    }
}
