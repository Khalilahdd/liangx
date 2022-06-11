package com.lianxi;
import java.util.*;

public class li {

        public static void main(String[] args) {
            Map map=new TreeMap(new MyComparator());
            map.put(2, "yellow");
            map.put(1, "red");
            map.put(3, "blue");
            Iterator iterator=map.keySet().iterator();
            while(iterator.hasNext()) {
                Object key=iterator.next();
                Object value=map.get(key);
                System.out.println(key+":"+value);
            }

        }

    }
    class MyComparator implements Comparator{
        public int compare(Object o1,Object o2) {
            Integer i1=(Integer) o1;
            Integer i2=(Integer) o2;
            return i2.compareTo(i1);
        }
    }
