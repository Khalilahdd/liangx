//package com.packer;
///**List和Array转换
// * 第一种是调用 toArray()方法直接返回一个Object[]数组
// * 第二种方式是给toArray(T[])传入一个类型相同的Array，List内部自动把元素复制到传入的Array
// * */
//import java.util.List;
//
//public class Main_25 {
//    public static void main(String[] args) {
//       /* List<String> list = List.of("apple","pear","banana");
//        Object[] array = list.toArray();
//        for(Object s : array) {
//            System.out.println(s);*/
//       List<Integer> list = List.of(12,34,56);
//       Integer[] array = list.toArray(new Integer[3]);
//       for(Integer n : array) {
//           System.out.println(n);
//       }
//    }
//}
