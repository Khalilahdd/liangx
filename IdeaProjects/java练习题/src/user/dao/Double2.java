package src.user.dao;

//四舍五入
public class Double2 {
    public static void main(String[] args) {
        double d = 2.6;
        //原本d+0.5的值为3.1,但是其被强制转换成int类型的，所以小数点后面的就没有显示出来
        int n = (int)(d + 0.5);
        System.out.println(n);
    }
}
