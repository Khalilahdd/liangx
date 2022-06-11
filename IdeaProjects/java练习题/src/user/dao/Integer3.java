package src.user.dao;

//类型自动提升与强制转换
public class Integer3 {
    public static void main(String[] args) {
        int i1 = 1234567;
        short s1 = (short)i1;
        System.out.println(s1);
        int i2 = 12345678;
        short s2 = (short)i2;
        System.out.println(s2);
    }
}
