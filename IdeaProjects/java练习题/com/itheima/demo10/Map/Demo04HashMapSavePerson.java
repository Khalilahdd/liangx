package com.itheima.demo10.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap存储自定义类型键值
    Map集合保证key是唯一的：
        作为key元素，必须重写hashCode方法和equals方法，以保证key唯一
 */
public class Demo04HashMapSavePerson {

    public static void main(String[] args) {
        //show01();
        show02();
    }

    /*
        HashMap存储自定义类型键值
        key：Person类型
            Person类就必须重写hashCode方法和equals方法，可以保证key唯一
        value：String类型
            可以重复
     */
    private static void show02() {
        //创建HashMap集合
        HashMap<Person,String> map = new HashMap<>();
        //往集合中添加元素
        map.put(new Person("女王",18),"英国");
        map.put(new Person("秦始皇",18),"秦国");
        map.put(new Person("普京",50),"俄罗斯");
        map.put(new Person("女王",18),"毛里求斯");
        //使用entrySet和增强for遍历Map集合
        Set<Map.Entry<Person,String>> set = map.entrySet();
        for (Map.Entry<Person,String> entry: set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-->" + value);//Person{name='女王', age=18}-->毛里求斯 Person{name='秦始皇', age=18}-->秦国 Person{name='普京', age=50}-->俄罗斯
        }
    }

    /*
        HashMap存储自定义类型键值
        key：String类型
            String类重写hashCode方法和equals方法，可以保证key唯一
        value：Person类型
            value可以重复（同名同年龄的人视为同一个）
    */
    private static void show01() {
        //创建HashMap集合
        HashMap<String, Person> map = new HashMap<>();
        //玩集合中添加元素
        map.put("北京",new Person("张三",19));
        map.put("上海",new Person("李四",18));
        map.put("广州",new Person("王五",20));
        map.put("北京",new Person("赵六",19));

        //使用keySet加上增强for遍历key集合
        Set<String> set = map.keySet();
        for (String key: set) {
            Person value = map.get(key);
            System.out.println(key + "-->" + value);//
        }
    }
}
