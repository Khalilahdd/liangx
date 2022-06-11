package com.Array;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int[][] array = {{1,2},{2,3},{3,4},{4,5}};
        printArray(array[0]);
    }
    //打印数组元素
    public static void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }
}
