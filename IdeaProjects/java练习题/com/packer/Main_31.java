package com.packer;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main_31 {
    public static void main(String[] args) {
        Map<Person12,Integer> map = new TreeMap<>(new Comparator<Person12>() {
            @Override
            public int compare(Person12 o1, Person12 o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        map.put(new Person12("Tom"),1);
        map.put(new Person12("Bob"),2);
        map.put(new Person12("Lily"),3);
        for(Person12 key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println(map.get(new Person12("Bob")));
    }
}
class Person12{
    public String name;
    Person12(String name) {
        this.name = name;
    }
    public String toString() {
        return "{Person:" + name + "}";
    }
}