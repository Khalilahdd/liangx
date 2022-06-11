package com.packer;

public class Main_10 {
    public static void main(String[] args) {
        Pair2<Integer> p = new Pair2<>(123,456);
        int n = add(p);
        System.out.println(n);
    }
    static int add(Pair2<? extends Number> p) {
        Number first = p.getFirst();
        Number last = p.getLast();
        return first.intValue() + last.intValue();
    }
}
class Pair2<T> {
    private T first;
    private T last;
    public Pair2(T first,T last) {
        this.first = first;
        this.last = last;
    }
    public T getFirst() {
        return first;
    }
    public T getLast() {
        return last;
    }
}