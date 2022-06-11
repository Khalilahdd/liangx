package com.Thread.kuangshen.demo002;

/*
    静态代理模式总结：
        1.真实对象和代理对象都要实现同一个接口
        2.代理对象要代理真实角色
     好处:
        1.代理对象可以做很多真实对象做不了的事情。
        2.真实对象专注做自己的事情
 */
public class SracticProxy {

    public static void main(String[] args) {

        new Thread (() -> System.out.println("我爱你")).start();

        new WeddingCompany(new You()).HappyMarry();


        //You you = new You();//你要结婚

//        WeddingCompany weddingCompany = new WeddingCompany(new You());
//
//        weddingCompany.HappyMarry();
    }
}

interface Marry{
    /*
        人间四大喜事
            1.久旱逢甘霖
            2.他乡遇故知
            3.洞房花烛夜
            4.金榜题名时
     */

    void HappyMarry();
}

//真实对象，你去结婚
class You implements Marry{

    @Override
    public void HappyMarry() {
        System.out.println("秦老师要结婚了");
    }
}

//代理对象，帮助你结婚
class WeddingCompany implements Marry{

    //代理谁--> 真实目标角色
    private Marry target;

    public WeddingCompany (Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();//这就是真实对象
        after();
    }

    private void after() {
        System.out.println("结婚之后，收尾款");
    }

    private void before() {
         System.out.println("结婚之前，布置现场");
    }
}
