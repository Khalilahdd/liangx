package com.method;
//可变长参数
public class Demo4 {
    public static void main(String[] args) {
        //调用可变长参数的方法
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
    }

    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passes");
            return;
        }
        double result = numbers[0];

        //排序!
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }
}

/**{
        Demo4 demo4 = new Demo4();
        demo4.test(1,2,3,4,5,6);
    }
    //可变长参数必须放在最后
    public void test(int... i){
        System.out.println(i[0]);
    }
}*/
