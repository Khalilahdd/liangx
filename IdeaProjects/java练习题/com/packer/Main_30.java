package com.packer;
/**String类型是默认按字母排序的,所以输出顺序是apple、orange、pear*/
import java.util.Map;
import java.util.TreeMap;

public class Main_30 {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("orange",1);
        map.put("apple",2);
        map.put("pear",3);
        for(String key : map.keySet()) {
            System.out.println(key);
        }
    }
}
