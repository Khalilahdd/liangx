package com.unusual.demo01.Exception;

import java.util.Objects;

/*
        Object类中的静态方法：
        public static <T> T requireNonNULL(T obj)：查看指定引用对象不是null
        源码:
            public static <T> T requireNonNull(T obj) {
                if (obj == null)
                    throw new NullPointerException();
                return obj;
            }
     */
public class Demo04Object {

        public static void main(String[] args) {
            method(null);
        }

        public static void method(Object obj) {
            //对传递过来的参数进行合法性判断，判断是否为null
//            if (obj == null){
//                throw new NullPointerException("传递的对象的值是null");
//            }
            //Objects.requireNonNull(obj);
            Objects.requireNonNull(obj,"传递的对象的值是null");
        }
}
