package com.packer;
/**PriorityQueue是判断优先的函数，但是它必须实现Comparable接口*/
import java.util.PriorityQueue;
import java.util.Queue;

public class Main_36 {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        //添加三个元素到队列
        q.offer("apple");
        q.offer("pear");
        q.offer("banana");
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
    }
}
