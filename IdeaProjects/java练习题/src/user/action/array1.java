package src.user.action;

//编译器自己计算长度
public class array1 {
    public static void main(String[] args) {
       /* int[] ns = new int[] {68,79,91,85,62};
        System.out.println(ns.length);*/
       /**该结果看上去长度是变小了，其实是没有变，因为ns刚开始是指向数组长度为5的，
        *后面是ns指向数组长度为3的数组，但是原先的5个元素的数组并没有改变，只是无法通过变量ns
        * 引用他们而已*/
       int[] ns;
       ns = new int[] {68,79,91,85,62};
        System.out.println(ns.length);
        ns = new int[] {1,2,3};
        System.out.println(ns.length);
    }
}
