package src.user.dao;//使用while循环，计算从m到n的和
import java.util.Scanner;
public class Practice7 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("计算从m到n的和\n");
        System.out.print("请输入m的值：");
        int m = scanner.nextInt();
        System.out.print("请输入n的值：");
        int n = scanner.nextInt();
       /* int m = 20;
        int n = 100;*/
        while(m <= n)
        {
           sum = sum + m;
           m++;
        }
        System.out.println(sum);
    }
}
