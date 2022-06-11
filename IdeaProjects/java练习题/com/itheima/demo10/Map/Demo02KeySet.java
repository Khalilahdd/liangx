package com.itheima.demo10.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合的第一种遍历方式，通过键找值的方法
    Map集合中的方法：
        Set<K> keySet() 返回此映射中包含的键的 Set 视图
    实现步骤：
        1.使用Map集合中的方法keySet(),把Map集合所以的key取出来，存储到一个Set集合中
        2.遍历set集合，获取Map集合中的每一个key
        3.通过Map集合中的方法get(key)，通过key找到value
 */
public class Demo02KeySet {

    public static void main(String[] args) {
        //创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("迪丽热巴",165);
        map.put("林志玲",170);

        //1.使用Map集合中的方法keySet(),把Map集合所以的key取出来，存储到一个Set集合中
        Set<String> set = map.keySet();

        //2.遍历set集合，获取Map集合中的每一个key
        //使用迭代器遍历Set集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            //3.通过Map集合中的方法get(key)，通过key找到value
            Integer value = map.get(key);
            System.out.println("key:" + value);//key:170 key:168 key:165
        }
        System.out.println("===================");
        //使用增加for遍历Set集合
        for (String key: map.keySet()) {
            //3.通过Map集合中的方法get(key)，通过key找到value
            Integer value = map.get(key);
            System.out.println("key:" + value);
        }
    }

}
