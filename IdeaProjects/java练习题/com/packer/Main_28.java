package com.packer;

import java.util.HashMap;
import java.util.Map;

public class Main_28 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("apple",123);
        map.put("pear",456);
        map.put("banana",789);
        for(String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
