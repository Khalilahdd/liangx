package com.Array;

import java.util.ArrayList;

/*
* 数组的长度不可以发生改变
* 但是ArrayList集合的长度可以任意改变
*
* 对于ArrayList来说，有一个尖括号<E>代表泛型
* 泛型，也就是装在集合当中的所以元素，全都是统一的什么类型
* 注意，泛型只能引用类型，不能是基本类型
*
* 注意事项：
* 对于ArrayList集合来说，直接打印得到的不是地址值，而是内容。
* 如果内容为空，得到的是空的中括号[]
*/
public class Demo09ArrayList {

    public static void main(String[] args) {
        //创建一个ArrayList集合，集合名称为list，里面装的都是String字符串类型的数据
        //备注，从jdk1.7+开始，右侧的尖括号可以不写内容，但是<>本身还是要写的。
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //向集合当中添加一些数据，需要用到add方法
        list.add("臭妹妹");
        System.out.println(list);

        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("佟丽娅");
        System.out.println(list);
    }
}
