package com.data_structure;

public class MyStack {
    private int maxSize;
    private long[] stackArray;
    private int top;
    public MyStack(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }
    //进栈
    public void push(long j) {
        stackArray[++top] = j;
    }
    //出栈
    public long pop() {
        return stackArray[top--];
    }
    //取栈顶元素
    public long peek() {
        return stackArray[top];
    }
    //判断栈是否为空
    public boolean isEmpty() {
        return (top == -1);
    }
    //判断栈中有几个元素
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    public static void main(String[] args) {
        MyStack theStack = new MyStack(10);
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
