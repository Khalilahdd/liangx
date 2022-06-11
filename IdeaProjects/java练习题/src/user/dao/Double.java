package src.user.dao;

//浮点数运算误差
public class Double {
    public static void main(String[] args) {
        double x = 1.0 / 10;
        double y = 1 - 9.0 / 10;
        //观察x和y是否相等
        System.out.println(x);
        System.out.println(y);
        //由于浮点型存在运算误差，所以两个浮点数是否相等常常会出现错误的结果
    }
}
