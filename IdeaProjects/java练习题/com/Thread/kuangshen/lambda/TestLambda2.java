package com.Thread.kuangshen.lambda;

public class TestLambda2 {



    public static void main(String[] args) {

//         class Love implements ILove{
//
//            @Override
//            public void love(int a) {
//                System.out.println("I love you-->"+a);
//            }
//        }
        ILove love = null;

//        //1.lambda表示简化
//        ILove love = (int a) -> {
//                System.out.println("I love you-->"+a);
//
//        };

//        //简化1.参数类型
//        love = (a) ->{
//            System.out.println("I love you-->"+a);
//        };

        //简化2.简化括号
        love = a -> {
            System.out.println("I love you-->"+a);
            System.out.println("I love you-->t00");
        };

        //简化3.去掉花括号
        love = a -> System.out.println("I love you-->"+a);

        /*
            总结：
                1.lambda表达式只能有一行代码的情况下才能简化为一行，如果有多行，那么就用代码块包裹
                2.前提接口是函数式接口
                3.多个参数也可以去掉参数类型，要去掉都去掉，必须加上括号
         */

        love.love(520);
    }
}

interface ILove{

    void love(int a);
}

//class Love implements ILove{
//
//    @Override
//    public void love(int a) {
//        System.out.println("I love you-->"+ a);
//    }
//}
