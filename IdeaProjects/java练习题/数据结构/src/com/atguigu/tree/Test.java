package com.atguigu.tree;

import java.util.ArrayList;

public class Test {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        //以ArrayList为例，看看底层是怎么进行数组扩容的
        @SuppressWarnings("rawtyres")
        //ArrayList 维护了数组transient Object[] elementData;
        /*
            ArrayList底层仍然是进行数组扩容
         */
        ArrayList arrayList = new ArrayList();

    }
}
