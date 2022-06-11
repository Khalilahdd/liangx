//格式化输出
public class printf1 {
    public static void main(String[] args) {
        /*double d = 12900000;
        System.out.println(d);*/
        //控制输出格式，保留小数点后几位
        /**double d = 3.1415926;
        System.out.printf("%.2f\n",d);
        System.out.printf("%.4f\n",d);*/


        int n = 12345000;
        System.out.printf("n = %d, hex = %08x",n,n);//注意，两个%占位符必须传入两个数
    }
}
