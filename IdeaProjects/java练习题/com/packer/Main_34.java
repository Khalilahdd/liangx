package com.packer;

import java.util.LinkedList;
import java.util.Queue;

public class Main_34 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        //添加3个元素到队列：
        q.offer("apple");
        q.offer("pear");
        q.offer("banana");
        //从队列取出元素：
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
    }
}
