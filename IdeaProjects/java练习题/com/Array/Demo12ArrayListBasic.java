package com.Array;

import java.util.ArrayList;

/*
如果希望向集合ArrayList当中存储基本类型的数据，必须使用基本类型对应的“包装类”

基本类型        包装类
byte            Byte
short           Short
int             Integer
long            Long
float           Float
double          Double
char            Character
boolean         Boolean

从jdk1.5开始，支持自动装箱，自动拆箱

自动装箱：基本类型 --> 包装类型
自动拆箱：包装类型 --> 基本类型
 */
public class Demo12ArrayListBasic {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        //错误的写法，泛型只能是引用类型，不能是基本类型
//        ArrayList<int> list1 = new ArrayList<int>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        System.out.println(list1);

        int num = list1.get(1);
        System.out.println("第一号元素是： " + num);
    }
}
