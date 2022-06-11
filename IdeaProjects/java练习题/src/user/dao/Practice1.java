package src.user.dao;

//计算一元二次方程
public class Practice1 {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;
        //求平方根可用Math.sqrt();
        //TODO
        double r1 = 0;
        double r2 = 0;
        //下面两条语句是计算一元二次方程的两个跟
        r1 = (-b + Math.sqrt(b*b-4*a*c))/2*a;
        r2 = (-b - Math.sqrt(b*b-4*a*c))/2*a;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");
    }
}
