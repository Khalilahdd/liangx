package com.packer;

import java.util.Deque;
import java.util.LinkedList;

public class Main_38 {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offerLast("A");//A
        deque.offerLast("B");//B->A
        deque.offerFirst("C");//B->A->C
        System.out.println(deque.pollFirst());//C
        System.out.println(deque.pollLast());//B
        System.out.println(deque.pollFirst());//A
        System.out.println(deque.pollFirst());//null
    }
}
