package com.itcast.ruflect;

import com.itcast.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo04 {
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
            3.获取成员方法们
                Method[] getMethods()
                Method getMethod(String name,类<?>...parameterTypes)

                Method[] getDeclareMethods()
                Method  getDeclareMethods(String name,类<?>....parameterTypes)
         */

        //获取指定名称的方法
        Method eat_method = personClass.getMethod("eat");
        Person p = new Person();
        //执行方法
        eat_method.invoke(p);

        Method eat_method2 = personClass.getMethod("eat", String.class);
        //执行方法
        eat_method2.invoke(p,"饭");

        System.out.println("-----------------");

        //获取所以public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
            //method.setAccessible(true);//暴力反射
        }

        //获取类名
        String className = personClass.getName();
        System.out.println(className);
    }
}
