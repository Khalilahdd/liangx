package com.itheima.demo05.List;

import java.util.LinkedList;

/*
    java.util.LinkedList集合 implements List接口
    LinkedList集合的特点：
        1.底层是一个链表结果，查询慢，增删快
        2.里边包含一个了大量操作首尾元素的方法
        注意：使用LinkedList集合特有的方法，不能使用多态

    - public void addFirst(E e):将指定元素插入此列表的开头
    - public void addlast(E e):将指定元素添加到此列表的结尾
    - public void push():将元素推入此列表的堆栈

    - public E getFirst():返回此列表的第一个元素
    - public E getlast():返回此列表的最后一个元素

    - public E removeFirst():删除并返回此列表的第一个元素
    - public E removelast():删除并返回此列表的最后一个元素
    - public E pop():从此列表所表示的堆栈处弹出一个元素

    - public boolean isEmpty():如果列表不包含元素，则返回true
 */
public class Demo02LinkedList {

    public static void main(String[] args) {
        //show01();
        //show02();
        show03();
    }

    /*
        - public E removeFirst():删除并返回此列表的第一个元素
        - public E removelast():删除并返回此列表的最后一个元素
        - public E pop():从此列表所表示的堆栈处弹出一个元素
     */
    private static void show03() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);//[a, b, c]

        String first = linked.removeFirst();
        System.out.println("被移除的第一个元素：" + first);//被移除的第一个元素：a
        String last = linked.removeLast();
        System.out.println("被移除的最后一个元素：" + last);//被移除的最后一个元素：c
        System.out.println(linked);//[b]
    }

    /*
        - public E getFirst():返回此列表的第一个元素
        - public E getlast():返回此列表的最后一个元素
     */
    private static void show02() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");

        //linked.clear();//清空集合中的元素，在获取集合中的元素就会抛出NoSuchElementException

        //public boolean isEmpty():如果列表不包含元素，则返回true
        if (!linked.isEmpty()){
            String first = linked.getFirst();
            System.out.println(first);//a
            String last = linked.getLast();
            System.out.println(last);//c
        }


    }

    /*
        - public void addFirst(E e):将指定元素插入此列表的开头
        - public void addlast(E e):将指定元素添加到此列表的结尾
        - public void push():将元素推入此列表的堆栈
     */
    private static void show01() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);//[a, b, c]

        //public void addFirst(E e):将指定元素插入此列表的开头
        //linked.addFirst("www");
        linked.push("www");
        System.out.println(linked);//[www, a, b, c]

        //public void addlast(E e):将指定元素添加到此列表的结尾,此方法等效于add方法
        linked.addLast(".com");
        System.out.println(linked);//[www, a, b, c, .com]
    }
}
