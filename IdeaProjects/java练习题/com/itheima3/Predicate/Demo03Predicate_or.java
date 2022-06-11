package com.itheima3.Predicate;

import java.util.function.Predicate;

/*
    需求：判断一个字符串，有两个判断非条件
        1.判断字符串的长度是否大于5
        2.判断字符串中是否包含a
    满足一个条件，我们就可以使用||运算符连接两个条件

    Predicate接口中有一个方法or，表示或者关系，也可以用于连接两个判断条件
    default Predicate<T> and ()Predicate<? super T> other) {
            Object.requireNonNull(other)
            return (t) -> test(t) || other.test(t);
        }
        方法内部的两个判断条件，也是使用||运算符连接起来的
 */
public class Demo03Predicate_or {

    /*
    定义一个方法，方法的参数传递一个字符串
    传递两个Predicate接口
        一个用于判断字符串的长度是否大于5
        一个用于判断字符串中是否包含a
        两个条件必须同时满足
 */
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.test(s) || pre2.test(s);
        //return pre1.or(pre2).test(s);//等价于return pre1.test(s) || pre2.test(s);
    }

    public static void main(String[] args) {
        //定义一个字符串
        String s = "bcdefg";
        //调用checkString方法，参数传递字符串和两个Lambda表达式
        boolean b = checkString(s,(String str)->{
                    //判断字符串长度是否大于5
                    return str.length() > 5;
                },
                (String str)->{
                    //判断字符串中是否包含a
                    return str.contains("a");
                });
        System.out.println(b);
    }
}
