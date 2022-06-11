package com.packer;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main_32 {
    public static void main(String[] args) {
        Map<Student3, Integer> map = new TreeMap<>(new Comparator<Student3>() {
            @Override
            public int compare(Student3 o1, Student3 o2) {
                if(o1.score == o2.score) {
                    return  0;
                }
                return o1.score > o2.score ? -1 : 1;
            }
        });
        map.put(new Student3("Tom",77),1);
        map.put(new Student3("Bob",66),2);
        map.put(new Student3("Lily",99),3);
        for(Student3 key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println(map.get(new Student3("Bob", 66)));
    }
}
class Student3 {
    public String name;
    public int score;
    Student3(String name,int score) {
        this.name = name;
        this.score = score;
    }
    public String toString() {
        return String.format("{%s: score = %d}",name,score);
    }
}