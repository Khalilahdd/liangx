package com.packer;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main_37 {
    public static void main(String[] args) {
        Queue<User> q = new PriorityQueue<>(new UserComparator());
        //添加三个元素到队列：
        q.offer(new User("Bob","A1"));
        q.offer(new User("Alice","A2"));
        q.offer((new User("Boss","v1")));
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
    }
}
class UserComparator implements Comparator<User> {
    public int compare(User u1,User u2) {
        if(u1.number.charAt(0) == u2.number.charAt(0)){
            //如果两个人的号都是A开头或者V开头，比较号的大小
            return u1.number.compareTo(u2.number);
        }
        if(u1.number.charAt(0) == 'v') {
            //u1的号码是v开头，优先级高
            return -1;
        }else {
            return 1;
        }
    }
}
class User {
    public final String name;
    public final String number;
    public User(String name,String number) {
        this.name = name;
        this.number = number;
    }
    public String toString() {
        return name + "/" + number;
    }
}