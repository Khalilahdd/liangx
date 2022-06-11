package com.lianxi;

public class GeometricTest {

    public static void main(String[] args) {

        Geometric geometric = new Geometric("红色", "填充",1);
        System.out.println("圆的颜色 = " + geometric.getColor());
        System.out.println("圆是否填充 = " + geometric.getFiled());
        System.out.println("圆的面积 = " + geometric.getArea());
        System.out.println("圆的周长 = " + geometric.getPerimeter());

    }
}
