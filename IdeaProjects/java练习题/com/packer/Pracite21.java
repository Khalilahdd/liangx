package com.packer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pracite21 {
    public static void main(String[] args) {
        //构造start到end的序列
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for(int i = start;i <= end;i++) {
            list.add(i);
        }
        //洗牌算法shuffle可以随机交换List中的元素位置:
        Collections.shuffle(list);
        //随机删除List中的一个元素：
        int removed = list.remove((int)(Math.random()*list.size()));
        int found = findMissingNumber(start,end,list);
        System.out.println(list.toString());
        System.out.println("missing number:" + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }

    private static int findMissingNumber(int start, int end, List<Integer> list) {
        int sum = (start + end) * (end - start + 1)/2;
        for(Integer i : list) {
            sum -= i;

        }
        return sum;
    }
}
