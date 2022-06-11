package com.lianxi;

import javax.print.DocFlavor;
import java.util.*;

public class ListTest {

    public static void main(String[] args) {

//        ArrayList list = new ArrayList();//创建一个数组
//        Scanner scanner = new Scanner(System.in);//创建自定义输入
//
//        for (int i = 0;i < 10;i++) {//循环输入十个数字
//            System.out.println("请输入第"+(i+1)+"个数");
//            int k = scanner.nextInt();
//            list.add(k);//将这十个数字依次添加到list中
//        }
//        Collections.sort(list);//调用java中的排序算法，对其进行排序
//        System.out.println("默认从小到大：" + list);
//        Collections.reverse(list);//反转
//        Iterator it= list.iterator();//创建一个迭代器
//        while (it.hasNext()) {//判断它是否有下一个元素
//            System.out.println(it.next());
//        }

        Set<Integer> set = new HashSet<Integer>();
        Scanner scanner = new Scanner(System.in);//创建自定义输入
        for (int i = 0;i < 10;i++) {//循环输入十个数字
            System.out.println("请输入第"+(i+1)+"个数");
            int k = scanner.nextInt();
            set.add(k);//将这十个数字依次添加到list中
        }
        List list = new ArrayList();
        for (Integer value: set) {
            list.add(value);
        }
        
        Collections.sort(list);//调用java中的排序算法，对其进行排序
        System.out.println("默认从小到大：" + list);
        Collections.reverse(list);//反转
        Iterator it= list.iterator();//创建一个迭代器
        while (it.hasNext()) {//判断它是否有下一个元素
            System.out.println(it.next());
        }
    }
}
