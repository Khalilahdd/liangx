package src.user.dao;

//类型提升
public class Double1 {
    public static void main(String[] args) {
        int n = 5;
        //将整型n的类型提升为double型
        double b = 1.2 + 24.0 / n;
        System.out.println(b);
        //  double d = 1.2 + 24 / 5; 值为5.2
        // 在一个复杂的四则运算中，两个整数的运算不会出现自动提升的情况。
    }
}
