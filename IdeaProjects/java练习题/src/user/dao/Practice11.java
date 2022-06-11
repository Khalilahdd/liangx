package src.user.dao;

//使用for循环计算π的值
public class Practice11 {
    public static void main(String[] args) {
        System.out.print("练习3:");
        double pi = 0;
        double c = -1;
        for(double i = 1;i <= 99999999;i++)
        {
            //TODO
            c *= -1;
            pi += 4/(i*c);
        }
        System.out.println(pi);
    }
}
