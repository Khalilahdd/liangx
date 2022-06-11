package com.packer;

import java.util.HashMap;
import java.util.Map;

public class Main_27 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("apple",123);
        map.put("pear",456);
        System.out.println(map.get("apple"));
        map.put("apple",789);
        System.out.println(map.get("apple"));
    }
}
