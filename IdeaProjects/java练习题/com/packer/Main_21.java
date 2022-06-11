package com.packer;
/**List接口允许我们添加重复的元素，就是List内部的元素可以重复*/
import java.util.ArrayList;
import java.util.List;

public class Main_21 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");//size = 1
        list.add("pear");//size = 2
        list.add("apple");//size = 3
        System.out.println(list.size());
    }
}
