package com.packer;

import java.util.Deque;
import java.util.LinkedList;

public class Main_40 {
    public static void main(String[] args) {
        String hex = toHex(12500);
        if(hex.equalsIgnoreCase("30D4")) {
            System.out.println("测试通过");
        }else {
            System.out.println("测试失败");
        }
    }
    static String toHex(int n) {
        Deque<String> deque = new LinkedList<>();
        String result = "";
        int remain = n;
        while(n < 16){
            remain = n % 16;
            deque.push(Integer.toHexString(remain));
            n /= 16;
        }
        deque.push(Integer.toHexString(n));
        while(!deque.isEmpty()){
            result += deque.pop();
        }
        return result;
    }
}
