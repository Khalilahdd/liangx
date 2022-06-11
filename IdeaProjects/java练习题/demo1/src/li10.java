package demo1.src;

import java.util.Scanner;

public class li10 {
    public static void main(String[] args) {
        System.out.println("请选择第几次落地：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        sumLength(n);
    }
    public static void sumLength(int n) {
        double height = 100;
        double sumLength = 0;
        for(int i = 1;i <= n;i++) {
            if(i == 1){
                sumLength = sumLength + height;
            }else {
                sumLength = sumLength + height*2;
        }
            height = height / 2;
        }
        System.out.println("总运动距离为：" + sumLength);
        System.out.println("反弹高度为：" + height);
    }
}
