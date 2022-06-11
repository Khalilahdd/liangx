package demo1.src;

import java.util.Scanner;

/**
 * 题目：某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
 */
public class li39 {
    public static void main(String[] args) {
        System.out.println("请输入一个4位整数： ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        encryprtion(num);
    }
    /**
     * 数字加密
     * @param num
     */
    private static void encryprtion(int num){
        char[] arr = (num + "").toCharArray();
        for(int i = 0;i < arr.length/2; i++){
            char temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        String cipherText = "";
        for(int i = 0;i < arr.length;i++){
            int temp = (arr[i] - '0' + 5) % 10;
            cipherText = cipherText + temp;
        }
        System.out.println("密文： " + cipherText);
    }
}
