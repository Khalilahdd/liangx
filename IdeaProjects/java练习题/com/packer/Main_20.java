package com.packer;

public class Main_20 {
    public static void main(String[] args) {
        Pair3<Integer> p = new Pair3<>(123,456);
        Pair3<?> p2 = p;
        System.out.println(p2.getFirst() + ", " + p2.getLast());
    }
}
class Pair3<T> {
    private T first;
    private T last;
    public Pair3(T first,T last) {
        this.first = first;
        this.last = last;
    }
    public T getFirst(){
        return first;
    }
    public T getLast() {
        return last;
    }
    public void setFirst(T first) {
        this.first = first;
    }
    public void serLast(T last) {
        this.last = last;
    }
}