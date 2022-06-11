package com.lianxi;

public class xiti2 {

    //创建主方法（程序入口）
    public static void main(String[] args) {
        //创建对象
        Triangle1 t1;
        try {
            //可能存在的异常语句
            t1 = new Triangle1(3,2,4);
        } catch (IllegalTriangleException e) {
            //抛出异常
            e.printStackTrace();
            System.out.println("不合法的三角形");
            return;
        }
        //输出语句
        System.out.println("side1=" + t1.side1 + ",side2=" + t1.side2 + ",side3=" + t1.side3);
    }

}

class Triangle1 {

    //定义三角形的三条边
    public double side1;
    public double side2;
    public double side3;

    //构造器
    public Triangle1(double side1,double side2,double side3) throws IllegalTriangleException {
        super();//调用父类的构造方法（也就是Exception异常中的构造方法）

        //进行判断是否满足成为三角形的条件
        if(side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            throw new IllegalTriangleException("不能构成三角形");
        }
        System.out.println("能构成三角形");
        //赋值
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
}

//异常处理
class IllegalTriangleException extends Exception {

    private static final long serialVersionUID = 1L;
    public IllegalTriangleException(){
        super();
    }
    public IllegalTriangleException (String message){

        super(message);

    }
}

