package src.user.dao;

//位运算
public class Integer2 {
    public static void main(String[] args) {
        int i = 167776589;//二进制码为00001010 00000000 00010001 01001101
        int n = 167776512;//二进制码为00001010 00000000 00010001 00000000
        System.out.println(i & n);
    }
}
