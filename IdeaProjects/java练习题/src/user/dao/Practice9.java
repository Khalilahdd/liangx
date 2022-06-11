package src.user.dao;

//使用for循环倒序输出没一个元素
public class Practice9 {
    public static void main(String[] args) {
        int[] ns = new int[]{1,4,9,16,25};
        System.out.print("练习1；");
        for(int i = ns.length-1; i >= 0; i--)
        {
            System.out.println( ns[i]);
        }
    }
}
