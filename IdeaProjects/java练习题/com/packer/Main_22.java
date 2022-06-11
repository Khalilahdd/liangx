package com.packer;

import java.util.ArrayList;
import java.util.List;

public class Main_22 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add(null);
        list.add("pear");
        String second = list.get(1);
        System.out.println(second);
    }
}
