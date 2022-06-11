package com.itheima.demo09.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    java.util.Collections是集合工具类，用来对集合进行操作，部分方法如下:
        public static <T> void sort(List<T> list,Comparator<? super T>):将集合中元素按照指定规则排序

    Comparator和Comparable的区别
        Comparable：自己（this）和别人（参数）比较，自己需要实现Comparable接口，重写比较的规则compareTo方法
        Comparator：相当于找一个第三方的裁判，比较两个
 */
public class Demo03Sort {

    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01);//[1, 3, 2]

        Collections.sort(list01, new Comparator<Integer>() {
            //重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
                //return o1 - o2;//升序
                return o2 - o1;//降序
            }
        });
        System.out.println(list01);//[1, 2, 3]  //[3, 2, 1]

        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("迪丽热巴",20));
        list02.add(new Student("古力娜扎",19));
        list02.add(new Student("佟丽娅",21));
        list02.add(new Student("佟丽娅",20));
        System.out.println(list02);//[Student{name='迪丽热巴', age=20}, Student{name='古力娜扎', age=19}, Student{name='佟丽娅', age=21}]

//        Collections.sort(list02, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                //按照年龄升序排序
//                return o1.getAge() - o2.getAge();
//            }
//        });

        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按照年龄升序排序
                int result = o1.getAge() - o2.getAge();
                //如果两个人的年龄相同,在使用姓名的第一个字比较
                if (result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list02);//[Student{name='古力娜扎', age=19}, Student{name='迪丽热巴', age=20}, Student{name='佟丽娅', age=21}]
    }
}