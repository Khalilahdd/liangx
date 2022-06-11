package demo1.src;

import java.util.Scanner;

/**
 * 题目：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
 */
public class li30 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        stringLength(str);
    }
    /**
     * 输出字符串长度
     * @param str
     */
    private static void stringLength(String str){
        char[] arr = str.toCharArray();//.toCharArray()将字符串转换成字符数组
        System.out.println("字符串长度：" + arr.length);
    }
}
