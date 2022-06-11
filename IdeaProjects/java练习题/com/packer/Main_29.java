package com.packer;

import java.util.HashMap;
import java.util.Map;

public class Main_29 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("apple",123);
        map.put("pear",456);
        map.put("banana",789);
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
