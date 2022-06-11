package com.packer;
//无限循环
public class Main_39 {
    public static void main(String[] args) {
        increase(1);
    }
    static int increase(int x) {
        return increase(x) + 1;
    }
}
