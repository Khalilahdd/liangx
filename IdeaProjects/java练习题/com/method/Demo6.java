package com.method;

public class Demo6 {
    public static void main(String[] args) {
        System.out.println(5);
    }
    public static int f(int n){

        if(n == 1){
            return 1;
        }else{
            return n * f(n - 1);
        }
    }
}
