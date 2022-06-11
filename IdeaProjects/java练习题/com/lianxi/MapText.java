package com.lianxi;

import java.util.*;

public class MapText {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("AA", 100);
        map.put("BB", 80);
        map.put("CC", 90);
        map.put("DD", 90);
        map.put("EE", 93);
        map.put("WW", 93);
        map.put("HH", 95);
        map.put("DD", 90);

        // 通过.entrySet()的方法把Map类型的转化为Set集合  
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        // 把Set集合转化为List集合  
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(entrySet);

        for (Map.Entry<String, Integer> temp : list)
            System.out.println(temp);// 未排序的结果  
        System.out.println("--------------------");

        // 通过Collections.sort排序  
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }

        });

        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i).getKey());
        }
    }
}
