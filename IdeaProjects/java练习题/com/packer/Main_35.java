package com.packer;

import java.util.LinkedList;
import java.util.Queue;

public class Main_35{
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        //添加3个元素到队列：
        q.offer("apple");
        q.offer("pear");
        q.offer("banana");
        //队首永远都是apple，因为peek()不会删除它
        System.out.println(q.peek());
        System.out.println(q.peek());
        System.out.println(q.peek());
    }
}
