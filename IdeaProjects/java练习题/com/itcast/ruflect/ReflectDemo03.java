package com.itcast.ruflect;

import com.itcast.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo03 {
    /*
        Class对象功能：
        获取的功能：
            1.获取成员变量们
                Field[] getFields()
                Field[] getField(String name)

                Field[] getDeclaredFields()
                Field[] getDeclaredField(String name)
            2.获取构造方法们
                Constructor<?>[] getConstructors()
                Constructor<T> getConstructor(类<?>...parameterTypes)

                Constructor<T> getDeclaredConstructor(类<?>...parameterTypes)
                Constructor<?>[] getDeclaredConstructor()
            3.获取成员方法们
                Method[] getMethods()
                Method getMethod(String name,类<?>...parameterTypes)

                Method[] getDeclareMethods()
                Method  getDeclareMethods(String name,类<?>....parameterTypes)

            4.获取类名
                String getName()
     */

    public static void main(String[] args) throws Exception {

        //0.获取Person的Class对象
        Class personClass = Person.class;
        /*
            12.获取构造方法们
                Constructor<?>[] getConstructors()
                Constructor<T> getConstructor(类<?>...parameterTypes)

                Constructor<T> getDeclaredConstructor(类<?>...parameterTypes)
                Constructor<?>[] getDeclaredConstructor()
         */

        //Constructor<T> getConstructor(类<?>...parameterTypes)
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        //创建对象
        Object person = constructor.newInstance("张三", 23);
        System.out.println(person);

        System.out.println("-----------");

        Constructor constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        //创建对象
        Object person1 = constructor1.newInstance();
        System.out.println(person1);

        Object o = personClass.newInstance();
        System.out.println(o);

        //constructor1.setAccessible(true);//暴力反射
    }
}
